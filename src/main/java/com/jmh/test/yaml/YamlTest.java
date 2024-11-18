package com.jmh.test.yaml;

import io.github.wycst.wast.common.expression.Expression;
import io.github.wycst.wast.json.JSON;
import io.github.wycst.wast.yaml.YamlDocument;
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
import org.yaml.snakeyaml.Yaml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author wangyunchao
 * @Date 2021/11/3 19:20
 */
public class YamlTest {

    private static String yamlSource;
    static Yaml yaml = new Yaml();
    static {
        InputStream is = YamlTest.class.getResourceAsStream("/data/yaml/entity.yaml");
        StringBuilder builder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while (true) {
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            builder.append(line);
            builder.append('\n');
        }
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        yamlSource = builder.toString();

        Map map1 = YamlDocument.parse(yamlSource, Map.class);
        Map map2 = yaml.loadAs(yamlSource, Map.class);
        System.out.println();
        System.out.println(JSON.toJsonString(map1));
        System.out.println(JSON.toJsonString(map2));
    }

    @Benchmark
    public Object wastYaml() {
        return YamlDocument.parse(yamlSource, null);
    }

    @Benchmark
    public Object snakeyaml() {
        return yaml.loadAs(yamlSource, Map.class);
    }

    public static void main(String[] args) throws RunnerException {

        Options options = new OptionsBuilder()
                .include(YamlTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .forks(1)
                .build();
        new Runner(options).run();
    }

}
