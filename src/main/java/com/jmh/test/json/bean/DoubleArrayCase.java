package com.jmh.test.json.bean;

import com.alibaba.fastjson2.JSON;
import com.jsoniter.JsonIterator;
import io.github.wycst.wast.json.JSONReader;
import io.github.wycst.wast.json.options.ReadOption;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DoubleArrayCase {

    static String str = "[3.791079149380462e223,-0.4906350024826803e123,0.8708787958930184e-123,0.13994531868334115e+123,0.559364652868464e+123,-3.791079149380462e223,3.791079149380462e223,3.791079149380462e223,3.791079149380462e223,3.791079149380462e223,3.791079149380462e223,3.791079149380462e223,3.791079149380462e223,3.791079149380462e223,3.791079149380462e223,3.791079149380462e223,-1444440.379107e123,3.791079149380462e223,1232323232323233.791079149380462e223,-1230.37910792e123]";
    static String str2 = "[0.3791079149380462,0.4906350024826803,0.8708787958930184,0.13994531868334115,0.559364652868464,0.6110396028709821,0.3580475397098247,0.7716686932898988,0.2039985832512755,0.5368924237774364,0.4622521960117668,0.7275588204161335,0.8958983411340866,0.28634777954915136,0.01438101480741183,0.6314747370672098,0.25408036197086703,0.7658148908957003,0.8239686267046319,0.02589098886190422]";
    static String str1 = "[3791079149380462,4906350024826803,8708787958930184,13994531868334115,559364652868464,6110396028709821,3580475397098247,7716686932898988,2039985832512755,5368924237774364,4622521960117668,7275588204161335,8958983411340866,28634777954915136,01438101480741183,6314747370672098,25408036197086703,7658148908957003,8239686267046319,02589098886190422]";

    @Benchmark
    public void wastjson(Blackhole bh) throws Exception {
        bh.consume(
                io.github.wycst.wast.json.JSON.parseObject(str, double[].class)
        );
    }

    @Benchmark
    public void fastjson2(Blackhole bh) {
        bh.consume(
                JSON.parseObject(str, double[].class)
        );
    }

    @Benchmark
    public void jsoniter_scala(Blackhole bh) throws Exception {
        bh.consume(
                JsonIterator.deserialize(str, double[].class)
        );
    }

    public static void main(String[] args) throws RunnerException, IOException {

        double[] doubles =  JsonIterator.deserialize(str, double[].class);
        // System.out.println(JSON.toJSONString(io.github.wycst.wast.json.JSON.read(new ByteArrayInputStream(str.getBytes()), Double[].class)));

        Options options = new OptionsBuilder()
                .include(DoubleArrayCase.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .warmupIterations(3)
                .warmupTime(TimeValue.seconds(3))
                .measurementTime(TimeValue.seconds(3))
                .forks(1)
                .threads(1)
                .build();
        new Runner(options).run();
    }


}
