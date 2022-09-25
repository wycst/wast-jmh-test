package com.jmh.test.json.bean;

import com.alibaba.fastjson2.JSON;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

public class Date20Write {

    static DateBean2 object = new DateBean2();

    @Benchmark
    public void fastjson2(Blackhole bh) {
        bh.consume(
                JSON.toJSONString(object)
        );
    }

    @Benchmark
    public void wastjson(Blackhole bh) throws Exception {
        bh.consume(
                io.github.wycst.wast.json.JSON.toJsonString(object)
        );
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(Date20Write.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .warmupIterations(3)
                .forks(1)
                .build();
        new Runner(options).run();
    }
}
