```
WARNING: Using incubator modules: jdk.incubator.vector
data size: 631kb
# JMH version: 1.36
# VM version: JDK 21, OpenJDK 64-Bit Server VM, 21+35-2513
# VM invoker: D:\Program Files\Java\openjdk-21_windows-x64_bin\jdk-21\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=60450:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.simdjson.TwitterJmhTest.parseAndSelect_SimdjsonJava

# Run progress: 0.00% complete, ETA 00:01:12
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: data size: 631kb
1104.377 ops/s
Iteration   1: 1380.713 ops/s
Iteration   2: 1356.126 ops/s
Iteration   3: 1366.225 ops/s
Iteration   4: 1374.269 ops/s
Iteration   5: 1375.927 ops/s


Result "com.jmh.test.simdjson.TwitterJmhTest.parseAndSelect_SimdjsonJava":
  1370.652 ±(99.9%) 37.171 ops/s [Average]
  (min, avg, max) = (1356.126, 1370.652, 1380.713), stdev = 9.653
  CI (99.9%): [1333.481, 1407.823] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 21, OpenJDK 64-Bit Server VM, 21+35-2513
# VM invoker: D:\Program Files\Java\openjdk-21_windows-x64_bin\jdk-21\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=60450:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.simdjson.TwitterJmhTest.parseAndSelect_WastJson

# Run progress: 25.00% complete, ETA 00:00:58
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: data size: 631kb
1852.470 ops/s
Iteration   1: 1960.568 ops/s
Iteration   2: 1926.540 ops/s
Iteration   3: 1953.068 ops/s
Iteration   4: 2057.451 ops/s
Iteration   5: 2089.648 ops/s


Result "com.jmh.test.simdjson.TwitterJmhTest.parseAndSelect_WastJson":
  1997.455 ±(99.9%) 275.386 ops/s [Average]
  (min, avg, max) = (1926.540, 1997.455, 2089.648), stdev = 71.517
  CI (99.9%): [1722.069, 2272.842] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 21, OpenJDK 64-Bit Server VM, 21+35-2513
# VM invoker: D:\Program Files\Java\openjdk-21_windows-x64_bin\jdk-21\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=60450:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.simdjson.TwitterJmhTest.schemaBasedParseAndSelect_SimdjsonJava

# Run progress: 50.00% complete, ETA 00:00:38
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: data size: 631kb
1579.295 ops/s
Iteration   1: 2101.875 ops/s
Iteration   2: 2110.432 ops/s
Iteration   3: 2089.084 ops/s
Iteration   4: 2049.094 ops/s
Iteration   5: 2110.328 ops/s


Result "com.jmh.test.simdjson.TwitterJmhTest.schemaBasedParseAndSelect_SimdjsonJava":
  2092.163 ±(99.9%) 98.596 ops/s [Average]
  (min, avg, max) = (2049.094, 2092.163, 2110.432), stdev = 25.605
  CI (99.9%): [1993.566, 2190.759] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 21, OpenJDK 64-Bit Server VM, 21+35-2513
# VM invoker: D:\Program Files\Java\openjdk-21_windows-x64_bin\jdk-21\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=60450:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.simdjson.TwitterJmhTest.schemaBasedParseAndSelect_WastJson

# Run progress: 75.00% complete, ETA 00:00:19
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: data size: 631kb
2431.314 ops/s
Iteration   1: 2670.183 ops/s
Iteration   2: 2688.434 ops/s
Iteration   3: 2617.556 ops/s
Iteration   4: 2647.673 ops/s
Iteration   5: 2651.030 ops/s


Result "com.jmh.test.simdjson.TwitterJmhTest.schemaBasedParseAndSelect_WastJson":
  2654.975 ±(99.9%) 102.240 ops/s [Average]
  (min, avg, max) = (2617.556, 2654.975, 2688.434), stdev = 26.551
  CI (99.9%): [2552.736, 2757.215] (assumes normal distribution)


# Run complete. Total time: 00:01:17

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                                               Mode  Cnt     Score     Error  Units
TwitterJmhTest.parseAndSelect_SimdjsonJava             thrpt    5  1370.652 ±  37.171  ops/s
TwitterJmhTest.parseAndSelect_WastJson                 thrpt    5  1997.455 ± 275.386  ops/s
TwitterJmhTest.schemaBasedParseAndSelect_SimdjsonJava  thrpt    5  2092.163 ±  98.596  ops/s
TwitterJmhTest.schemaBasedParseAndSelect_WastJson      thrpt    5  2654.975 ± 102.240  ops/s
```