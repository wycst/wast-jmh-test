package com.jmh.test.json.bean;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class StringParseTest {
    static String str;
    static ObjectMapper mapper = new ObjectMapper();

    static {
        Map map = new HashMap();
        for (int i = 0; i < 40; i++) {
            map.put("key_" + i, "value_" + i);
        }
        str = JSON.toJSONString(map);
    }

    public StringParseTest() {
    }

    @Benchmark
    public void fastjson2(Blackhole bh) {
        bh.consume(
                JSON.parseObject(str, Map.class)
        );
    }

    @Benchmark
    public void jackson(Blackhole bh) throws JsonProcessingException {
        bh.consume(
                mapper.readValue(str, Map.class)
        );
    }

    @Benchmark
    public void wastjson(Blackhole bh) {
        bh.consume(
                io.github.wycst.wast.json.JSON.parseObject(str, Map.class)
        );
    }


    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(StringParseTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .warmupIterations(3)
                .forks(1)
                .build();
        new Runner(options).run();
    }
}
