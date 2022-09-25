package com.jmh.test.json.bean;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @Author: wangy
 * @Date: 2022/9/24 21:22
 * @Description:
 */
public class NormalJmhTest {

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(DateParseTest.class.getName())
                .include(EishayParseTest.class.getName())
                .include(NumberValueBeanTest.class.getName())
                .include(SimpleBeanTest.class.getName())
                .include(SmallTextParseTest.class.getName())
                .include(SimpleBeanWriteTest.class.getName())
                .include(EishayWriterTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .forks(1)
                .build();
        new Runner(options).run();
    }

}
