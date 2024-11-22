~~~
WARNING: Using incubator modules: jdk.incubator.vector
# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62326:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.dsljson_deser_client

# Run progress: 0.00% complete, ETA 00:04:00
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 585523.269 ops/s
# Warmup Iteration   2: 636208.747 ops/s
# Warmup Iteration   3: 627262.321 ops/s
Iteration   1: 628659.103 ops/s
Iteration   2: 629581.336 ops/s
Iteration   3: 637561.939 ops/s
Iteration   4: 637400.508 ops/s
Iteration   5: 630643.243 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.dsljson_deser_client":
  632769.226 ±(99.9%) 16783.952 ops/s [Average]
  (min, avg, max) = (628659.103, 632769.226, 637561.939), stdev = 4358.739
  CI (99.9%): [615985.274, 649553.178] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62326:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.fastjson2_deser_client

# Run progress: 16.67% complete, ETA 00:03:31
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 546564.921 ops/s
# Warmup Iteration   2: 587324.496 ops/s
# Warmup Iteration   3: 582628.947 ops/s
Iteration   1: 587957.797 ops/s
Iteration   2: 591342.402 ops/s
Iteration   3: 587838.615 ops/s
Iteration   4: 585889.728 ops/s
Iteration   5: 589406.933 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.fastjson2_deser_client":
  588487.095 ±(99.9%) 7807.858 ops/s [Average]
  (min, avg, max) = (585889.728, 588487.095, 591342.402), stdev = 2027.676
  CI (99.9%): [580679.237, 596294.952] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62326:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.wast_deser_client

# Run progress: 33.33% complete, ETA 00:02:49
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 956215.300 ops/s
# Warmup Iteration   2: 995750.568 ops/s
# Warmup Iteration   3: 1007087.571 ops/s
Iteration   1: 1010650.395 ops/s
Iteration   2: 1012870.645 ops/s
Iteration   3: 1003254.961 ops/s
Iteration   4: 1014514.053 ops/s
Iteration   5: 1005793.376 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.wast_deser_client":
  1009416.686 ±(99.9%) 18318.934 ops/s [Average]
  (min, avg, max) = (1003254.961, 1009416.686, 1014514.053), stdev = 4757.369
  CI (99.9%): [991097.752, 1027735.620] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62326:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.dsljson_ser_client

# Run progress: 50.00% complete, ETA 00:02:06
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 1116068.566 ops/s
# Warmup Iteration   2: 1148605.460 ops/s
# Warmup Iteration   3: 1148470.423 ops/s
Iteration   1: 1094376.438 ops/s
Iteration   2: 1145330.830 ops/s
Iteration   3: 1158081.507 ops/s
Iteration   4: 1151586.698 ops/s
Iteration   5: 1142482.144 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.dsljson_ser_client":
  1138371.523 ±(99.9%) 97490.917 ops/s [Average]
  (min, avg, max) = (1094376.438, 1138371.523, 1158081.507), stdev = 25318.082
  CI (99.9%): [1040880.606, 1235862.441] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62326:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.fastjson2_ser_client

# Run progress: 66.67% complete, ETA 00:01:24
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 1376492.784 ops/s
# Warmup Iteration   2: 1419621.283 ops/s
# Warmup Iteration   3: 1435935.618 ops/s
Iteration   1: 1435400.686 ops/s
Iteration   2: 1435159.171 ops/s
Iteration   3: 1443446.021 ops/s
Iteration   4: 1449438.434 ops/s
Iteration   5: 1426148.085 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.fastjson2_ser_client":
  1437918.479 ±(99.9%) 34212.181 ops/s [Average]
  (min, avg, max) = (1426148.085, 1437918.479, 1449438.434), stdev = 8884.795
  CI (99.9%): [1403706.299, 1472130.660] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62326:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 2 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.wast_ser_client

# Run progress: 83.33% complete, ETA 00:00:42
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 1795343.722 ops/s
# Warmup Iteration   2: 1916168.225 ops/s
# Warmup Iteration   3: 1901659.440 ops/s
Iteration   1: 1909972.879 ops/s
Iteration   2: 1930897.346 ops/s
Iteration   3: 1876051.159 ops/s
Iteration   4: 1786196.423 ops/s
Iteration   5: 1874268.346 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.wast_ser_client":
  1875477.231 ±(99.9%) 212956.557 ops/s [Average]
  (min, avg, max) = (1786196.423, 1875477.231, 1930897.346), stdev = 55304.142
  CI (99.9%): [1662520.673, 2088433.788] (assumes normal distribution)


# Run complete. Total time: 00:04:13

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

Benchmark                                     Mode  Cnt        Score        Error  Units
JavaJsonJmhDeserTest.dsljson_deser_client    thrpt    5   632769.226 ±  16783.952  ops/s
JavaJsonJmhDeserTest.fastjson2_deser_client  thrpt    5   588487.095 ±   7807.858  ops/s
JavaJsonJmhDeserTest.wast_deser_client       thrpt    5  1009416.686 ±  18318.934  ops/s
JavaJsonJmhSerTest.dsljson_ser_client        thrpt    5  1138371.523 ±  97490.917  ops/s
JavaJsonJmhSerTest.fastjson2_ser_client      thrpt    5  1437918.479 ±  34212.181  ops/s
JavaJsonJmhSerTest.wast_ser_client           thrpt    5  1875477.231 ± 212956.557  ops/s

~~~