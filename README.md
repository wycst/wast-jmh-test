# wast-jmh-test

测试环境

-  服务器: window10 32g i5 ssd
-  ide: idea2020.3

版本信息
- jmh.v1.3.5            
- fastjson.v1.2.83         
- fastjson2.v2.0.7
- jackson.v.2.9.9.3
- spel.v5.3.9
- snakeyaml.v1.29

## JSON篇

- 小文本测试
~~~
Benchmark                      Mode  Cnt     Score    Error   Units
SmallTextParseTest.fastjson1  thrpt    5  1479.282 ± 17.987  ops/ms
SmallTextParseTest.fastjson2  thrpt    5  2401.221 ± 77.762  ops/ms
SmallTextParseTest.jackson    thrpt    5  1427.027 ± 54.206  ops/ms
SmallTextParseTest.wastjson   thrpt    5  2199.300 ± 30.759  ops/ms
~~~
