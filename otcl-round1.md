19:31:04,113 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:31:04,114 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:31:04,114 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:31:04,282 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@41975e01 - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:31:04,287 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:31:04,291 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:31:04,303 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:31:04,358 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:31:04,364 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:31:04,370 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:31:04,372 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:31:04,377 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:31:04,377 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:31:04,378 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:31:04,379 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:31:04,379 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:31:04,380 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:31:04,382 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@22a71081 - Registering current configuration as safe fallback point
# JMH version: 1.23
# VM version: JDK 1.8.0_66, Java HotSpot(TM) 64-Bit Server VM, 25.66-b18
# VM invoker: D:\Software\Java\jdk1.8.0_66\jre\bin\java.exe
# VM options: -Dfile.encoding=Cp1252
# Warmup: 10 iterations, 500 ms each
# Measurement: 50 iterations, 200 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.otcl.test.benchmark.otcl2.JmhTest.test

# Run progress: 0.00% complete, ETA 00:00:45
# Warmup Fork: 1 of 2
# Warmup Iteration   1: 19:31:05,348 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:31:05,348 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:31:05,348 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:31:05,478 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@50f9671d - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:31:05,483 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:31:05,486 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:31:05,492 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:31:05,528 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:31:05,532 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:31:05,534 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:31:05,535 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:31:05,537 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:31:05,537 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:31:05,538 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:31:05,538 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:31:05,539 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:31:05,539 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:31:05,541 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@7e72dd57 - Registering current configuration as safe fallback point
[INFO ] 2021/02/24 19:31:05 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Begining OTCL deployment from D:\otcl-home\bin\ 
[INFO ] 2021/02/24 19:31:05 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Completed OTCL deployments. 
initialized OTCL 2 test ...............
7244066.633 ops/s
# Warmup Iteration   2: 7743611.211 ops/s
# Warmup Iteration   3: 9582816.230 ops/s
# Warmup Iteration   4: 9234979.655 ops/s
# Warmup Iteration   5: 9874210.845 ops/s
# Warmup Iteration   6: 9735993.356 ops/s
# Warmup Iteration   7: 10107062.441 ops/s
# Warmup Iteration   8: 9484585.183 ops/s
# Warmup Iteration   9: 10063580.126 ops/s
# Warmup Iteration  10: 9793083.150 ops/s
Iteration   1: 9933921.575 ops/s
Iteration   2: 10106885.518 ops/s
Iteration   3: 10108410.871 ops/s
Iteration   4: 9984940.668 ops/s
Iteration   5: 9917576.370 ops/s
Iteration   6: 9865391.047 ops/s
Iteration   7: 10052537.773 ops/s
Iteration   8: 10146868.558 ops/s
Iteration   9: 9869685.869 ops/s
Iteration  10: 9847018.758 ops/s
Iteration  11: 9801883.085 ops/s
Iteration  12: 10038445.026 ops/s
Iteration  13: 9965313.213 ops/s
Iteration  14: 9822878.007 ops/s
Iteration  15: 9646924.236 ops/s
Iteration  16: 9897161.443 ops/s
Iteration  17: 10008845.706 ops/s
Iteration  18: 10034001.237 ops/s
Iteration  19: 9943914.411 ops/s
Iteration  20: 9808231.499 ops/s
Iteration  21: 9565311.354 ops/s
Iteration  22: 10005443.252 ops/s
Iteration  23: 9927433.070 ops/s
Iteration  24: 10025107.875 ops/s
Iteration  25: 9840371.665 ops/s
Iteration  26: 9885712.415 ops/s
Iteration  27: 10015648.257 ops/s
Iteration  28: 9921207.234 ops/s
Iteration  29: 9942147.594 ops/s
Iteration  30: 9752615.508 ops/s
Iteration  31: 9926960.461 ops/s
Iteration  32: 9961240.780 ops/s
Iteration  33: 10027330.383 ops/s
Iteration  34: 10004123.122 ops/s
Iteration  35: 9782233.788 ops/s
Iteration  36: 9993348.863 ops/s
Iteration  37: 10003731.792 ops/s
Iteration  38: 10071270.126 ops/s
Iteration  39: 10045943.882 ops/s
Iteration  40: 9679368.071 ops/s
Iteration  41: 9996030.640 ops/s
Iteration  42: 10061458.731 ops/s
Iteration  43: 10051242.830 ops/s
Iteration  44: 9962807.751 ops/s
Iteration  45: 9749988.983 ops/s
Iteration  46: 9995350.900 ops/s
Iteration  47: 10012117.346 ops/s
Iteration  48: 10064609.381 ops/s
Iteration  49: 9922368.121 ops/s
Iteration  50: 

