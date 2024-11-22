package com.jmh.test.expression;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import io.github.wycst.wast.common.expression.Expression;
import org.openjdk.jmh.runner.RunnerException;
import org.springframework.expression.spel.SpelCompilerMode;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wangyunchao
 * @Date 2021/11/3 19:20
 */
public class ExpressionLontElTest {

    static String staticExpr = "100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 1 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 5.0 + 100 * 15 / 20 *  (25 + 4 - 1050) * 14 * (4.0 - 16 * 3 / 2 / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % 12 - 12 * 14 / 5.0+ 15 % 12 - 12 * 14 / 6.0";

    static String dynamicExpr = "100 * 15 / 20 - (((((25 + 4 - 1050))))) * a * (4.0 - 16 * 3 / b / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % c - 12 * 14 / 5.0";
    static String dynamicExpr4Spel = "100 * 15 / 20 - (((((25 + 4 - 1050))))) * #a * (4.0 - 16 * 3 / #b / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % #c - 12 * 14 / 5.0";

    // 上下文
    static Map context = new HashMap();
    // SpelCompilerMode.OFF以解释模式运行
    static SpelParserConfiguration parseConfig = new SpelParserConfiguration(SpelCompilerMode.OFF, ExpressionLontElTest.class.getClassLoader());
    static SpelExpressionParser parser = new SpelExpressionParser(parseConfig);
    static StandardEvaluationContext evaluationContext = new StandardEvaluationContext();

    static FelEngine fel = new FelEngineImpl();

    static {

    }

    public static void main(String[] args) throws RunnerException {
        // 构造超文本表达式
        String el = "1 + 1";
        int n = 30;
        for (int i = 0; i < n; ++i) {
            el += " + " + el;
            final int j = i;
            final String elString = el;

            // wast 134217725bit -> 130M
            System.out.println(String.format("wast n = %d, elLength = %d, result = %s", j, elString.length(),  Expression.eval(elString)));

            // spel 8189bit  -> 8kb
//            System.out.println(String.format("spel n = %d, elLength = %d, result = %s", j, elString.length(), parser.parseExpression(elString).getValue()));

            // fel 8189bit  -> 8kb
//            System.out.println(String.format("fel n = %d, elLength = %d, result = %s", j, elString.length(), fel.eval(elString)));
        }
    }

}
