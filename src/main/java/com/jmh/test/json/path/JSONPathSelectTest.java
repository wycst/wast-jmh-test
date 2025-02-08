package com.jmh.test.json.path;

import io.github.wycst.wast.common.utils.StringUtils;
import io.github.wycst.wast.json.JSONNode;
import io.github.wycst.wast.json.JSONNodePath;
import org.noear.snack.ONode;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class JSONPathSelectTest {
    private static String str;
    static final ONode onode;
    static final JSONNodePath AUTHOR_PATH = JSONNodePath.parse("/store/book/*/author");
    static final JSONNode root;

    static {
        str = StringUtils.fromResource("data/json/path.json");
        onode = ONode.loadStr(str);
        root = JSONNode.parse(str);
    }

//    @Benchmark
//    public Object fastjsonReaderAuthors() {
//        return JSONPath.extract(str, "$.store.book[*].author");
//    }
//
//    @Benchmark
//    public Object fastjsonReaderPrices() {
//        return JSONPath.extract(str, "$.store.book[*].price");
//    }
//
//    // 读取0-1
//    @Benchmark
//    public Object fastjsonReaderTop2Author() {
//        return JSONPath.extract(str, "$.store.book[0,1].author");
//    }
//

    @Benchmark
    public List<JSONNode> wastAuthors() throws Exception {
        return root.collect(AUTHOR_PATH);
    }

    @Benchmark
    public List<JSONNode> wastAuthorsNoCachePath() throws Exception {
        return root.collect("/store/book/*/author");
    }

//    @Benchmark
//    public List<JSONNode> wastPrices() {
//        return JSONNode.collect(str, "/store/book/*/price");
//    }
//
//    // 读取0-1
//    @Benchmark
//    public List<JSONNode> wastTop2Authors() {
//        return JSONNode.collect(str, "/store/book/1-/author");
//    }

    @Benchmark
    public Object snack3Authors() {
        return onode.select("$.store.book[*].author");
    }

    @Benchmark
    public Object snack3AuthorsNoCachePath() {
        return onode.select("$.store.book[*].author", false, false);
    }

//    @Benchmark
//    public Object snack3Prices() {
//        return ONode.loadStr(str).select("$.store.book[*].price");
//    }
//
//    // 读取0-1
//    @Benchmark
//    public Object snack3Top2Authors() {
//        return ONode.loadStr(str).select("$.store.book[0,1].author");
//    }

    public static void main(String[] args) throws Exception {


        System.out.println(onode.select("$.store.book[*].author"));
        System.out.println(root.collect(AUTHOR_PATH));

        Options options = new OptionsBuilder()
                .include(JSONPathSelectTest.class.getName())
                .mode(Mode.Throughput)
                .timeUnit(TimeUnit.MILLISECONDS)
                .warmupTime(TimeValue.seconds(3))
                .measurementTime(TimeValue.seconds(3))
                .forks(1)
                .build();
        new Runner(options).run();
    }
}
