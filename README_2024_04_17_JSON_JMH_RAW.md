~~~
# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62683:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.dsljson_deser_client

# Run progress: 0.00% complete, ETA 00:08:00
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 502751.899 ops/s
# Warmup Iteration   2: 634201.621 ops/s
# Warmup Iteration   3: 627400.872 ops/s
Iteration   1: 635032.427 ops/s
Iteration   2: 626675.919 ops/s
Iteration   3: 632495.260 ops/s
Iteration   4: 632499.247 ops/s
Iteration   5: 631042.918 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.dsljson_deser_client":
  631549.154 ±(99.9%) 11858.434 ops/s [Average]
  (min, avg, max) = (626675.919, 631549.154, 635032.427), stdev = 3079.598
  CI (99.9%): [619690.720, 643407.588] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62683:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.fastjson2_deser_client

# Run progress: 16.67% complete, ETA 00:06:51
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 650695.857 ops/s
# Warmup Iteration   2: 683811.978 ops/s
# Warmup Iteration   3: 678398.871 ops/s
Iteration   1: 681583.854 ops/s
Iteration   2: 683598.197 ops/s
Iteration   3: 686136.100 ops/s
Iteration   4: 663629.467 ops/s
Iteration   5: 685384.401 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.fastjson2_deser_client":
  680066.404 ±(99.9%) 36023.151 ops/s [Average]
  (min, avg, max) = (663629.467, 680066.404, 686136.100), stdev = 9355.098
  CI (99.9%): [644043.253, 716089.555] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62683:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.wast_deser_client

# Run progress: 33.33% complete, ETA 00:05:28
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 883713.628 ops/s
# Warmup Iteration   2: 910110.743 ops/s
# Warmup Iteration   3: 911139.606 ops/s
Iteration   1: 909571.863 ops/s
Iteration   2: 896397.344 ops/s
Iteration   3: 910556.002 ops/s
Iteration   4: 900707.333 ops/s
Iteration   5: 911006.973 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.wast_deser_client":
  905647.903 ±(99.9%) 25700.604 ops/s [Average]
  (min, avg, max) = (896397.344, 905647.903, 911006.973), stdev = 6674.365
  CI (99.9%): [879947.299, 931348.507] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62683:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.dsljson_ser_client

# Run progress: 50.00% complete, ETA 00:04:06
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 1074374.419 ops/s
# Warmup Iteration   2: 1126570.936 ops/s
# Warmup Iteration   3: 1112292.426 ops/s
Iteration   1: 1123939.853 ops/s
Iteration   2: 1114535.338 ops/s
Iteration   3: 1125166.913 ops/s
Iteration   4: 1060391.948 ops/s
Iteration   5: 1125321.465 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.dsljson_ser_client":
  1109871.104 ±(99.9%) 107896.167 ops/s [Average]
  (min, avg, max) = (1060391.948, 1109871.104, 1125321.465), stdev = 28020.292
  CI (99.9%): [1001974.936, 1217767.271] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62683:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.fastjson2_ser_client

# Run progress: 66.67% complete, ETA 00:02:44
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 1247241.803 ops/s
# Warmup Iteration   2: 1428633.192 ops/s
# Warmup Iteration   3: 1416962.202 ops/s
Iteration   1: 1417578.605 ops/s
Iteration   2: 1419334.066 ops/s
Iteration   3: 1421055.526 ops/s
Iteration   4: 1401375.212 ops/s
Iteration   5: 1412726.720 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.fastjson2_ser_client":
  1414414.026 ±(99.9%) 30514.291 ops/s [Average]
  (min, avg, max) = (1401375.212, 1414414.026, 1421055.526), stdev = 7924.464
  CI (99.9%): [1383899.735, 1444928.317] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=62683:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 16 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.wast_ser_client

# Run progress: 83.33% complete, ETA 00:01:22
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 1402667.783 ops/s
# Warmup Iteration   2: 1456644.733 ops/s
# Warmup Iteration   3: 1468892.250 ops/s
Iteration   1: 1451834.547 ops/s
Iteration   2: 1457639.942 ops/s
Iteration   3: 1416218.029 ops/s
Iteration   4: 1432782.585 ops/s
Iteration   5: 1447389.756 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.wast_ser_client":
  1441172.972 ±(99.9%) 64336.484 ops/s [Average]
  (min, avg, max) = (1416218.029, 1441172.972, 1457639.942), stdev = 16707.981
  CI (99.9%): [1376836.488, 1505509.456] (assumes normal distribution)


# Run complete. Total time: 00:08:12

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
JavaJsonJmhDeserTest.dsljson_deser_client    thrpt    5   631549.154 ±  11858.434  ops/s
JavaJsonJmhDeserTest.fastjson2_deser_client  thrpt    5   680066.404 ±  36023.151  ops/s
JavaJsonJmhDeserTest.wast_deser_client       thrpt    5   905647.903 ±  25700.604  ops/s
JavaJsonJmhSerTest.dsljson_ser_client        thrpt    5  1109871.104 ± 107896.167  ops/s
JavaJsonJmhSerTest.fastjson2_ser_client      thrpt    5  1414414.026 ±  30514.291  ops/s
JavaJsonJmhSerTest.wast_ser_client           thrpt    5  1441172.972 ±  64336.484  ops/s

~~~