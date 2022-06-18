package com.jmh.test.json.bean;

import com.fasterxml.jackson.databind.ObjectMapper;
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
 * 超文本解析测试（180MB）
 * <p>文件下载地址： https://codeload.github.com/zemirco/sf-city-lots-json/zip/refs/heads/master
 *
 * @Author: wangy
 * @Date: 2022/6/3 8:56
 * @Description:
 */
public class SuperLongText {

    private static String result;
    static ObjectMapper mapper = new ObjectMapper();
    static {
        // download addr: https://codeload.github.com/zemirco/sf-city-lots-json/zip/refs/heads/master
        File file = new File("e:/tmp/sf-city-lots-json-master/citylots.json");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line = null;
        StringBuilder buffer = new StringBuilder();
        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            buffer.append(line);
        }
        result = buffer.toString();
    }

    @Benchmark
    public void fastjson(Blackhole bh) {
        bh.consume(com.alibaba.fastjson.JSON.parseObject(result, Map.class));
    }

    @Benchmark
    public void fastjson2(Blackhole bh) {
        bh.consume(com.alibaba.fastjson2.JSON.parseObject(result, Map.class));
    }

    @Benchmark
    public void jackson(Blackhole bh) throws Exception {
        bh.consume(mapper.readValue(result, Map.class));
    }

    @Benchmark
    public void wastjson(Blackhole bh) {
        bh.consume(io.github.wycst.wast.json.JSON.parseObject(result, Map.class));
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(SuperLongText.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MINUTES)
                .forks(1)
                .build();
        new Runner(options).run();

    }

}
