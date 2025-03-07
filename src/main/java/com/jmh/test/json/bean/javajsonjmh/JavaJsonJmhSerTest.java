package com.jmh.test.json.bean.javajsonjmh;

import com.alibaba.fastjson2.JSON;
import com.dslplatform.json.DslJson;
import com.dslplatform.json.runtime.Settings;
import io.github.wycst.wast.common.utils.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Date 2024/4/17 22:27
 * @Created by wangyc
 */
public class JavaJsonJmhSerTest {

    static final DslJson<Object> dslJson = new DslJson<>(Settings.withRuntime().includeServiceLoader());
    static Clients clients;

    static {
        InputStream is = JavaJsonJmhSerTest.class.getClassLoader().getResourceAsStream("data/json/client.json");
        String clientJson = StringUtils.fromStream(is);
        clients = io.github.wycst.wast.json.JSON.parseObject(clientJson, Clients.class);
    }

    @Benchmark
    public void dsljson_ser_client(Blackhole bh) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dslJson.serialize(clients, byteArrayOutputStream);
        bh.consume(byteArrayOutputStream);
    }

    @Benchmark
    public void fastjson2_ser_client(Blackhole bh) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JSON.writeTo(byteArrayOutputStream, clients);
        bh.consume(byteArrayOutputStream);
    }


    @Benchmark
    public void wast_ser_client(Blackhole bh) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        io.github.wycst.wast.json.JSON.writeJsonTo(clients, byteArrayOutputStream);
        bh.consume(byteArrayOutputStream);
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(JavaJsonJmhSerTest.class.getName())
                .mode(Mode.Throughput)
                .warmupIterations(3)
                .forks(1)
                .threads(16)
                .build();
        new Runner(options).run();
    }
}
