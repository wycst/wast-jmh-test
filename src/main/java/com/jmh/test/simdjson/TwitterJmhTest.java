package com.jmh.test.simdjson;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import io.github.wycst.wast.common.utils.IOUtils;
import io.github.wycst.wast.json.JSONNode;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import org.simdjson.JsonValue;
import org.simdjson.SimdJsonParser;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @Date 2024/11/24 15:46
 * @Created by wangyc
 */
public class TwitterJmhTest {

    final static byte[] buffer;
    final static SimdJsonParser simdJsonParser = new SimdJsonParser();

    static {
        try {
            buffer = IOUtils.readBytes(TwitterJmhTest.class.getResourceAsStream("/data/json/twitter.json"));
            System.out.println("data size: " + (buffer.length >> 10) + "kb");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    @Benchmark
//    public int parseAndSelect_Fastjson2() {
//        JSONObject jsonObject = (JSONObject) JSON.parse(buffer);
//        Set<String> defaultUsers = new HashSet<>();
//        Iterator<Object> tweets = jsonObject.getJSONArray("statuses").iterator();
//        while (tweets.hasNext()) {
//            JSONObject tweet = (JSONObject) tweets.next();
//            JSONObject user = (JSONObject) tweet.get("user");
//            if (user.getBoolean("default_profile")) {
//                defaultUsers.add(user.getString("screen_name"));
//            }
//        }
//        return defaultUsers.size();
//    }
//
//    @Benchmark
//    public int schemaBasedParseAndSelect_Fastjson2() {
//        Set<String> defaultUsers = new HashSet<>();
//        SimdJsonTwitter twitter = JSON.parseObject(buffer, SimdJsonTwitter.class);
//        for (SimdJsonStatus status : twitter.statuses) {
//            SimdJsonUser user = status.user;
//            if (user.default_profile) {
//                defaultUsers.add(user.screen_name);
//            }
//        }
//        return defaultUsers.size();
//    }

    @Benchmark
    public int parseAndSelect_WastJson() {
        List<JSONNode> users = JSONNode.collect(buffer, "/statuses/*/user");
        Set<String> defaultUsers = new HashSet<>();
        for (JSONNode user : users) {
            if (user.getChildValue("default_profile", boolean.class)) {
                defaultUsers.add(user.getChildValue("screen_name", String.class));
            }
        }
        return defaultUsers.size();
    }

    @Benchmark
    public int schemaBasedParseAndSelect_WastJson() {
        Set<String> defaultUsers = new HashSet<>();
        SimdJsonTwitter twitter = io.github.wycst.wast.json.JSON.parseObject(buffer, SimdJsonTwitter.class);
        for (SimdJsonStatus status : twitter.statuses) {
            SimdJsonUser user = status.user;
            if (user.default_profile) {
                defaultUsers.add(user.screen_name);
            }
        }
        return defaultUsers.size();
    }

    @Benchmark
    public int parseAndSelect_SimdjsonJava() {
        JsonValue simdJsonValue = simdJsonParser.parse(buffer, buffer.length);
        Set<String> defaultUsers = new HashSet<>();
        Iterator<JsonValue> tweets = simdJsonValue.get("statuses").arrayIterator();
        while (tweets.hasNext()) {
            JsonValue tweet = tweets.next();
            JsonValue user = tweet.get("user");
            if (user.get("default_profile").asBoolean()) {
                defaultUsers.add(user.get("screen_name").asString());
            }
        }
        return defaultUsers.size();
    }

    @Benchmark
    public int schemaBasedParseAndSelect_SimdjsonJava() {
        Set<String> defaultUsers = new HashSet<>();
        SimdJsonTwitter twitter = simdJsonParser.parse(buffer, buffer.length, SimdJsonTwitter.class);
        for (SimdJsonStatus status : twitter.statuses()) {
            SimdJsonUser user = status.user();
            if (user.default_profile()) {
                defaultUsers.add(user.screen_name());
            }
        }
        return defaultUsers.size();
    }

    record SimdJsonUser(boolean default_profile, String screen_name) {

    }

    record SimdJsonStatus(SimdJsonUser user) {

    }

    record SimdJsonTwitter(List<SimdJsonStatus> statuses) {

    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(TwitterJmhTest.class.getName())
                .mode(Mode.Throughput)
                .warmupIterations(1)
                .warmupTime(TimeValue.seconds(3))
                .measurementTime(TimeValue.seconds(3))
                .forks(1)
                .threads(1)
                .build();
        new Runner(options).run();
    }
}
