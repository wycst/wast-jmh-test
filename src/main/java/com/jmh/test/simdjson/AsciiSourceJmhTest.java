package com.jmh.test.simdjson;

import io.github.wycst.wast.json.JSON;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import org.simdjson.JsonValue;
import org.simdjson.SimdJsonParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2024/11/27 11:51
 * @Created by wangyc
 */
public class AsciiSourceJmhTest {
    final static byte[] buffer;
    final static SimdJsonParser simdJsonParser = new SimdJsonParser();

    static {
        try {
            int length = 100000;
            StringBuilder value = new StringBuilder("a".repeat(length));
            Map map = new HashMap();
            map.put("a", value);
            map.put("b", value);
            map.put("c", value);
            map.put("d", value);
            map.put("e", value);
            map.put("f", value);
            map.put("g", value);
            map.put("h", value);
            map.put("i", value);
            map.put("j", value);
            map.put("k", value);
            map.put("l", value);
            map.put("m", value);
            map.put("n", value);
            map.put("o", value);
            buffer = io.github.wycst.wast.json.JSON.toJsonBytes(map);
            System.out.println("data size: " + (buffer.length >> 10) + "kb");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Benchmark
    public long ascii_WastJson() {
        long result = 0;
        Map map = (Map) JSON.parse(buffer);
        result += map.get("a").toString().length();
        result += map.get("b").toString().length();
        result += map.get("c").toString().length();
        result += map.get("d").toString().length();
        result += map.get("e").toString().length();
        result += map.get("f").toString().length();
        result += map.get("g").toString().length();
        result += map.get("h").toString().length();
        result += map.get("i").toString().length();
        result += map.get("j").toString().length();
        result += map.get("k").toString().length();
        result += map.get("l").toString().length();
        result += map.get("m").toString().length();
        result += map.get("n").toString().length();
        result += map.get("o").toString().length();
        return result;
    }

    @Benchmark
    public long ascii_SimdjsonJava() {
        long result = 0;
        JsonValue simdJsonValue = simdJsonParser.parse(buffer, buffer.length);
        result += simdJsonValue.get("a").asString().length();
        result += simdJsonValue.get("b").asString().length();
        result += simdJsonValue.get("c").asString().length();
        result += simdJsonValue.get("d").asString().length();
        result += simdJsonValue.get("e").asString().length();
        result += simdJsonValue.get("f").asString().length();
        result += simdJsonValue.get("g").asString().length();
        result += simdJsonValue.get("h").asString().length();
        result += simdJsonValue.get("i").asString().length();
        result += simdJsonValue.get("j").asString().length();
        result += simdJsonValue.get("k").asString().length();
        result += simdJsonValue.get("l").asString().length();
        result += simdJsonValue.get("m").asString().length();
        result += simdJsonValue.get("n").asString().length();
        result += simdJsonValue.get("o").asString().length();
        return result;
    }


    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(AsciiSourceJmhTest.class.getName())
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
