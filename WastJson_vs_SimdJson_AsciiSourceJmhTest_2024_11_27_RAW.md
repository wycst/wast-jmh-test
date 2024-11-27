```
WARNING: Using incubator modules: jdk.incubator.vector
data size: 1464kb
# JMH version: 1.36
# VM version: JDK 21, OpenJDK 64-Bit Server VM, 21+35-2513
# VM invoker: D:\Program Files\Java\openjdk-21_windows-x64_bin\jdk-21\bin\java.exe
# VM options: -Xms8g -Xmx8g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=64721:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.simdjson.AsciiSourceJmhTest.ascii_SimdjsonJava

# Run progress: 0.00% complete, ETA 00:00:36
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: data size: 1464kb
696.203 ops/s
Iteration   1: 914.589 ops/s
Iteration   2: 1300.761 ops/s
Iteration   3: 1308.462 ops/s
Iteration   4: 1312.388 ops/s
Iteration   5: 1321.689 ops/s


Result "com.jmh.test.simdjson.AsciiSourceJmhTest.ascii_SimdjsonJava":
1231.578 ±(99.9%) 682.959 ops/s [Average]
(min, avg, max) = (914.589, 1231.578, 1321.689), stdev = 177.362
CI (99.9%): [548.619, 1914.537] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 21, OpenJDK 64-Bit Server VM, 21+35-2513
# VM invoker: D:\Program Files\Java\openjdk-21_windows-x64_bin\jdk-21\bin\java.exe
# VM options: -Xms8g -Xmx8g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=64721:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.simdjson.AsciiSourceJmhTest.ascii_WastJson

# Run progress: 50.00% complete, ETA 00:00:19
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: data size: 1464kb
1135.325 ops/s
Iteration   1: 3122.285 ops/s
Iteration   2: 4484.043 ops/s
Iteration   3: 4522.636 ops/s
Iteration   4: 4486.033 ops/s
Iteration   5: 4449.197 ops/s


Result "com.jmh.test.simdjson.AsciiSourceJmhTest.ascii_WastJson":
4212.839 ±(99.9%) 2349.629 ops/s [Average]
(min, avg, max) = (3122.285, 4212.839, 4522.636), stdev = 610.191
CI (99.9%): [1863.210, 6562.468] (assumes normal distribution)


# Run complete. Total time: 00:00:39

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

Benchmark                               Mode  Cnt     Score      Error  Units
AsciiSourceJmhTest.ascii_SimdjsonJava  thrpt    5  1231.578 ±  682.959  ops/s
AsciiSourceJmhTest.ascii_WastJson      thrpt    5  4212.839 ± 2349.629  ops/s

```