Total operations in this iteration - 0
9716151.252 ops/s

# Run progress: 33.33% complete, ETA 00:00:32
# Warmup Fork: 2 of 2
# Warmup Iteration   1: 19:31:21,574 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:31:21,575 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:31:21,575 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:31:21,688 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@50f9671d - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:31:21,694 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:31:21,698 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:31:21,704 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:31:21,741 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:31:21,745 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:31:21,746 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:31:21,747 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:31:21,750 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:31:21,750 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:31:21,751 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:31:21,752 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:31:21,752 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:31:21,753 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:31:21,754 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@7e72dd57 - Registering current configuration as safe fallback point
[INFO ] 2021/02/24 19:31:21 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Begining OTCL deployment from D:\otcl-home\bin\ 
[INFO ] 2021/02/24 19:31:22 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Completed OTCL deployments. 
initialized OTCL 2 test ...............
7192503.634 ops/s
# Warmup Iteration   2: 8522244.949 ops/s
# Warmup Iteration   3: 8117436.695 ops/s
# Warmup Iteration   4: 9960825.815 ops/s
# Warmup Iteration   5: 10103073.030 ops/s
# Warmup Iteration   6: 9718270.114 ops/s
# Warmup Iteration   7: 10115322.033 ops/s
# Warmup Iteration   8: 9902819.154 ops/s
# Warmup Iteration   9: 10159403.401 ops/s
# Warmup Iteration  10: 9995340.163 ops/s
Iteration   1: 9647237.254 ops/s
Iteration   2: 10194463.070 ops/s
Iteration   3: 10007576.736 ops/s
Iteration   4: 10064297.032 ops/s
Iteration   5: 9880898.135 ops/s
Iteration   6: 9990216.523 ops/s
Iteration   7: 10057553.649 ops/s
Iteration   8: 9947116.360 ops/s
Iteration   9: 9987020.792 ops/s
Iteration  10: 9837787.164 ops/s
Iteration  11: 9900863.629 ops/s
Iteration  12: 10045548.497 ops/s
Iteration  13: 9987053.281 ops/s
Iteration  14: 9913227.604 ops/s
Iteration  15: 9761937.390 ops/s
Iteration  16: 9926250.437 ops/s
Iteration  17: 9853364.566 ops/s
Iteration  18: 9941741.596 ops/s
Iteration  19: 9933283.398 ops/s
Iteration  20: 9669841.578 ops/s
Iteration  21: 9828045.028 ops/s
Iteration  22: 9962504.339 ops/s
Iteration  23: 9793495.010 ops/s
Iteration  24: 9981340.559 ops/s
Iteration  25: 9704179.570 ops/s
Iteration  26: 10061509.649 ops/s
Iteration  27: 10083676.273 ops/s
Iteration  28: 10021652.528 ops/s
Iteration  29: 9917924.206 ops/s
Iteration  30: 9866415.260 ops/s
Iteration  31: 9939825.727 ops/s
Iteration  32: 10009958.561 ops/s
Iteration  33: 9987942.068 ops/s
Iteration  34: 9794813.745 ops/s
Iteration  35: 9845133.626 ops/s
Iteration  36: 10040011.233 ops/s
Iteration  37: 9972452.469 ops/s
Iteration  38: 9925420.039 ops/s
Iteration  39: 9806882.201 ops/s
Iteration  40: 9983632.639 ops/s
Iteration  41: 9975536.126 ops/s
Iteration  42: 10027235.274 ops/s
Iteration  43: 9776713.850 ops/s
Iteration  44: 9790423.034 ops/s
Iteration  45: 9955410.970 ops/s
Iteration  46: 10034563.026 ops/s
Iteration  47: 9895219.220 ops/s
Iteration  48: 9217469.196 ops/s
Iteration  49: 9240647.987 ops/s
Iteration  50: 

Total operations in this iteration - 0
9756340.248 ops/s

