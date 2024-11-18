package com.jmh.test.expression;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.context.MapContext;
import io.github.wycst.wast.common.expression.Expression;
import io.github.wycst.wast.common.expression.compile.CompilerEnvironment;
import io.github.wycst.wast.common.expression.compile.CompilerExpression;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import org.springframework.expression.spel.SpelCompilerMode;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author wangyunchao
 * @Date 2021/11/3 19:20
 */
public class ExpressionCompilerTest {

    static String dynamicExpr = "100 * 15 / 20 - (((((25 + 4 - 1050))))) * a * (4.0 - 16 * 3 / b / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % c - 12 * 14 / 5.0";
    static String dynamicExpr4Spel = "100 * 15 / 20 - (((((25 + 4 - 1050))))) * #a * (4.0 - 16 * 3 / #b / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % #c - 12 * 14 / 5.0";

    // 上下文
    static Map context = new HashMap();
    // SpelCompilerMode.OFF以解释模式运行
    static SpelParserConfiguration parseConfig = new SpelParserConfiguration(SpelCompilerMode.IMMEDIATE, ExpressionCompilerTest.class.getClassLoader());
    static SpelExpressionParser parser = new SpelExpressionParser(parseConfig);
    static StandardEvaluationContext evaluationContext = new StandardEvaluationContext();

    // spel
    static org.springframework.expression.Expression spelExpression = parser.parseExpression(dynamicExpr4Spel);
    // wast
    static Expression wastExpression;
    // fel
    static com.greenpineyu.fel.Expression felExpr = null;
    static FelContext ctx = null;

    static {
        context.put("a", 1);
        context.put("b", 12);
        context.put("c", 123);

        CompilerEnvironment compileEnvironment = new CompilerEnvironment();
        compileEnvironment.setSkipParse(true);
        compileEnvironment.setVariableType(byte.class, "a", "b", "c");
        wastExpression = CompilerExpression.compile(dynamicExpr, compileEnvironment, CompilerExpression.Coder.Native);

        evaluationContext.setVariable("a", 1);
        evaluationContext.setVariable("b", 12);
        evaluationContext.setVariable("c", 123);

        ctx = new MapContext();
        ctx.set("a", 1);
        ctx.set("b", 12);
        ctx.set("c", 123);

        FelEngine fel = new FelEngineImpl();
        felExpr = fel.compile(dynamicExpr, ctx);

        System.out.println(Expression.eval(dynamicExpr, context));
        System.out.println(wastExpression.evaluate(context));
        System.out.println(parser.parseExpression(dynamicExpr4Spel).getValue(evaluationContext));
        System.out.println(Expression.eval(dynamicExpr, context) == parser.parseExpression(dynamicExpr4Spel).getValue(evaluationContext));
    }

    @Benchmark
    public Object spel() {
        return spelExpression.getValue(evaluationContext);
    }

    @Benchmark
    public Object wast() {
        return wastExpression.evaluate(context);
    }

    @Benchmark
    public Object fel() {
        return felExpr.eval(ctx);
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(ExpressionCompilerTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.SECONDS)
                .forks(1)
                .warmupTime(TimeValue.seconds(2))
                .measurementTime(TimeValue.seconds(2))
                .build();
        new Runner(options).run();
    }

}
