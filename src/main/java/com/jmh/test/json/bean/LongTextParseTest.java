package com.jmh.test.json.bean;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.wycst.wast.json.options.WriteOption;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangy
 * @Date: 2022/6/3 8:45
 * @Description:
 */
public class LongTextParseTest {

    static ObjectMapper mapper = new ObjectMapper();

    private static String simpleResult;
    private static String simplePrettyResult;
    private static String complexResult;
    private static String complexPrettyResult;

    static {
        int length = 10000;
        StringBuffer value = new StringBuffer();
        for (int i = 0; i < length; i++) {
            value.append("a");
        }
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
        map.put("p", value);
        map.put("q", value);
        map.put("r", value);

        simpleResult = io.github.wycst.wast.json.JSON.toJsonString(map);
        simplePrettyResult = io.github.wycst.wast.json.JSON.toJsonString(map, WriteOption.FormatOut);

        // 随机添加10个转义字符
        for (int j = 1; j < 32; j++) {
            int index = ((int) (Math.random() * 10000)) % length;
            value.setCharAt(index, (char) j);
        }
        complexResult = io.github.wycst.wast.json.JSON.toJsonString(map);
        complexPrettyResult = io.github.wycst.wast.json.JSON.toJsonString(map, WriteOption.FormatOut);

        Map map1 = JSON.parseObject(complexResult, LinkedHashMap.class);
        Map map2 = io.github.wycst.wast.json.JSON.parseObject(complexResult, LinkedHashMap.class);
        Map map3 = JSON.parseObject(complexPrettyResult, LinkedHashMap.class);
        Map map4 = io.github.wycst.wast.json.JSON.parseObject(complexPrettyResult, LinkedHashMap.class);
        System.out.println(JSON.toJSONString(map1).equals(JSON.toJSONString(map2)));
        System.out.println(JSON.toJSONString(map3).equals(JSON.toJSONString(map4)));

    }

    @Benchmark
    public void simpleFastjson2(Blackhole bh) {
        bh.consume(JSON.parseObject(simpleResult, Map.class));
    }

    @Benchmark
    public void simpleJackson(Blackhole bh) throws Exception {
        bh.consume(mapper.readValue(simpleResult, Map.class));
    }

    @Benchmark
    public void simpleWastjson(Blackhole bh) {
        bh.consume(io.github.wycst.wast.json.JSON.parseObject(simpleResult, Map.class));
    }

    @Benchmark
    public void simplePrettyFastjson2(Blackhole bh) {
        bh.consume(JSON.parseObject(simplePrettyResult, Map.class));
    }

    @Benchmark
    public void simplePrettyJackson(Blackhole bh) throws Exception {
        bh.consume(mapper.readValue(simplePrettyResult, Map.class));
    }

    @Benchmark
    public void simplePrettyWastjson(Blackhole bh) {
        bh.consume(io.github.wycst.wast.json.JSON.parseObject(simplePrettyResult, Map.class));
    }

    @Benchmark
    public void complexFastjson2(Blackhole bh) {
        bh.consume(JSON.parseObject(complexResult, Map.class));
    }

    @Benchmark
    public void complexJackson(Blackhole bh) throws Exception {
        bh.consume(mapper.readValue(complexResult, Map.class));
    }

    @Benchmark
    public void complexWastjson(Blackhole bh) {
        bh.consume(io.github.wycst.wast.json.JSON.parseObject(complexResult, Map.class));
    }

    @Benchmark
    public void complexPrettyFastjson2(Blackhole bh) {
        bh.consume(JSON.parseObject(complexPrettyResult, Map.class));
    }

    @Benchmark
    public void complexPrettyJackson(Blackhole bh) throws Exception {
        bh.consume(mapper.readValue(complexPrettyResult, Map.class));
    }

    @Benchmark
    public void complexPrettyWastjson(Blackhole bh) {
        bh.consume(io.github.wycst.wast.json.JSON.parseObject(complexPrettyResult, Map.class));
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(LongTextParseTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.SECONDS)
                .forks(1)
                .build();
        new Runner(options).run();

    }


}