# Run progress: 66.67% complete, ETA 00:00:16
# Fork: 1 of 1
# Warmup Iteration   1: 19:31:37,838 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:31:37,838 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:31:37,838 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:31:37,971 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@9d65182 - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:31:37,977 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:31:37,980 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:31:37,987 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:31:38,031 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:31:38,035 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:31:38,036 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:31:38,037 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:31:38,039 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:31:38,040 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:31:38,040 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:31:38,041 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:31:38,041 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:31:38,041 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:31:38,042 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@7a37d74b - Registering current configuration as safe fallback point
[INFO ] 2021/02/24 19:31:38 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Begining OTCL deployment from D:\otcl-home\bin\ 
[INFO ] 2021/02/24 19:31:38 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Completed OTCL deployments. 
initialized OTCL 2 test ...............
7153189.525 ops/s
# Warmup Iteration   2: 7684976.337 ops/s
# Warmup Iteration   3: 9195418.881 ops/s
# Warmup Iteration   4: 9377975.839 ops/s
# Warmup Iteration   5: 9720174.364 ops/s
# Warmup Iteration   6: 9918017.370 ops/s
# Warmup Iteration   7: 10082912.885 ops/s
# Warmup Iteration   8: 9912202.858 ops/s
# Warmup Iteration   9: 10100169.840 ops/s
# Warmup Iteration  10: 10054210.633 ops/s
Iteration   1: 10138341.614 ops/s
Iteration   2: 10012758.419 ops/s
Iteration   3: 9914065.086 ops/s
Iteration   4: 10066618.297 ops/s
Iteration   5: 10010205.783 ops/s
Iteration   6: 10110332.378 ops/s
Iteration   7: 9973755.602 ops/s
Iteration   8: 9721215.925 ops/s
Iteration   9: 10021006.162 ops/s
Iteration  10: 10149562.674 ops/s
Iteration  11: 9925216.875 ops/s
Iteration  12: 9947586.778 ops/s
Iteration  13: 9830574.189 ops/s
Iteration  14: 9976996.965 ops/s
Iteration  15: 10143720.736 ops/s
Iteration  16: 9984430.595 ops/s
Iteration  17: 9876035.609 ops/s
Iteration  18: 9825437.600 ops/s
Iteration  19: 9944634.585 ops/s
Iteration  20: 10072176.074 ops/s
Iteration  21: 10014005.850 ops/s
Iteration  22: 10073794.304 ops/s
Iteration  23: 9776984.508 ops/s
Iteration  24: 10030057.413 ops/s
Iteration  25: 9935038.445 ops/s
Iteration  26: 9931656.637 ops/s
Iteration  27: 9932888.386 ops/s
Iteration  28: 9854779.817 ops/s
Iteration  29: 9984672.257 ops/s
Iteration  30: 10018785.366 ops/s
Iteration  31: 10088809.812 ops/s
Iteration  32: 9975383.011 ops/s
Iteration  33: 9815779.119 ops/s
Iteration  34: 10084396.085 ops/s
Iteration  35: 10033242.745 ops/s
Iteration  36: 10103371.866 ops/s
Iteration  37: 9947857.471 ops/s
Iteration  38: 9722272.384 ops/s
Iteration  39: 10071120.379 ops/s
Iteration  40: 10067834.880 ops/s
Iteration  41: 10101338.364 ops/s
Iteration  42: 9939211.537 ops/s
Iteration  43: 9808803.617 ops/s
Iteration  44: 10122429.997 ops/s
Iteration  45: 10029501.687 ops/s
Iteration  46: 10091414.413 ops/s
Iteration  47: 9985210.827 ops/s
Iteration  48: 9664690.420 ops/s
Iteration  49: 10010903.792 ops/s
Iteration  50: 

10050916.360 ops/s


Result "org.otcl.test.benchmark.otcl2.JmhTest.test":
  9978236.474 ±(99.9%) 57706.154 ops/s [Average]
  (min, avg, max) = (9664690.420, 9978236.474, 10149562.674), stdev = 116569.286
  CI (99.9%): [9920530.320, 10035942.628] (assumes normal distribution)


# Run complete. Total time: 00:00:48

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark      Mode  Cnt        Score       Error  Units
JmhTest.test  thrpt   50  9978236.474 ± 57706.154  ops/s
