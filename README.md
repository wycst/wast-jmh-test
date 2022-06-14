# wast-jmh-test

github源码地址：
[https://github.com/wycst/wast](https://github.com/wycst/wast)

藏了2年的一个java库，都是一行一行撸出来的，转职前端后，这个库差点沦为垃圾，原来叫light改了个名字叫wast（没啥特殊含义），已发布到了maven中央仓库，由于groupId的限制，重构了所有的包名。
从工具库到web框架，有条件会陆续放出来。

```xml

<dependency>
    <groupId>io.github.wycst</groupId>
    <artifactId>wast</artifactId>
    <version>0.0.3</version>
</dependency>
```

以下针对部分模块做的性能评测数据（性能测试结果仅限选择场景样本，有兴趣可以自行fork测试）

测试环境

- 服务器: window10 32g i5 ssd
- ide: idea2020.3
- 
版本信息

- jdk: 1.8.0_45
- jmh.v1.3.5
- **wast.v0.0.3**
- fastjson.v1.2.83
- fastjson2.v2.0.6
- jackson.v.2.9.9.3
- spel.v5.3.9
- snakeyaml.v1.29

~~~
 <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
        <jmh.version>1.35</jmh.version>
        <spring.version>5.3.9</spring.version>
        <fastjson1.version>1.2.83</fastjson1.version>
        <fastjson2.version>2.0.6</fastjson2.version>
        <snakeyaml-version>1.29</snakeyaml-version>
        <jackson.version>2.9.9.3</jackson.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>io.github.wycst</groupId>
            <artifactId>wast</artifactId>
            <version>0.0.3</version>
        </dependency>
        <dependency>
            <groupId>com.alibaba.fastjson2</groupId>
            <artifactId>fastjson2</artifactId>
            <version>${fastjson2.version}</version>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
            <version>${fastjson1.version}</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>${jackson.version}</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-expression</artifactId>
            <version>${spring.version}</version>
        </dependency>

        <dependency>
            <groupId>org.yaml</groupId>
            <artifactId>snakeyaml</artifactId>
            <version>${snakeyaml-version}</version>
        </dependency>

        <dependency>
            <groupId>org.openjdk.jmh</groupId>
            <artifactId>jmh-core</artifactId>
            <version>${jmh.version}</version>
        </dependency>
        <dependency>
            <groupId>org.openjdk.jmh</groupId>
            <artifactId>jmh-generator-annprocess</artifactId>
            <version>${jmh.version}</version>
        </dependency>

    </dependencies>
~~~

## JSON篇

- 反序列化 - 简单实体bean的解析（ops/ms）

~~~
Benchmark                  Mode  Cnt     Score    Error   Units
SimpleBeanTest.fastjson1  thrpt    5   295.223 ± 25.515  ops/ms
SimpleBeanTest.fastjson2  thrpt    5   785.447 ± 14.362  ops/ms
SimpleBeanTest.jackson    thrpt    5   474.894 ± 26.205  ops/ms
SimpleBeanTest.wastjson   thrpt    5  1189.094 ± 60.265  ops/ms
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/SimpleBeanTest.java

测试结果： wastjson >> fastjson2 > jackson > fastjson1

- 反序列化 - 小文本解析测试（ops/ms）

~~~
Benchmark                      Mode  Cnt     Score    Error   Units
SmallTextParseTest.fastjson1  thrpt    5  1479.282 ± 17.987  ops/ms
SmallTextParseTest.fastjson2  thrpt    5  2401.221 ± 77.762  ops/ms
SmallTextParseTest.jackson    thrpt    5  1427.027 ± 54.206  ops/ms
SmallTextParseTest.wastjson   thrpt    5  2199.300 ± 30.759  ops/ms
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/SmallTextParseTest.java

测试结果： fastjson2 > wastjson > fastjson1 > jackson

- 反序列化 - 中长文本测试(175kb)（ops/s）

~~~
Benchmark                                 Mode  Cnt     Score     Error  Units
LongTextParseTest.escapeFastjson1        thrpt    5  2403.397 ±  67.258  ops/s
LongTextParseTest.escapeFastjson2        thrpt    5  2470.036 ±  41.012  ops/s
LongTextParseTest.escapeJackson          thrpt    5  2264.022 ±  63.137  ops/s
LongTextParseTest.escapeWastjson         thrpt    5  9946.527 ± 249.772  ops/s

LongTextParseTest.escapePrettyFastjson   thrpt    5  2631.821 ±  40.613  ops/s
LongTextParseTest.escapePrettyFastjson2  thrpt    5  2433.739 ±  40.984  ops/s
LongTextParseTest.escapePrettyJackson    thrpt    5  1568.147 ± 103.349  ops/s
LongTextParseTest.escapePrettyWastjson   thrpt    5  9961.827 ± 551.414  ops/s

LongTextParseTest.fastjson1              thrpt    5  5118.035 ± 112.711  ops/s
LongTextParseTest.fastjson2              thrpt    5  6850.418 ± 147.904  ops/s
LongTextParseTest.jackson                thrpt    5  2936.602 ±  39.819  ops/s
LongTextParseTest.wastjson               thrpt    5  9468.415 ±  71.767  ops/s

LongTextParseTest.prettyFastjson1        thrpt    5  5118.231 ±  31.292  ops/s
LongTextParseTest.prettyFastjson2        thrpt    5  6830.779 ±  46.084  ops/s
LongTextParseTest.prettyJackson          thrpt    5  2910.411 ±  37.276  ops/s
LongTextParseTest.prettyWastjson         thrpt    5  9459.602 ± 210.523  ops/s
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/LongTextParseTest.java

测试结果： wastjson >> fastjson2 > fastjson1 > jackson

- 反序列化 - 中文本测试(515kb)（ops/s）

~~~
Benchmark                      Mode  Cnt    Score    Error  Units
LongTextParseTest2.fastjson1  thrpt    5  502.565 ±  4.324  ops/s
LongTextParseTest2.fastjson2  thrpt    5  528.788 ±  4.027  ops/s
LongTextParseTest2.jackson    thrpt    5  596.762 ± 32.091  ops/s
LongTextParseTest2.wastjson   thrpt    5  569.860 ±  5.274  ops/s
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/LongTextParseTest2.java

测试结果： jackson > wastjson > fastjson2 > fastjson1

- 反序列化 - 超大长文本测试(180mb)（ops/min）

~~~
Benchmark                 Mode  Cnt   Score    Error    Units
SuperLongText.fastjson   thrpt    5  25.945 ± 10.596  ops/min
SuperLongText.fastjson2  thrpt    5  20.453 ± 17.898  ops/min
SuperLongText.jackson    thrpt    5  21.170 ±  0.432  ops/min
SuperLongText.wastjson   thrpt    5  49.315 ± 12.184  ops/min
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/SuperLongText.java

测试结果： wastjson >> fastjson > jackson > fastjson2

- 通过流读取超大长JSON文本测试(180mb)（ops/min）

~~~
Benchmark                      Mode  Cnt   Score    Error    Units
ReadInputStreamTest.jackson   thrpt    5  17.911 ±  3.584  ops/min
ReadInputStreamTest.wastjson  thrpt    5  27.118 ± 10.143  ops/min

~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/ReadInputStreamTest.java

测试结果： wastjson >> jackson  
(fastjson完全没法读取超大文本流,退出此轮评测)

- 序列化 - 中长文本（ops/ms）

~~~
Benchmark                   Mode  Cnt    Score    Error   Units
WriteTest.escapeFastjson   thrpt    5  248.960 ±  2.526  ops/ms
WriteTest.escapeFastjson2  thrpt    5  134.715 ±  0.727  ops/ms
WriteTest.escapeJackson    thrpt    5  285.107 ±  4.332  ops/ms
WriteTest.escapeWastjson   thrpt    5  365.724 ± 16.478  ops/ms
WriteTest.fastjson         thrpt    5  528.649 ± 24.377  ops/ms
WriteTest.fastjson2        thrpt    5  372.189 ±  3.944  ops/ms
WriteTest.jackson          thrpt    5  329.733 ±  2.537  ops/ms
WriteTest.wastjson         thrpt    5  571.830 ±  1.658  ops/ms

~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/WriteTest.java

测试结果：

常规文本： wastjson > fastjson  > fastjson2 > jackson

转义文本： wastjson > jackson > fastjson > fastjson2

- fastjson2新特性JSONPath的pk (ops/ms)

~~~
Benchmark                               Mode  Cnt     Score    Error   Units
JSONPathTest.fastjsonReaderAuthors     thrpt    5   454.894 ± 12.225  ops/ms
JSONPathTest.fastjsonReaderPrices      thrpt    5   455.360 ±  2.692  ops/ms
JSONPathTest.fastjsonReaderTop2Author  thrpt    5   555.557 ± 23.740  ops/ms
JSONPathTest.wastAuthors               thrpt    5   801.320 ± 56.132  ops/ms
JSONPathTest.wastPrices                thrpt    5   908.480 ± 26.998  ops/ms
JSONPathTest.wastTop2Authors           thrpt    5  1451.135 ± 19.843  ops/ms
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/path/JSONPathTest.java

测试结果：wastjson(JSONNode) >> fastjson2

## 表达式引擎

pk对象spel(mvel2, ognl, Fel等库性能和spel差距有点大就不考虑加入评测)

不考虑编译模式（将表达式编译为字节码），没啥价值可比。

~~~
Benchmark                              Mode  Cnt        Score        Error  Units
ExpressionTest.spelDirectDynamicExpr  thrpt    5     3636.816 ±    119.516  ops/s
ExpressionTest.spelDirectStaticExpr   thrpt    5     3647.830 ±    103.602  ops/s
ExpressionTest.spelParseDynamicExpr   thrpt    5  1638805.101 ± 261375.252  ops/s
ExpressionTest.wastDirectDynamicExpr  thrpt    5     4519.986 ±    257.351  ops/s
ExpressionTest.wastDirectStaticExpr   thrpt    5     4563.065 ±     68.228  ops/s
ExpressionTest.wastParseDynamicExpr   thrpt    5  3172853.345 ± 355515.730  ops/s
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/expression/ExpressionTest.java

测试结果：wast > spel

## yaml

pk对象org.snakeyaml库(暂时未发现有其他的yaml库)

~~~
Benchmark            Mode  Cnt    Score   Error   Units
YamlTest.snakeyaml  thrpt    5   26.687 ± 0.832  ops/ms
YamlTest.wastYaml   thrpt    5  548.392 ± 2.784  ops/ms
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/yaml/YamlTest.java

测试结果：wast >> spel