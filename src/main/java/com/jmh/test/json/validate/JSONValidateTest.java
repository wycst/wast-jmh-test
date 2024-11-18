package com.jmh.test.json.validate;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONPath;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jmh.test.json.path.JSONPathTest;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.objenesis.instantiator.util.UnsafeUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangy
 * @Date: 2022/6/12 5:40
 * @Description:
 */
public class JSONValidateTest {

    static String result;
    static ObjectMapper objectMapper = new ObjectMapper();

    static {
//        result = StringUtils.fromResource("data/json/path.json");
        // error json
        result = "{\n" +
                "  \"store\": \n{" +
                "    \"book\": [\n" +
                "      {\n" +
                "        \"category\": \"reference\",\n" +
                "        \"author\": \"Nigel Rees\",\n" +
                "        \"title\": \"Sayings of the Century\",\n" +
                "        \"price\": 8.95\n" +
                "      },\n" +
                "      {\n" +
                "        \"category\": \"fiction\",\n" +
                "        \"author\": \"Evelyn Waugh\",\n" +
                "        \"title\": \"Sword of Honour\",\n" +
                "        \"price\": 12.99\n" +
                "      },\n" +
                "      {\n" +
                "        \"category\": \"fiction\",\n" +
                "        \"author\": \"Herman Melville\",\n" +
                "        \"title\": \"Moby Dick\",\n" +
                "        \"isbn\": \"0-553-21311-3\",\n" +
                "        \"price\": 8.99\n" +
                "      },\n" +
                "      {\n" +
                "        \"category\": \"fiction\",\n" +
                "        \"author\": \"J. R. R. Tolkien\",\n" +
                "        \"title\": \"The Lord of the Rings\",\n" +
                "        \"isbn\": \"0-395-19395-8\",\n" +
                "        \"price\": 22.99\n" +
                "      }\n" +
                "    ],\n" +
                "    \"bicycle\": {\n" +
                "      \"color\": \"red\",\n" +
                "      \"price\": 19.95\n" +
                "    }\n" +
                "  },\n" +
                "  \"expensive\": 10\n" +
                "}\n";
    }

    @Benchmark
    public Object fastjsonValidate() {
        return JSON.isValid(result);
    }

    @Benchmark
    public Object wastjsonValidate() {
        return io.github.wycst.wast.json.JSON.validate(result);
    }

    public static void main(String[] args) throws IOException, RunnerException {
        System.out.println(io.github.wycst.wast.json.JSON.validate(result));
        System.out.println(JSON.isValid(result));
        Options options = new OptionsBuilder()
                .include(JSONValidateTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .forks(1)
                .build();
        new Runner(options).run();
    }


}
