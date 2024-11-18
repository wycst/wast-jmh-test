package com.jmh.test.json.bean;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangy
 * @Date: 2022/6/30 21:18
 * @Description:
 */
public class EishayWriterTest {

    static String result = "{\"images\":[{\"height\":768,\"size\":\"LARGE\",\"title\":\"Javaone Keynote\",\"uri\":\"http://javaone.com/keynote_large.jpg\",\"width\":1024},{\"height\":240,\"size\":\"SMALL\",\"title\":\"Javaone Keynote\",\"uri\":\"http://javaone.com/keynote_small.jpg\",\"width\":320}],\"media\":{\"bitrate\":262144,\"duration\":18000000,\"format\":\"video/mpg4\",\"height\":480,\"persons\":[\"Bill Gates\",\"Steve Jobs\"],\"player\":\"JAVA\",\"size\":58982400,\"title\":\"Javaone Keynote\",\"uri\":\"http://javaone.com/keynote.mpg\",\"width\":640}}";
    static Object object;

    static {
        object = io.github.wycst.wast.json.JSON.parse(result);
        System.out.println(object);
    }

    static ObjectMapper mapper = new ObjectMapper();

    @Benchmark
    public void fastjson2(Blackhole bh) {
        bh.consume(com.alibaba.fastjson2.JSON.toJSONString(object));
    }

    @Benchmark
    public void wastjson(Blackhole bh) {
        bh.consume(io.github.wycst.wast.json.JSON.toJsonString(object));
    }


    public static void main(String[] args) throws RunnerException {

        Options options = new OptionsBuilder()
                .include(EishayWriterTest.class.getName())
                .mode(Mode.Throughput)
                .measurementTime(TimeValue.seconds(2))
                .timeUnit(TimeUnit.MILLISECONDS)
                .forks(1)
                .build();
        new Runner(options).run();
    }

}
