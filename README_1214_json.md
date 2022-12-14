# wast-jmh-test

github源码地址：
[https://github.com/wycst/wast](https://github.com/wycst/wast) 
最新版本: v0.0.10.1

```xml

<dependency>
    <groupId>io.github.wycst</groupId>
    <artifactId>wast</artifactId>
    <version>0.0.9</version>
</dependency>
```

针对Spel, Fel和本库wast在表达式引擎性能上的评测基准测试（2022-12-14）

- 服务器: window10 32g i5 ssd
- ide: idea2020.3
版本信息

- jdk: 1.8.0_45
- jmh.v1.3.5
- **wast.v0.0.8**
- **spel.v5.3.9**
- **fel.v.0.8**

~~~
 <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
        <jmh.version>1.35</jmh.version>
        <spring.version>5.3.9</spring.version>
        <fastjson1.version>1.2.83</fastjson1.version>
        <fastjson2.version>2.0.21</fastjson2.version>
        <snakeyaml-version>1.29</snakeyaml-version>
        <jackson.version>2.13.4</jackson.version>
        <fel.version>0.8</fel.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>io.github.wycst</groupId>
            <artifactId>wast</artifactId>
            <version>0.0.9</version>
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
            <groupId>org.eweb4j</groupId>
            <artifactId>fel</artifactId>
            <version>${fel.version}</version>
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

- 编译模式性能比较结果
  
  表达式： 100 * 15 / 20 - (((((25 + 4 - 1050))))) * a * (4.0 - 16 * 3 / b / 10.0 + 182 / 2.0 * 3 / 121.0) + 15 % c - 12 * 14 / 5.0

~~~
Benchmark                     Mode  Cnt         Score        Error  Units
ExpressionCompilerTest.fel   thrpt    5  49896256.268 ± 819723.328  ops/s
ExpressionCompilerTest.spel  thrpt    5  42385097.775 ± 339494.646  ops/s
ExpressionCompilerTest.wast  thrpt    5  53573822.788 ± 826716.128  ops/s
~~~
测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/expression/ExpressionCompilerTest.java

测试结果： wast > fel > spel <br>

- 解释模式

分别以静态表达式，动态表达式解析并运行，动态表达式直接运行3个维度比较
~~~
Benchmark                              Mode  Cnt        Score        Error  Units
ExpressionTest.felDirectStaticExpr    thrpt    5      443.454 ±      5.453  ops/s
ExpressionTest.spelDirectStaticExpr   thrpt    5     3573.123 ±    210.380  ops/s
ExpressionTest.wastDirectStaticExpr   thrpt    5     6978.162 ±    563.963  ops/s

ExpressionTest.felDirectDynamicExpr   thrpt    5    42107.258 ±   1067.551  ops/s
ExpressionTest.spelDirectDynamicExpr  thrpt    5   288059.986 ±  22377.422  ops/s
ExpressionTest.wastDirectDynamicExpr  thrpt    5   515478.059 ±  42807.588  ops/s

ExpressionTest.felParseDynamicExpr    thrpt    5   707146.320 ±  71567.652  ops/s
ExpressionTest.spelParseDynamicExpr   thrpt    5  1630335.553 ± 252417.169  ops/s
ExpressionTest.wastParseDynamicExpr   thrpt    5  8282422.293 ± 853061.950  ops/s

~~~

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/expression/ExpressionTest.java

测试结果：wast >> spel >> fel

- 超长文本表达式支持能力

测试类: https://github.com/wycst/wast-jmh-test/blob/main/src/main/java/com/jmh/test/expression/ExpressionLongElTest.java

wast表现：
```
wast n = 0, elLength = 13, result = 4
wast n = 1, elLength = 29, result = 8
wast n = 2, elLength = 61, result = 16
wast n = 3, elLength = 125, result = 32
wast n = 4, elLength = 253, result = 64
wast n = 5, elLength = 509, result = 128
wast n = 6, elLength = 1021, result = 256
wast n = 7, elLength = 2045, result = 512
wast n = 8, elLength = 4093, result = 1024
wast n = 9, elLength = 8189, result = 2048
wast n = 10, elLength = 16381, result = 4096
wast n = 11, elLength = 32765, result = 8192
wast n = 12, elLength = 65533, result = 16384
wast n = 13, elLength = 131069, result = 32768
wast n = 14, elLength = 262141, result = 65536
wast n = 15, elLength = 524285, result = 131072
wast n = 16, elLength = 1048573, result = 262144
wast n = 17, elLength = 2097149, result = 524288
wast n = 18, elLength = 4194301, result = 1048576
wast n = 19, elLength = 8388605, result = 2097152
wast n = 20, elLength = 16777213, result = 4194304
wast n = 21, elLength = 33554429, result = 8388608
wast n = 22, elLength = 67108861, result = 16777216
wast n = 23, elLength = 134217725, result = 33554432
Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
```

spel表现
```
spel n = 0, elLength = 13, result = 4
spel n = 1, elLength = 29, result = 8
spel n = 2, elLength = 61, result = 16
spel n = 3, elLength = 125, result = 32
spel n = 4, elLength = 253, result = 64
spel n = 5, elLength = 509, result = 128
spel n = 6, elLength = 1021, result = 256
spel n = 7, elLength = 2045, result = 512
spel n = 8, elLength = 4093, result = 1024
spel n = 9, elLength = 8189, result = 2048
Exception in thread "main" java.lang.StackOverflowError
```

fel表现

```
fel n = 0, elLength = 13, result = 4
fel n = 1, elLength = 29, result = 8
fel n = 2, elLength = 61, result = 16
fel n = 3, elLength = 125, result = 32
fel n = 4, elLength = 253, result = 64
fel n = 5, elLength = 509, result = 128
fel n = 6, elLength = 1021, result = 256
fel n = 7, elLength = 2045, result = 512
fel n = 8, elLength = 4093, result = 1024
fel n = 9, elLength = 8189, result = 2048
Exception in thread "main" java.lang.StackOverflowError
```
分析：
wast当表达式线性长度为134217725（约130M大小的文本）因为gc退出程序；
spel和fel当表达式线性长度为8189（约8KB大小）时因为栈溢出退出程序；

评测结果：wast >> spel == fel

