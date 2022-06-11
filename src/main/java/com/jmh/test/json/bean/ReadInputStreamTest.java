package com.jmh.test.json.bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.wycst.wast.json.JSONReader;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangy
 * @Date: 2022/6/3 9:40
 * @Description:
 */
public class ReadInputStreamTest {

    private static String result;
    static ObjectMapper mapper = new ObjectMapper();

    static {
        InputStream is = ReadInputStreamTest.class.getClassLoader().getResourceAsStream("data/json/catalina.out.D06");
    }

    @Benchmark
    public void fastjson2(Blackhole bh) {
        com.alibaba.fastjson2.JSONReader.of(this.getClass().getClassLoader().getResourceAsStream("data/catalina.out.D06"), null).readObject();
    }

    @Benchmark
    public void wastjson(Blackhole bh) {
        new JSONReader(this.getClass().getClassLoader().getResourceAsStream("data/catalina.out.D06")).read();
    }

    @Benchmark
    public void jackson(Blackhole bh) throws IOException {
        mapper.readValue(this.getClass().getClassLoader().getResourceAsStream("data/catalina.out.D06"), Map.class);
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(ReadInputStreamTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MINUTES)
                .forks(1)
                .build();
        new Runner(options).run();

    }


}
