```
["Nigel Rees","Evelyn Waugh","Herman Melville","J. R. R. Tolkien"]
["Nigel Rees","Evelyn Waugh","Herman Melville","J. R. R. Tolkien"]
["Nigel Rees","Evelyn Waugh","Herman Melville","J. R. R. Tolkien"]
[JNode@1f021e6c{'/store/book/0/author', string, 'Nigel Rees'}, JNode@103f852{'/store/book/1/author', string, 'Evelyn Waugh'}, JNode@587c290d{'/store/book/2/author', string, 'Herman Melville'}, JNode@4516af24{'/store/book/3/author', string, 'J. R. R. Tolkien'}]
# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=65501:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPathSelectTest.fastjson2Authors

# Run progress: 0.00% complete, ETA 00:03:00
# Fork: 1 of 1
# Warmup Iteration   1: 5256.323 ops/ms
# Warmup Iteration   2: 5444.635 ops/ms
# Warmup Iteration   3: 5575.829 ops/ms
# Warmup Iteration   4: 5551.807 ops/ms
# Warmup Iteration   5: 5595.572 ops/ms
Iteration   1: 5535.365 ops/ms
Iteration   2: 5584.930 ops/ms
Iteration   3: 5568.765 ops/ms
Iteration   4: 5580.480 ops/ms
Iteration   5: 5604.105 ops/ms


Result "com.jmh.test.json.path.JSONPathSelectTest.fastjson2Authors":
  5574.729 ±(99.9%) 97.891 ops/ms [Average]
  (min, avg, max) = (5535.365, 5574.729, 5604.105), stdev = 25.422
  CI (99.9%): [5476.837, 5672.620] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=65501:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPathSelectTest.fastjson2AuthorsNoCachePath

# Run progress: 16.67% complete, ETA 00:02:34
# Fork: 1 of 1
# Warmup Iteration   1: 3629.167 ops/ms
# Warmup Iteration   2: 3836.343 ops/ms
# Warmup Iteration   3: 3832.590 ops/ms
# Warmup Iteration   4: 3771.019 ops/ms
# Warmup Iteration   5: 3721.060 ops/ms
Iteration   1: 3835.343 ops/ms
Iteration   2: 3821.659 ops/ms
Iteration   3: 3824.624 ops/ms
Iteration   4: 3833.507 ops/ms
Iteration   5: 3815.037 ops/ms


Result "com.jmh.test.json.path.JSONPathSelectTest.fastjson2AuthorsNoCachePath":
  3826.034 ±(99.9%) 32.478 ops/ms [Average]
  (min, avg, max) = (3815.037, 3826.034, 3835.343), stdev = 8.434
  CI (99.9%): [3793.556, 3858.512] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=65501:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPathSelectTest.snack3Authors

# Run progress: 33.33% complete, ETA 00:02:03
# Fork: 1 of 1
# Warmup Iteration   1: 14224.821 ops/ms
# Warmup Iteration   2: 14880.158 ops/ms
# Warmup Iteration   3: 15100.594 ops/ms
# Warmup Iteration   4: 15174.003 ops/ms
# Warmup Iteration   5: 15132.383 ops/ms
Iteration   1: 15183.080 ops/ms
Iteration   2: 14961.700 ops/ms
Iteration   3: 15195.854 ops/ms
Iteration   4: 15218.671 ops/ms
Iteration   5: 15243.394 ops/ms


Result "com.jmh.test.json.path.JSONPathSelectTest.snack3Authors":
  15160.540 ±(99.9%) 437.081 ops/ms [Average]
  (min, avg, max) = (14961.700, 15160.540, 15243.394), stdev = 113.509
  CI (99.9%): [14723.459, 15597.621] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=65501:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPathSelectTest.snack3AuthorsNoCachePath

# Run progress: 50.00% complete, ETA 00:01:32
# Fork: 1 of 1
# Warmup Iteration   1: 3259.326 ops/ms
# Warmup Iteration   2: 3587.756 ops/ms
# Warmup Iteration   3: 3649.199 ops/ms
# Warmup Iteration   4: 3644.166 ops/ms
# Warmup Iteration   5: 3618.754 ops/ms
Iteration   1: 3660.107 ops/ms
Iteration   2: 3665.411 ops/ms
Iteration   3: 3623.124 ops/ms
Iteration   4: 3643.433 ops/ms
Iteration   5: 3638.968 ops/ms


Result "com.jmh.test.json.path.JSONPathSelectTest.snack3AuthorsNoCachePath":
  3646.209 ±(99.9%) 65.430 ops/ms [Average]
  (min, avg, max) = (3623.124, 3646.209, 3665.411), stdev = 16.992
  CI (99.9%): [3580.779, 3711.639] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=65501:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPathSelectTest.wastAuthors

# Run progress: 66.67% complete, ETA 00:01:01
# Fork: 1 of 1
# Warmup Iteration   1: 17881.175 ops/ms
# Warmup Iteration   2: 18815.836 ops/ms
# Warmup Iteration   3: 18830.586 ops/ms
# Warmup Iteration   4: 18919.294 ops/ms
# Warmup Iteration   5: 18963.251 ops/ms
Iteration   1: 18748.263 ops/ms
Iteration   2: 18869.420 ops/ms
Iteration   3: 18906.889 ops/ms
Iteration   4: 18834.046 ops/ms
Iteration   5: 19001.880 ops/ms


Result "com.jmh.test.json.path.JSONPathSelectTest.wastAuthors":
  18872.100 ±(99.9%) 359.391 ops/ms [Average]
  (min, avg, max) = (18748.263, 18872.100, 19001.880), stdev = 93.333
  CI (99.9%): [18512.709, 19231.491] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=65501:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPathSelectTest.wastAuthorsNoCachePath

# Run progress: 83.33% complete, ETA 00:00:30
# Fork: 1 of 1
# Warmup Iteration   1: 11418.925 ops/ms
# Warmup Iteration   2: 11946.907 ops/ms
# Warmup Iteration   3: 12431.541 ops/ms
# Warmup Iteration   4: 12365.244 ops/ms
# Warmup Iteration   5: 12207.072 ops/ms
Iteration   1: 12206.742 ops/ms
Iteration   2: 12082.025 ops/ms
Iteration   3: 12012.866 ops/ms
Iteration   4: 12306.836 ops/ms
Iteration   5: 12456.753 ops/ms


Result "com.jmh.test.json.path.JSONPathSelectTest.wastAuthorsNoCachePath":
  12213.044 ±(99.9%) 681.976 ops/ms [Average]
  (min, avg, max) = (12012.866, 12213.044, 12456.753), stdev = 177.107
  CI (99.9%): [11531.068, 12895.020] (assumes normal distribution)


# Run complete. Total time: 00:03:05

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                        Mode  Cnt      Score     Error   Units
JSONPathSelectTest.fastjson2Authors             thrpt    5   5574.729 ±  97.891  ops/ms
JSONPathSelectTest.fastjson2AuthorsNoCachePath  thrpt    5   3826.034 ±  32.478  ops/ms
JSONPathSelectTest.snack3Authors                thrpt    5  15160.540 ± 437.081  ops/ms
JSONPathSelectTest.snack3AuthorsNoCachePath     thrpt    5   3646.209 ±  65.430  ops/ms
JSONPathSelectTest.wastAuthors                  thrpt    5  18872.100 ± 359.391  ops/ms
JSONPathSelectTest.wastAuthorsNoCachePath       thrpt    5  12213.044 ± 681.976  ops/ms
```