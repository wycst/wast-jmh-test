package com.jmh.test.json.bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.wycst.wast.common.utils.StringUtils;
import io.github.wycst.wast.json.JSONReader;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.*;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangy
 * @Date: 2022/6/3 9:40
 * @Description:
 */
public class ReadInputStreamTest {

    static ObjectMapper mapper = new ObjectMapper();

//    @Benchmark
//    public void fastjson2(Blackhole bh) throws FileNotFoundException {
//        com.alibaba.fastjson2.JSONReader.of(new FileReader("e:/tmp/sf-city-lots-json-master/citylots.json")).readObject();
//    }

    @Benchmark
    public void wastjson(Blackhole bh) {
        File f = new File("e:/tmp/sf-city-lots-json-master/citylots.json");
        JSONReader.from(f).read();
    }

    @Benchmark
    public void jackson(Blackhole bh) throws IOException {
        mapper.readValue(new FileInputStream("e:/tmp/sf-city-lots-json-master/citylots.json"), Map.class);
    }

    public static void main(String[] args) throws RunnerException, IOException {
        Options options = new OptionsBuilder()
                .include(ReadInputStreamTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MINUTES)
                .forks(1)
                .build();
        new Runner(options).run();
    }


}
