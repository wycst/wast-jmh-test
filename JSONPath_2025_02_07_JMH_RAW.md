window11 + i9 + 32g
```
# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=58347:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPath2Test.fastjsonReaderAuthors

# Run progress: 0.00% complete, ETA 00:04:30
# Fork: 1 of 1
# Warmup Iteration   1: 911.666 ops/ms
# Warmup Iteration   2: 1019.816 ops/ms
# Warmup Iteration   3: 1053.830 ops/ms
# Warmup Iteration   4: 1050.399 ops/ms
# Warmup Iteration   5: 1057.135 ops/ms
Iteration   1: 1046.179 ops/ms
Iteration   2: 1056.588 ops/ms
Iteration   3: 1054.317 ops/ms
Iteration   4: 1053.546 ops/ms
Iteration   5: 1045.832 ops/ms


Result "com.jmh.test.json.path.JSONPath2Test.fastjsonReaderAuthors":
  1051.292 ±(99.9%) 19.083 ops/ms [Average]
  (min, avg, max) = (1045.832, 1051.292, 1056.588), stdev = 4.956
  CI (99.9%): [1032.210, 1070.375] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=58347:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPath2Test.fastjsonReaderPrices

# Run progress: 11.11% complete, ETA 00:04:06
# Fork: 1 of 1
# Warmup Iteration   1: 980.559 ops/ms
# Warmup Iteration   2: 1088.057 ops/ms
# Warmup Iteration   3: 1082.026 ops/ms
# Warmup Iteration   4: 1091.414 ops/ms
# Warmup Iteration   5: 1091.808 ops/ms
Iteration   1: 1092.118 ops/ms
Iteration   2: 1087.129 ops/ms
Iteration   3: 1091.592 ops/ms
Iteration   4: 1080.177 ops/ms
Iteration   5: 1094.138 ops/ms


Result "com.jmh.test.json.path.JSONPath2Test.fastjsonReaderPrices":
  1089.031 ±(99.9%) 21.456 ops/ms [Average]
  (min, avg, max) = (1080.177, 1089.031, 1094.138), stdev = 5.572
  CI (99.9%): [1067.575, 1110.487] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=58347:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPath2Test.fastjsonReaderTop2Author

# Run progress: 22.22% complete, ETA 00:03:36
# Fork: 1 of 1
# Warmup Iteration   1: 1141.668 ops/ms
# Warmup Iteration   2: 1199.624 ops/ms
# Warmup Iteration   3: 1280.972 ops/ms
# Warmup Iteration   4: 1286.417 ops/ms
# Warmup Iteration   5: 1280.909 ops/ms
Iteration   1: 1285.894 ops/ms
Iteration   2: 1285.066 ops/ms
Iteration   3: 1281.446 ops/ms
Iteration   4: 1294.537 ops/ms
Iteration   5: 1290.872 ops/ms


Result "com.jmh.test.json.path.JSONPath2Test.fastjsonReaderTop2Author":
  1287.563 ±(99.9%) 19.824 ops/ms [Average]
  (min, avg, max) = (1281.446, 1287.563, 1294.537), stdev = 5.148
  CI (99.9%): [1267.739, 1307.387] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=58347:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPath2Test.snack3Authors

# Run progress: 33.33% complete, ETA 00:03:05
# Fork: 1 of 1
# Warmup Iteration   1: 428.326 ops/ms
# Warmup Iteration   2: 458.166 ops/ms
# Warmup Iteration   3: 456.319 ops/ms
# Warmup Iteration   4: 457.930 ops/ms
# Warmup Iteration   5: 451.761 ops/ms
Iteration   1: 459.297 ops/ms
Iteration   2: 459.048 ops/ms
Iteration   3: 461.571 ops/ms
Iteration   4: 459.502 ops/ms
Iteration   5: 461.356 ops/ms


Result "com.jmh.test.json.path.JSONPath2Test.snack3Authors":
  460.155 ±(99.9%) 4.650 ops/ms [Average]
  (min, avg, max) = (459.048, 460.155, 461.571), stdev = 1.208
  CI (99.9%): [455.504, 464.805] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=58347:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPath2Test.snack3Prices

# Run progress: 44.44% complete, ETA 00:02:34
# Fork: 1 of 1
# Warmup Iteration   1: 427.776 ops/ms
# Warmup Iteration   2: 463.133 ops/ms
# Warmup Iteration   3: 462.976 ops/ms
# Warmup Iteration   4: 462.027 ops/ms
# Warmup Iteration   5: 461.985 ops/ms
Iteration   1: 461.569 ops/ms
Iteration   2: 461.834 ops/ms
Iteration   3: 463.279 ops/ms
Iteration   4: 459.696 ops/ms
Iteration   5: 464.683 ops/ms


Result "com.jmh.test.json.path.JSONPath2Test.snack3Prices":
  462.212 ±(99.9%) 7.238 ops/ms [Average]
  (min, avg, max) = (459.696, 462.212, 464.683), stdev = 1.880
  CI (99.9%): [454.974, 469.450] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=58347:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPath2Test.snack3Top2Authors

# Run progress: 55.56% complete, ETA 00:02:03
# Fork: 1 of 1
# Warmup Iteration   1: 411.848 ops/ms
# Warmup Iteration   2: 454.037 ops/ms
# Warmup Iteration   3: 449.364 ops/ms
# Warmup Iteration   4: 444.284 ops/ms
# Warmup Iteration   5: 448.231 ops/ms
Iteration   1: 445.559 ops/ms
Iteration   2: 446.597 ops/ms
Iteration   3: 445.328 ops/ms
Iteration   4: 446.046 ops/ms
Iteration   5: 444.676 ops/ms


Result "com.jmh.test.json.path.JSONPath2Test.snack3Top2Authors":
  445.641 ±(99.9%) 2.799 ops/ms [Average]
  (min, avg, max) = (444.676, 445.641, 446.597), stdev = 0.727
  CI (99.9%): [442.842, 448.440] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=58347:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPath2Test.wastAuthors

# Run progress: 66.67% complete, ETA 00:01:32
# Fork: 1 of 1
# Warmup Iteration   1: 2587.387 ops/ms
# Warmup Iteration   2: 2665.931 ops/ms
# Warmup Iteration   3: 2756.044 ops/ms
# Warmup Iteration   4: 2741.211 ops/ms
# Warmup Iteration   5: 2750.510 ops/ms
Iteration   1: 2737.926 ops/ms
Iteration   2: 2747.417 ops/ms
Iteration   3: 2751.955 ops/ms
Iteration   4: 2738.293 ops/ms
Iteration   5: 2749.349 ops/ms


Result "com.jmh.test.json.path.JSONPath2Test.wastAuthors":
  2744.988 ±(99.9%) 24.966 ops/ms [Average]
  (min, avg, max) = (2737.926, 2744.988, 2751.955), stdev = 6.484
  CI (99.9%): [2720.022, 2769.954] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=58347:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPath2Test.wastPrices

# Run progress: 77.78% complete, ETA 00:01:01
# Fork: 1 of 1
# Warmup Iteration   1: 2330.462 ops/ms
# Warmup Iteration   2: 2498.969 ops/ms
# Warmup Iteration   3: 2519.109 ops/ms
# Warmup Iteration   4: 2526.150 ops/ms
# Warmup Iteration   5: 2514.655 ops/ms
Iteration   1: 2526.768 ops/ms
Iteration   2: 2522.978 ops/ms
Iteration   3: 2521.918 ops/ms
Iteration   4: 2520.566 ops/ms
Iteration   5: 2514.863 ops/ms


Result "com.jmh.test.json.path.JSONPath2Test.wastPrices":
  2521.418 ±(99.9%) 16.674 ops/ms [Average]
  (min, avg, max) = (2514.863, 2521.418, 2526.768), stdev = 4.330
  CI (99.9%): [2504.744, 2538.093] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=58347:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPath2Test.wastTop2Authors

# Run progress: 88.89% complete, ETA 00:00:30
# Fork: 1 of 1
# Warmup Iteration   1: 5152.861 ops/ms
# Warmup Iteration   2: 5710.725 ops/ms
# Warmup Iteration   3: 5649.970 ops/ms
# Warmup Iteration   4: 5607.986 ops/ms
# Warmup Iteration   5: 5631.410 ops/ms
Iteration   1: 5661.704 ops/ms
Iteration   2: 5607.433 ops/ms
Iteration   3: 5652.433 ops/ms
Iteration   4: 5624.664 ops/ms
Iteration   5: 5633.512 ops/ms


Result "com.jmh.test.json.path.JSONPath2Test.wastTop2Authors":
  5635.949 ±(99.9%) 83.514 ops/ms [Average]
  (min, avg, max) = (5607.433, 5635.949, 5661.704), stdev = 21.688
  CI (99.9%): [5552.435, 5719.463] (assumes normal distribution)


# Run complete. Total time: 00:04:37

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                Mode  Cnt     Score    Error   Units
JSONPath2Test.fastjsonReaderAuthors     thrpt    5  1051.292 ± 19.083  ops/ms
JSONPath2Test.fastjsonReaderPrices      thrpt    5  1089.031 ± 21.456  ops/ms
JSONPath2Test.fastjsonReaderTop2Author  thrpt    5  1287.563 ± 19.824  ops/ms
JSONPath2Test.snack3Authors             thrpt    5   460.155 ±  4.650  ops/ms
JSONPath2Test.snack3Prices              thrpt    5   462.212 ±  7.238  ops/ms
JSONPath2Test.snack3Top2Authors         thrpt    5   445.641 ±  2.799  ops/ms
JSONPath2Test.wastAuthors               thrpt    5  2744.988 ± 24.966  ops/ms
JSONPath2Test.wastPrices                thrpt    5  2521.418 ± 16.674  ops/ms
JSONPath2Test.wastTop2Authors           thrpt    5  5635.949 ± 83.514  ops/ms
```