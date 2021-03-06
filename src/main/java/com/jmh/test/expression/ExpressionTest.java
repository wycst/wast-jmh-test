package com.jmh.test.expression;

import io.github.wycst.wast.common.expression.Expression;
import io.github.wycst.wast.common.expression.compile.CompileEnvironment;
import io.github.wycst.wast.common.expression.compile.ExpressionCompiler;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
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
public class ExpressionTest {

    static String staticExpr = "100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 6.0";

    static String dynamicExpr = "100 * 15 / 20 - (((((25 + 4 - 1050))))) * a * (4.0 - 16 * 3 / b / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % c - 12 * 14 / 5.0";
    static String dynamicExpr4Spel = "100 * 15 / 20 - (((((25 + 4 - 1050))))) * #a * (4.0 - 16 * 3 / #b / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % #c - 12 * 14 / 5.0";

    // ?????????
    static Map context = new HashMap();
    // SpelCompilerMode.OFF?????????????????????
    static SpelParserConfiguration parseConfig = new SpelParserConfiguration(SpelCompilerMode.OFF, ExpressionTest.class.getClassLoader());
    static SpelExpressionParser parser = new SpelExpressionParser(parseConfig);
    static StandardEvaluationContext evaluationContext = new StandardEvaluationContext();

    // ?????????????????????
    static org.springframework.expression.Expression spelExpression = parser.parseExpression(dynamicExpr4Spel);
    static io.github.wycst.wast.common.expression.Expression wastExpression = io.github.wycst.wast.common.expression.Expression.parse(dynamicExpr);

    static {
        context.put("a", 1);
        context.put("b", 12);
        context.put("c", 123);

        evaluationContext.setVariable("a", 1);
        evaluationContext.setVariable("b", 12);
        evaluationContext.setVariable("c", 123);

        System.out.println(Expression.eval(dynamicExpr, context) == parser.parseExpression(dynamicExpr4Spel).getValue(evaluationContext));
    }

    // ???????????????????????????
    @Benchmark
    public Object spelDirectStaticExpr() {
        return parser.parseExpression(staticExpr).getValue();
    }

    // ???????????????????????????
    @Benchmark
    public Object wastDirectStaticExpr() {
        return Expression.eval(staticExpr);
    }

    // ???????????????????????????
    @Benchmark
    public Object spelDirectDynamicExpr() {
        return parser.parseExpression(dynamicExpr4Spel).getValue(evaluationContext);
    }

    // ???????????????????????????
    @Benchmark
    public Object wastDirectDynamicExpr() {
        return Expression.eval(dynamicExpr, context);
    }

    // ???????????????????????????
    @Benchmark
    public Object spelParseDynamicExpr() {
        return spelExpression.getValue(evaluationContext);
    }

    // ???????????????????????????
    @Benchmark
    public Object wastParseDynamicExpr() {
        return wastExpression.evaluate(context);
    }

    public static void main(String[] args) throws RunnerException {

        Options options = new OptionsBuilder()
                .include(ExpressionTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.SECONDS)
                .forks(1)
                .build();
        new Runner(options).run();
    }

}
