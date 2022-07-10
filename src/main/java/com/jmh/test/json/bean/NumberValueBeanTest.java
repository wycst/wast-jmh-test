package com.jmh.test.json.bean;

import com.alibaba.fastjson2.JSON;
import io.github.wycst.wast.json.options.ReadOption;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangy
 * @Date: 2022/7/9 15:35
 * @Description:
 */
public class NumberValueBeanTest {

    static String result =  "{\"value1\":1234560,\"value2\":-1234561,\"value3\":1234562,\"value4\":-1234563}";
    static Random random = new Random();
    static {

        NumberValueBean numberValueBean = new NumberValueBean();
        numberValueBean.setValue1(random.nextInt());
        numberValueBean.setValue2(random.nextInt());
        numberValueBean.setValue3(random.nextLong());
        numberValueBean.setValue4(random.nextLong());
        numberValueBean.setValue5(random.nextFloat());
        numberValueBean.setValue6(random.nextFloat());
        numberValueBean.setValue7(random.nextDouble());
        numberValueBean.setValue8(random.nextDouble());
        numberValueBean.setValue9(123456.789e102);
        numberValueBean.setValue10(123456.789e-102);

        result = io.github.wycst.wast.json.JSON.toJsonString(numberValueBean);
        System.out.println(result);

        String r1 = JSON.toJSONString(JSON.parseObject(result, NumberValueBean.class));
        String r2 = JSON.toJSONString(io.github.wycst.wast.json.JSON.parseObject(result, NumberValueBean.class, ReadOption.UseNativeDoubleParser));
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.equals(r2));

    }


    @Benchmark
    public void fastjson2(Blackhole bh) {
        bh.consume(JSON.parseObject(result, NumberValueBean.class));
    }

    @Benchmark
    public void wastjson_pojo(Blackhole bh) {
        bh.consume(io.github.wycst.wast.json.JSON.parseObject(result, NumberValueBean.class));
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(NumberValueBeanTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .forks(1)
                .build();
        new Runner(options).run();

//        System.out.println(Double.parseDouble("0.9106004969175495"));
    }

}
