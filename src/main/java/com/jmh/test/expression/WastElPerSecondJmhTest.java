package com.jmh.test.expression;

import io.github.wycst.wast.common.expression.CacheableExpression;
import io.github.wycst.wast.common.expression.Expression;
import io.github.wycst.wast.common.expression.compile.CompilerExpression;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.concurrent.TimeUnit;

/**
 * @Date 2024/10/23 17:38
 * @Created by wangyc
 */
public class WastElPerSecondJmhTest {
    final static String staticEl = "1+2";
    final static String dynamicsEl = "a+a+a+b+b";
    final static Expression wastParsedEl;
    final static Expression wastCompiledEl;
    final static Fact fact = new Fact();

    public static class Fact {
        public int a = 1;
        public int b = 2;
        public int c = 3;
    }

    static {
        wastParsedEl = Expression.parse(dynamicsEl);
        wastCompiledEl = CompilerExpression.createEnvironment()
                .objectParameterClass(Fact.class)
                .variableTypes(int.class, "a", "b")
                .compile(dynamicsEl);
    }

    @Benchmark
    public Object staticExpr() {
        return Expression.eval(staticEl);
    }

    @Benchmark
    public Object cacheableStaticExpr() {
        return CacheableExpression.eval(staticEl);
    }

    @Benchmark
    public Object dynamicsDirect() {
        return Expression.evalParameters(dynamicsEl, fact.a, fact.b);
    }

    @Benchmark
    public Object dynamicsParsedWithPojo() {
        return wastParsedEl.evaluate(fact);
    }

    @Benchmark
    public Object dynamicsParsedWithParameters() {
        return wastParsedEl.evaluateParameters(fact.a, fact.b);
    }

    @Benchmark
    public Object compileParameters() {
        return wastCompiledEl.evaluateParameters(fact.a, fact.b);
    }

    @Benchmark
    public Object compilePojo() {
        return wastCompiledEl.evaluate(fact);
    }

    @Benchmark
    public Object javaCode() {
        return fact.a + fact.a + fact.a + fact.b + fact.b;
    }

    public static void main(String[] args) throws RunnerException {

        System.out.println("staticExpr                      result " + Expression.eval(staticEl));
        System.out.println("cacheableStaticExpr             result " + CacheableExpression.eval(staticEl));
        System.out.println("dynamicsDirect                  result " + Expression.evalParameters(dynamicsEl, fact.a, fact.b));
        System.out.println("dynamicsParsedWithPojo          result " + wastParsedEl.evaluate(fact));
        System.out.println("dynamicsParsedWithParameters    result " + wastParsedEl.evaluateParameters(fact.a, fact.b));
        Options options = new OptionsBuilder()
                .include(WastElPerSecondJmhTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.SECONDS)
                .warmupTime(TimeValue.seconds(3))
                .measurementTime(TimeValue.seconds(3))
                .forks(1)
                .build();
        new Runner(options).run();
    }
}
