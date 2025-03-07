package com.jmh.test.json.bean;

import com.alibaba.fastjson2.JSON;
import com.dslplatform.json.DslJson;
import com.dslplatform.json.runtime.Settings;
import com.jsoniter.JsonIterator;
import io.github.wycst.wast.common.utils.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

public class EishayParseString {
    static String str;
    private final static byte[] utf8Bytes;
    static final DslJson<Object> dslJson = new DslJson<>(Settings.withRuntime().includeServiceLoader());
    static  byte[] buf = "123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789,".getBytes();
    static {
        str = "{\"images\":[{\"height\":768,\"size\":\"LARGE\",\"title\":\"Javaone Keynote\",\"uri\":\"http://javaone.com/keynote_large.jpg\",\"width\":1024},{\"height\":240,\"size\":\"SMALL\",\"title\":\"Javaone Keynote\",\"uri\":\"http://javaone.com/keynote_small.jpg\",\"width\":320}],\"media\":{\"bitrate\":262144,\"duration\":18000000,\"format\":\"video/mpg4\",\"height\":480,\"persons\":[\"Bill Gates\",\"Steve Jobs\"],\"player\":\"JAVA\",\"size\":58982400,\"title\":\"Javaone Keynote\",\"uri\":\"http://javaone.com/keynote.mpg\",\"width\":640}}\n";
        utf8Bytes = str.getBytes();
    }

//    @Benchmark
//    public void dsljson(Blackhole bh) throws IOException {
//        bh.consume(dslJson.deserialize(MediaContent.class, utf8Bytes, utf8Bytes.length));
//        // zulu17.40.19 : 3560
//    }

//    @Benchmark
    public void fastjson2(Blackhole bh) {
//        bh.consume(JSON.parseObject(str, MediaContent.class));
        bh.consume(
                JSON.parseObject(str, MediaContent.class)
        );
    }

    @Benchmark
    public void wastjson(Blackhole bh) throws Exception {
        bh.consume(
                io.github.wycst.wast.json.JSON.parseObject(str, MediaContent.class)
        );
    }

    @Benchmark
    public void jsoniter_scala(Blackhole bh) throws Exception {
        bh.consume(
                JsonIterator.deserialize(str, MediaContent.class)
        );
    }

    public static void main(String[] args) throws RunnerException, ClassNotFoundException {
        MediaContent mediaContent = JsonIterator.deserialize(str, MediaContent.class);
//        System.exit(0);
        Options options = new OptionsBuilder()
                .include(EishayParseString.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .warmupIterations(3)
                .warmupTime(TimeValue.seconds(3))
                .measurementTime(TimeValue.seconds(3))
                .forks(1)
                .threads(1)
                .build();
        new Runner(options).run();
    }
}
