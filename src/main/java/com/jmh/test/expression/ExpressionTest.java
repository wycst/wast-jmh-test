package com.jmh.test.expression;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.context.MapContext;
import com.greenpineyu.fel.parser.FelNode;
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
public class ExpressionTest {

    static String staticExpr = "100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 6.0";

    static String dynamicExpr = "100 * 15 / 20 - (((((25 + 4 - 1050))))) * a * (4.0 - 16 * 3 / b / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % c - 12 * 14 / 5.0";
    static String dynamicExpr4Spel = "100 * 15 / 20 - (((((25 + 4 - 1050))))) * #a * (4.0 - 16 * 3 / #b / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % #c - 12 * 14 / 5.0";

    // 上下文
    static Map context = new HashMap();
    // SpelCompilerMode.OFF以解释模式运行
    static SpelParserConfiguration parseConfig = new SpelParserConfiguration(SpelCompilerMode.OFF, ExpressionTest.class.getClassLoader());
    static SpelExpressionParser parser = new SpelExpressionParser(parseConfig);
    static StandardEvaluationContext evaluationContext = new StandardEvaluationContext();

    // 先解释后再运行
    static org.springframework.expression.Expression spelExpression = parser.parseExpression(dynamicExpr4Spel);
    static io.github.wycst.wast.common.expression.Expression wastExpression = io.github.wycst.wast.common.expression.Expression.parse(dynamicExpr);

    static FelEngine fel = new FelEngineImpl();
    static FelContext ctx = null;
    static FelNode felExpression = fel.parse(dynamicExpr);

    static {
        context.put("a", 1);
        context.put("b", 12);
        context.put("c", 123);

        evaluationContext.setVariable("a", 1);
        evaluationContext.setVariable("b", 12);
        evaluationContext.setVariable("c", 123);

        ctx = new MapContext();
        ctx.set("a", 1);
        ctx.set("b", 12);
        ctx.set("c", 123);

        System.out.println(Expression.eval(dynamicExpr, context) == parser.parseExpression(dynamicExpr4Spel).getValue(evaluationContext));
    }

    // spel直接运行静态表达式
    @Benchmark
    public Object spelDirectStaticExpr() {
        return parser.parseExpression(staticExpr).getValue();
    }

    // wast直接运行静态表达式
    @Benchmark
    public Object wastDirectStaticExpr() {
        return Expression.eval(staticExpr);
    }

    // fel直接运行静态表达式
    @Benchmark
    public Object felDirectStaticExpr() {
        return fel.eval(staticExpr);
    }

    // spel直接运行动态表达式
    @Benchmark
    public Object spelDirectDynamicExpr() {
        return parser.parseExpression(dynamicExpr4Spel).getValue(evaluationContext);
    }

    // wast直接运行动态表达式
    @Benchmark
    public Object wastDirectDynamicExpr() {
        return Expression.eval(dynamicExpr, context);
    }

    // fel直接运行动态表达式
    @Benchmark
    public Object felDirectDynamicExpr() {
        return fel.eval(dynamicExpr, ctx);
    }


    // 解释运行动态表达式
    @Benchmark
    public Object spelParseDynamicExpr() {
        return spelExpression.getValue(evaluationContext);
    }

    // 解释运行动态表达式
    @Benchmark
    public Object wastParseDynamicExpr() {
        return wastExpression.evaluate(context);
    }

    // 解释运行动态表达式
    @Benchmark
    public Object felParseDynamicExpr() {
        return felExpression.eval(ctx);
    }

    public static void main(String[] args) throws RunnerException {

        Options options = new OptionsBuilder()
                .include(ExpressionTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.SECONDS)
                .forks(1)
                .warmupTime(TimeValue.seconds(2))
                .measurementTime(TimeValue.seconds(2))
                .build();
        new Runner(options).run();
    }

}
