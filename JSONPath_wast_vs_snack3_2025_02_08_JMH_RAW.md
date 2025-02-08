```
["Nigel Rees","Evelyn Waugh","Herman Melville","J. R. R. Tolkien"]
[JNode@18ef96{'/store/book/0/author', string, 'Nigel Rees'}, JNode@6956de9{'/store/book/1/author', string, 'Evelyn Waugh'}, JNode@769c9116{'/store/book/2/author', string, 'Herman Melville'}, JNode@6aceb1a5{'/store/book/3/author', string, 'J. R. R. Tolkien'}]
# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=64238:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPathSelectTest.snack3Authors

# Run progress: 0.00% complete, ETA 00:02:00
# Fork: 1 of 1
# Warmup Iteration   1: 13400.419 ops/ms
# Warmup Iteration   2: 14542.468 ops/ms
# Warmup Iteration   3: 14539.062 ops/ms
# Warmup Iteration   4: 14497.888 ops/ms
# Warmup Iteration   5: 14530.670 ops/ms
Iteration   1: 14559.579 ops/ms
Iteration   2: 14431.583 ops/ms
Iteration   3: 14555.283 ops/ms
Iteration   4: 14445.017 ops/ms
Iteration   5: 14472.758 ops/ms


Result "com.jmh.test.json.path.JSONPathSelectTest.snack3Authors":
  14492.844 ±(99.9%) 234.194 ops/ms [Average]
  (min, avg, max) = (14431.583, 14492.844, 14559.579), stdev = 60.819
  CI (99.9%): [14258.650, 14727.038] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=64238:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPathSelectTest.snack3AuthorsNoCachePath

# Run progress: 25.00% complete, ETA 00:01:32
# Fork: 1 of 1
# Warmup Iteration   1: 3288.824 ops/ms
# Warmup Iteration   2: 3673.123 ops/ms
# Warmup Iteration   3: 3710.617 ops/ms
# Warmup Iteration   4: 3788.977 ops/ms
# Warmup Iteration   5: 3756.129 ops/ms
Iteration   1: 3756.533 ops/ms
Iteration   2: 3773.448 ops/ms
Iteration   3: 3747.349 ops/ms
Iteration   4: 3762.548 ops/ms
Iteration   5: 3735.795 ops/ms


Result "com.jmh.test.json.path.JSONPathSelectTest.snack3AuthorsNoCachePath":
  3755.135 ±(99.9%) 55.365 ops/ms [Average]
  (min, avg, max) = (3735.795, 3755.135, 3773.448), stdev = 14.378
  CI (99.9%): [3699.770, 3810.500] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=64238:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPathSelectTest.wastAuthors

# Run progress: 50.00% complete, ETA 00:01:01
# Fork: 1 of 1
# Warmup Iteration   1: 18121.131 ops/ms
# Warmup Iteration   2: 18527.818 ops/ms
# Warmup Iteration   3: 19052.869 ops/ms
# Warmup Iteration   4: 19079.665 ops/ms
# Warmup Iteration   5: 19057.499 ops/ms
Iteration   1: 18931.530 ops/ms
Iteration   2: 19101.379 ops/ms
Iteration   3: 19133.166 ops/ms
Iteration   4: 19072.931 ops/ms
Iteration   5: 18760.395 ops/ms


Result "com.jmh.test.json.path.JSONPathSelectTest.wastAuthors":
  18999.880 ±(99.9%) 594.760 ops/ms [Average]
  (min, avg, max) = (18760.395, 18999.880, 19133.166), stdev = 154.457
  CI (99.9%): [18405.120, 19594.640] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 1.8.0_45, Java HotSpot(TM) 64-Bit Server VM, 25.45-b02
# VM invoker: D:\Program Files\Java\jdk1.8.0_45\jre\bin\java.exe
# VM options: -javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\lib\idea_rt.jar=64238:D:\Program Files\JetBrains\IntelliJ IDEA 2024.2.4\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 5 iterations, 3 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.jmh.test.json.path.JSONPathSelectTest.wastAuthorsNoCachePath

# Run progress: 75.00% complete, ETA 00:00:30
# Fork: 1 of 1
# Warmup Iteration   1: 11283.999 ops/ms
# Warmup Iteration   2: 11847.910 ops/ms
# Warmup Iteration   3: 12387.120 ops/ms
# Warmup Iteration   4: 12513.461 ops/ms
# Warmup Iteration   5: 12464.264 ops/ms
Iteration   1: 12501.873 ops/ms
Iteration   2: 12495.358 ops/ms
Iteration   3: 12464.860 ops/ms
Iteration   4: 12603.783 ops/ms
Iteration   5: 12567.826 ops/ms


Result "com.jmh.test.json.path.JSONPathSelectTest.wastAuthorsNoCachePath":
  12526.740 ±(99.9%) 219.992 ops/ms [Average]
  (min, avg, max) = (12464.860, 12526.740, 12603.783), stdev = 57.131
  CI (99.9%): [12306.748, 12746.732] (assumes normal distribution)


# Run complete. Total time: 00:02:03

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                     Mode  Cnt      Score     Error   Units
JSONPathSelectTest.snack3Authors             thrpt    5  14492.844 ± 234.194  ops/ms
JSONPathSelectTest.snack3AuthorsNoCachePath  thrpt    5   3755.135 ±  55.365  ops/ms
JSONPathSelectTest.wastAuthors               thrpt    5  18999.880 ± 594.760  ops/ms
JSONPathSelectTest.wastAuthorsNoCachePath    thrpt    5  12526.740 ± 219.992  ops/ms
```