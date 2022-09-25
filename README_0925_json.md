# wast-jmh-test

github源码地址：
[https://github.com/wycst/wast](https://github.com/wycst/wast) 
最新版本: v0.0.8

```xml

<dependency>
    <groupId>io.github.wycst</groupId>
    <artifactId>wast</artifactId>
    <version>0.0.8</version>
</dependency>
```

针对Fastjson2, jackson和本库wast在json性能上的评测基准测试（截止到2022-09-25，各个json库的最新版本）

- 服务器: window10 32g i5 ssd
- ide: idea2020.3
版本信息

- jdk: 1.8.0_45
- jmh.v1.3.5
- **wast.v0.0.8**
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

- 反序列化 - number类型解析
~~~
Benchmark                       Mode  Cnt     Score     Error   Units
NumberValueBeanTest.fastjson2  thrpt    5   677.154 ±  4.977  ops/ms
NumberValueBeanTest.jackson    thrpt    5   387.163 ±  2.635  ops/ms
NumberValueBeanTest.wastjson   thrpt    5  1714.092 ± 77.231  ops/ms
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
DateParseTest.fastjson2        thrpt    5  7119.027 ±  75.230  ops/ms
DateParseTest.wastjson         thrpt    5  9053.564 ± 186.754  ops/ms

~~~
测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/DateParseTest.java

测试结果： wastjson > fastjson2 <br>

- 反序列化 - Eishay样本解析
~~~
Benchmark                       Mode  Cnt     Score     Error   Units
EishayParseTest.fastjson2      thrpt    5   923.627 ±  31.809  ops/ms
EishayParseTest.jackson        thrpt    5   500.473 ±   9.851  ops/ms
EishayParseTest.wastjson       thrpt    5   982.312 ±  23.943  ops/ms
~~~
测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/EishayParseTest.java

测试结果： wastjson >= fastjson2 > jackson <br>

- 反序列化 - 简单实体bean的解析（ops/ms）

~~~
Benchmark                  Mode  Cnt     Score    Error   Units
SimpleBeanTest.fastjson2       thrpt    5  1777.183 ±  67.500  ops/ms
SimpleBeanTest.jackson         thrpt    5   495.678 ±  13.662  ops/ms
SimpleBeanTest.wastjson        thrpt    5  1896.977 ±  88.649  ops/ms
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
EishayWriterTest.fastjson2     thrpt    5   965.582 ±  19.142  ops/ms
EishayWriterTest.jackson       thrpt    5   855.529 ±  18.464  ops/ms
EishayWriterTest.wastjson      thrpt    5  1203.153 ±  68.709  ops/ms
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/EishayWriterTest.java

测试结果： wastjson > fastjson2 > jackson


- 序列化 - 简单实体bean序列化

~~~
Benchmark                       Mode  Cnt     Score     Error   Units
SimpleBeanWriteTest.fastjson2  thrpt    5  1090.531 ±  53.834  ops/ms
SimpleBeanWriteTest.jackson    thrpt    5   947.185 ±  57.502  ops/ms
SimpleBeanWriteTest.wastjson   thrpt    5  2099.609 ±  78.045  ops/ms
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/SimpleBeanWriteTest.java

测试结果： wastjson > fastjson2 >= jackson

- 序列化 - 日期类型序列化

~~~
Benchmark                 Mode  Cnt     Score    Error   Units
DateWriteTest.fastjson2  thrpt    5   333.926 ±  8.128  ops/ms
DateWriteTest.wastjson   thrpt    5  2114.441 ± 76.450  ops/ms
~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/json/bean/DateWriteTest.java

测试结果： wastjson >> fastjson2