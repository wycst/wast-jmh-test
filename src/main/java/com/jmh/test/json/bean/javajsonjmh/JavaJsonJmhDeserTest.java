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
import org.openjdk.jmh.runner.options.TimeValue;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/**
 * @Date 2024/4/17 22:27
 * @Created by wangyc
 */
public class JavaJsonJmhDeserTest {

    static final DslJson<Object> dslJson = new DslJson<>(Settings.withRuntime().includeServiceLoader());
    static String clientJson;
    static String userJson;
    static byte[] clientBytes;
    static byte[] userBytes;

    static {
        InputStream is = JavaJsonJmhDeserTest.class.getClassLoader().getResourceAsStream("data/json/client.json");
        clientJson = StringUtils.fromStream(is);
        clientBytes = clientJson.getBytes(StandardCharsets.UTF_8);

        is = JavaJsonJmhDeserTest.class.getClassLoader().getResourceAsStream("data/json/user.json");
        userJson = StringUtils.fromStream(is);
        userBytes = userJson.getBytes(StandardCharsets.UTF_8);
    }

    @Benchmark
    public void dsljson_deser_client(Blackhole bh) throws IOException {
        bh.consume(dslJson.deserialize(Clients.class, clientBytes, clientBytes.length));
    }

//    @Benchmark
//    public void dsljson_user(Blackhole bh) throws IOException {
//        bh.consume(dslJson.deserialize(Users.class, userBytes, userBytes.length));
//    }

    @Benchmark
    public void fastjson2_deser_client(Blackhole bh) throws IOException {
        bh.consume(JSON.parseObject(clientJson, Clients.class));
    }

//    @Benchmark
//    public void fastjson2_user(Blackhole bh) throws IOException {
//        bh.consume(JSON.parseObject(userJson, Users.class));
//    }


    @Benchmark
    public void wast_deser_client(Blackhole bh) throws IOException {
        bh.consume(io.github.wycst.wast.json.JSON.parseObject(clientJson, Clients.class));
    }

//    @Benchmark
//    public void wast_user(Blackhole bh) throws IOException {
//        bh.consume(io.github.wycst.wast.json.JSON.parseObject(userJson, Users.class));
//    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(JavaJsonJmhDeserTest.class.getName())
                .include(JavaJsonJmhSerTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.SECONDS)
                .warmupIterations(3)
                .warmupTime(TimeValue.seconds(5))
                .measurementTime(TimeValue.seconds(5))
                .forks(1)
                .threads(7)
                .build();
        new Runner(options).run();
    }
}
