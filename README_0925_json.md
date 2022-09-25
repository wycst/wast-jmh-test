# wast-jmh-test

github源码地址：
[https://github.com/wycst/wast](https://github.com/wycst/wast) 
最新版本: v0.0.7

```xml

<dependency>
    <groupId>io.github.wycst</groupId>
    <artifactId>wast</artifactId>
    <version>0.0.7</version>
</dependency>
```

针对Fastjson2, jackson和本库wast在json性能上的评测基准测试（截止到2022-09-25，各个json库的最新版本）

- 服务器: window10 32g i5 ssd
- ide: idea2020.3
版本信息

- jdk: 1.8.0_45
- jmh.v1.3.5
- **wast.v0.0.7**
- **fastjson2.v2.0.14**
- **jackson.v.2.13.4**

~~~
 <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
        <jmh.version>1.35</jmh.version>
        <spring.version>5.3.9</spring.version>
        <fastjson1.version>1.2.83</fastjson1.version>
        <fastjson2.version>2.0.14</fastjson2.version>
        <snakeyaml-version>1.29</snakeyaml-version>
        <jackson.version>2.13.4</jackson.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>io.github.wycst</groupId>
            <artifactId>wast</artifactId>
            <version>0.0.7</version>
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

- 反序列化 - number类型解析
~~~
Benchmark                       Mode  Cnt     Score     Error   Units
NumberValueBeanTest.fastjson2  thrpt    5   576.482 ±  64.287  ops/ms
NumberValueBeanTest.jackson    thrpt    5   365.966 ±  13.618  ops/ms
NumberValueBeanTest.wastjson   thrpt    5  1656.676 ± 160.814  ops/ms
~~~
测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/NumberValueBeanTest.java

测试结果： wastjson >> fastjson2 > jackson <br>

- 反序列化 - 字符串类型解析
~~~
Benchmark                   Mode  Cnt    Score   Error   Units
StringParseTest.fastjson2  thrpt    5  400.257 ± 4.487  ops/ms
StringParseTest.jackson    thrpt    5  381.460 ± 6.173  ops/ms
StringParseTest.wastjson   thrpt    5  586.338 ± 7.675  ops/ms

~~~
测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/StringParseTest.java

测试结果： wastjson > fastjson2 > jackson <br>

- 反序列化 - 日期类型解析
~~~
Benchmark                 Mode  Cnt     Score     Error   Units
DateParseTest.fastjson2  thrpt    5  7154.759 ± 256.418  ops/ms
DateParseTest.wastjson   thrpt    5  8556.711 ± 359.024  ops/ms

~~~
测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/DateParseTest.java

测试结果： wastjson > fastjson2 <br>

- 反序列化 - Eishay样本解析
~~~
Benchmark                       Mode  Cnt     Score     Error   Units
EishayParseTest.fastjson2      thrpt    5   916.486 ±  21.791  ops/ms
EishayParseTest.jackson        thrpt    5   497.062 ±  26.467  ops/ms
EishayParseTest.wastjson       thrpt    5   925.267 ±  34.003  ops/ms
~~~
测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/EishayParseTest.java

测试结果： wastjson >= fastjson2 > jackson <br>

- 反序列化 - 简单实体bean的解析（ops/ms）

~~~
Benchmark                  Mode  Cnt     Score    Error   Units
SimpleBeanTest.fastjson2       thrpt    5  1556.391 ±  63.205  ops/ms
SimpleBeanTest.jackson         thrpt    5   484.547 ±   9.402  ops/ms
SimpleBeanTest.wastjson        thrpt    5  1779.389 ± 119.905  ops/ms
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/SimpleBeanTest.java

测试结果： wastjson > fastjson2 >> jackson <br>
(注：fastjson2-2.0.14 相比fastjson2-2.0.6版本快了不少)

- 反序列化 - 中长文本测试(175kb)（ops/s）

~~~
Benchmark                                 Mode  Cnt     Score     Error  Units
LongTextParse2Test.escapeFastjson2  thrpt    5   1130.043 ±   5.807  ops/s
LongTextParse2Test.fastjson2        thrpt    5  10411.933 ±  83.327  ops/s

LongTextParse2Test.jackson          thrpt    5   2853.476 ± 106.495  ops/s
LongTextParse2Test.escapeJackson    thrpt    5   3113.543 ±  40.393  ops/s

LongTextParse2Test.escapeWastjson   thrpt    5  10423.660 ± 435.687  ops/s
LongTextParse2Test.wastjson         thrpt    5  12296.756 ± 706.176  ops/s
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/LongTextParse2Test.java

测试结果： 
  simple： wastjson > fastjson2 > jackson  <br>
  escape： wastjson >> jackson > fastjson2  <br>


- 反序列化 - 超大长文本测试(180mb)（ops/min）

~~~
Benchmark                 Mode  Cnt    Score   Error    Units
SuperLongText.fastjson2  thrpt    5   71.115 ± 6.011  ops/min
SuperLongText.jackson    thrpt    5   21.304 ± 0.325  ops/min
SuperLongText.wastjson   thrpt    5  107.492 ± 8.661  ops/min
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/SuperLongText.java

测试结果： wastjson >> fastjson2 >> jackson

- 序列化 - Eishay样本序列化

~~~
Benchmark                       Mode  Cnt     Score     Error   Units
EishayWriterTest.fastjson2     thrpt    5   923.163 ±  46.648  ops/ms
EishayWriterTest.jackson       thrpt    5   782.062 ±  45.874  ops/ms
EishayWriterTest.wastjson      thrpt    5  1041.732 ±  90.167  ops/ms
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/EishayWriterTest.java

测试结果： wastjson > fastjson2 > jackson


- 序列化 - 简单实体bean序列化

~~~
Benchmark                       Mode  Cnt     Score     Error   Units
SimpleBeanWriteTest.fastjson2  thrpt    5  1090.515 ±  17.933  ops/ms
SimpleBeanWriteTest.jackson    thrpt    5  1011.073 ±  37.282  ops/ms
SimpleBeanWriteTest.wastjson   thrpt    5  1579.826 ±  40.862  ops/ms
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/SimpleBeanWriteTest.java

测试结果： wastjson > fastjson2 >= jackson