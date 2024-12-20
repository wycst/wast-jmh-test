package com.jmh.test.json.path;

import com.alibaba.fastjson2.JSONPath;
import io.github.wycst.wast.common.utils.StringUtils;
import io.github.wycst.wast.json.JSONNode;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class JSONPathTest {
    private static String str;

    static {
        str = StringUtils.fromResource("data/json/path.json");
    }

    @Benchmark
    public Object fastjsonReaderAuthors() {
        return JSONPath.extract(str, "$.store.book[*].author");
    }

    @Benchmark
    public Object fastjsonReaderPrices() {
        return JSONPath.extract(str, "$.store.book[*].price");
    }

    // 读取0-1
    @Benchmark
    public Object fastjsonReaderTop2Author() {
        return JSONPath.extract(str, "$.store.book[0,1].author");
    }


    @Benchmark
    public List<JSONNode> wastAuthors() {
        return JSONNode.collect(str, "/store/book/*/author");
    }

    @Benchmark
    public List<JSONNode> wastPrices() {
        return JSONNode.collect(str, "/store/book/*/price");
    }

    // 读取0-1
    @Benchmark
    public List<JSONNode> wastTop2Authors() {
        return JSONNode.collect(str, "/store/book/1-/author");
    }

    public static void main(String[] args) throws Exception {
        Options options = new OptionsBuilder()
                .include(JSONPathTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .warmupTime(TimeValue.seconds(3))
                .measurementTime(TimeValue.seconds(3))
                .forks(1)
                .build();
        new Runner(options).run();
    }
}
