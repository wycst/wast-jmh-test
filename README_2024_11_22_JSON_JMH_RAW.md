~~~
WARNING: Using incubator modules: jdk.incubator.vector
# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=54296:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 7 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.dsljson_deser_client

# Run progress: 0.00% complete, ETA 00:04:00
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 567006.461 ops/s
# Warmup Iteration   2: 651751.870 ops/s
# Warmup Iteration   3: 648395.786 ops/s
Iteration   1: 652368.711 ops/s
Iteration   2: 638647.084 ops/s
Iteration   3: 647564.567 ops/s
Iteration   4: 638269.525 ops/s
Iteration   5: 619106.131 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.dsljson_deser_client":
  639191.204 ±(99.9%) 49022.629 ops/s [Average]
  (min, avg, max) = (619106.131, 639191.204, 652368.711), stdev = 12731.021
  CI (99.9%): [590168.574, 688213.833] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=54296:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 7 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.fastjson2_deser_client

# Run progress: 16.67% complete, ETA 00:03:26
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 590442.937 ops/s
# Warmup Iteration   2: 639131.651 ops/s
# Warmup Iteration   3: 639816.636 ops/s
Iteration   1: 643842.623 ops/s
Iteration   2: 640704.954 ops/s
Iteration   3: 636225.597 ops/s
Iteration   4: 638943.399 ops/s
Iteration   5: 642523.883 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.fastjson2_deser_client":
  640448.091 ±(99.9%) 11550.536 ops/s [Average]
  (min, avg, max) = (636225.597, 640448.091, 643842.623), stdev = 2999.637
  CI (99.9%): [628897.555, 651998.627] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=54296:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 7 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.wast_deser_client

# Run progress: 33.33% complete, ETA 00:02:45
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 924565.914 ops/s
# Warmup Iteration   2: 977624.482 ops/s
# Warmup Iteration   3: 1021178.117 ops/s
Iteration   1: 1015161.342 ops/s
Iteration   2: 997478.387 ops/s
Iteration   3: 1018811.891 ops/s
Iteration   4: 1019692.324 ops/s
Iteration   5: 1019831.636 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhDeserTest.wast_deser_client":
  1014195.116 ±(99.9%) 36716.999 ops/s [Average]
  (min, avg, max) = (997478.387, 1014195.116, 1019831.636), stdev = 9535.288
  CI (99.9%): [977478.117, 1050912.115] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=54296:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 7 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.dsljson_ser_client

# Run progress: 50.00% complete, ETA 00:02:03
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 1040833.551 ops/s
# Warmup Iteration   2: 1125521.596 ops/s
# Warmup Iteration   3: 1105000.902 ops/s
Iteration   1: 1107547.741 ops/s
Iteration   2: 1099209.655 ops/s
Iteration   3: 1087919.072 ops/s
Iteration   4: 1118810.305 ops/s
Iteration   5: 1116968.547 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.dsljson_ser_client":
  1106091.064 ±(99.9%) 49454.761 ops/s [Average]
  (min, avg, max) = (1087919.072, 1106091.064, 1118810.305), stdev = 12843.244
  CI (99.9%): [1056636.303, 1155545.825] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=54296:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 7 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.fastjson2_ser_client

# Run progress: 66.67% complete, ETA 00:01:22
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 1354076.426 ops/s
# Warmup Iteration   2: 1529088.646 ops/s
# Warmup Iteration   3: 1539520.710 ops/s
Iteration   1: 1539084.028 ops/s
Iteration   2: 1541857.114 ops/s
Iteration   3: 1536555.287 ops/s
Iteration   4: 1542621.038 ops/s
Iteration   5: 1521441.069 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.fastjson2_ser_client":
  1536311.707 ±(99.9%) 33316.424 ops/s [Average]
  (min, avg, max) = (1521441.069, 1536311.707, 1542621.038), stdev = 8652.170
  CI (99.9%): [1502995.283, 1569628.132] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 17.0.3.1, Java HotSpot(TM) 64-Bit Server VM, 17.0.3.1+2-LTS-6
# VM invoker: D:\Program Files\Java\jdk-17.0.3.1\bin\java.exe
# VM options: -Xms3g -Xmx3g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=54296:D:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin -Dfile.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 3 iterations, 5 s each
# Measurement: 5 iterations, 5 s each
# Timeout: 10 min per iteration
# Threads: 7 threads, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.wast_ser_client

# Run progress: 83.33% complete, ETA 00:00:41
# Fork: 1 of 1
WARNING: Using incubator modules: jdk.incubator.vector
# Warmup Iteration   1: 1653730.874 ops/s
# Warmup Iteration   2: 1920661.164 ops/s
# Warmup Iteration   3: 1980553.445 ops/s
Iteration   1: 1952998.468 ops/s
Iteration   2: 1970743.706 ops/s
Iteration   3: 1901657.760 ops/s
Iteration   4: 1974590.953 ops/s
Iteration   5: 1961436.171 ops/s


Result "com.jmh.test.json.bean.javajsonjmh.JavaJsonJmhSerTest.wast_ser_client":
  1952285.412 ±(99.9%) 113669.838 ops/s [Average]
  (min, avg, max) = (1901657.760, 1952285.412, 1974590.953), stdev = 29519.696
  CI (99.9%): [1838615.574, 2065955.250] (assumes normal distribution)


# Run complete. Total time: 00:04:07

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
JavaJsonJmhDeserTest.dsljson_deser_client    thrpt    5   639191.204 ±  49022.629  ops/s
JavaJsonJmhDeserTest.fastjson2_deser_client  thrpt    5   640448.091 ±  11550.536  ops/s
JavaJsonJmhDeserTest.wast_deser_client       thrpt    5  1014195.116 ±  36716.999  ops/s
JavaJsonJmhSerTest.dsljson_ser_client        thrpt    5  1106091.064 ±  49454.761  ops/s
JavaJsonJmhSerTest.fastjson2_ser_client      thrpt    5  1536311.707 ±  33316.424  ops/s
JavaJsonJmhSerTest.wast_ser_client           thrpt    5  1952285.412 ± 113669.838  ops/s
~~~