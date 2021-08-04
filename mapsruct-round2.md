19:52:43,818 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:52:43,818 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:52:43,818 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otc/otc-core/target/classes/logback.xml]
19:52:43,985 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@41975e01 - Adding [file:/D:/otc-home/config/logback-included.xml] to configuration watch list.
19:52:43,990 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:52:43,994 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:52:44,001 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:52:44,050 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:52:44,056 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otcLogger]
19:52:44,059 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:52:44,062 |-INFO in ch.qos.logback.core.FileAppender[otcLogger] - File property is set to [d:/otc-home/logs/otc.log]
19:52:44,065 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otc] to DEBUG
19:52:44,066 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otcLogger] to Logger[org.otc]
19:52:44,067 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otc]
19:52:44,067 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:52:44,068 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:52:44,068 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:52:44,069 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@22a71081 - Registering current configuration as safe fallback point
# JMH version: 1.23
# VM version: JDK 1.8.0_66, Java HotSpot(TM) 64-Bit Server VM, 25.66-b18
# VM invoker: D:\Software\Java\jdk1.8.0_66\jre\bin\java.exe
# VM options: -Dfile.encoding=Cp1252
# Warmup: 10 iterations, 500 ms each
# Measurement: 50 iterations, 200 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.otc.test.benchmark.mapstruct.JmhTest.test

# Run progress: 0.00% complete, ETA 00:00:45
# Warmup Fork: 1 of 2
# Warmup Iteration   1: 19:52:45,145 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:52:45,145 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:52:45,145 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otc/otc-core/target/classes/logback.xml]
19:52:45,273 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@710f953 - Adding [file:/D:/otc-home/config/logback-included.xml] to configuration watch list.
19:52:45,278 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:52:45,282 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:52:45,289 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:52:45,327 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:52:45,332 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otcLogger]
19:52:45,333 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:52:45,335 |-INFO in ch.qos.logback.core.FileAppender[otcLogger] - File property is set to [d:/otc-home/logs/otc.log]
19:52:45,337 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otc] to DEBUG
19:52:45,338 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otcLogger] to Logger[org.otc]
19:52:45,338 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otc]
19:52:45,339 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:52:45,339 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:52:45,339 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:52:45,341 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@1bcf293f - Registering current configuration as safe fallback point
initialized MapStruct test...............
583808.304 ops/s
# Warmup Iteration   2: 762912.720 ops/s
# Warmup Iteration   3: 745025.749 ops/s
# Warmup Iteration   4: 770389.863 ops/s
# Warmup Iteration   5: 834256.389 ops/s
# Warmup Iteration   6: 822570.403 ops/s
# Warmup Iteration   7: 877901.515 ops/s
# Warmup Iteration   8: 882772.392 ops/s
# Warmup Iteration   9: 905889.095 ops/s
# Warmup Iteration  10: 887590.542 ops/s
Iteration   1: 890833.284 ops/s
Iteration   2: 886535.939 ops/s
Iteration   3: 893792.677 ops/s
Iteration   4: 865726.643 ops/s
Iteration   5: 894437.992 ops/s
Iteration   6: 891197.924 ops/s
Iteration   7: 895820.149 ops/s
Iteration   8: 895550.632 ops/s
Iteration   9: 888241.925 ops/s
Iteration  10: 894846.494 ops/s
Iteration  11: 881303.262 ops/s
Iteration  12: 902289.988 ops/s
Iteration  13: 903546.283 ops/s
Iteration  14: 866993.476 ops/s
Iteration  15: 902552.015 ops/s
Iteration  16: 903565.734 ops/s
Iteration  17: 903970.769 ops/s
Iteration  18: 901503.762 ops/s
Iteration  19: 875872.347 ops/s
Iteration  20: 904900.493 ops/s
Iteration  21: 894940.911 ops/s
Iteration  22: 869157.022 ops/s
Iteration  23: 894313.932 ops/s
Iteration  24: 875152.486 ops/s
Iteration  25: 895658.333 ops/s
Iteration  26: 901674.581 ops/s
Iteration  27: 887017.005 ops/s
Iteration  28: 899335.432 ops/s
Iteration  29: 856265.510 ops/s
Iteration  30: 896365.097 ops/s
Iteration  31: 902925.026 ops/s
Iteration  32: 884137.613 ops/s
Iteration  33: 894311.606 ops/s
Iteration  34: 864503.851 ops/s
Iteration  35: 896319.289 ops/s
Iteration  36: 893977.756 ops/s
Iteration  37: 894724.681 ops/s
Iteration  38: 893006.137 ops/s
Iteration  39: 860301.338 ops/s
Iteration  40: 883134.934 ops/s
Iteration  41: 887374.641 ops/s
Iteration  42: 857908.538 ops/s
Iteration  43: 880692.841 ops/s
Iteration  44: 861336.295 ops/s
Iteration  45: 893344.089 ops/s
Iteration  46: 884259.294 ops/s
Iteration  47: 865104.447 ops/s
Iteration  48: 862516.730 ops/s
Iteration  49: 860315.837 ops/s
Iteration  50: 

Total operations in this iteration - 0
881336.695 ops/s

# Run progress: 33.33% complete, ETA 00:00:31
# Warmup Fork: 2 of 2
# Warmup Iteration   1: 19:53:00,910 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:53:00,910 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:53:00,910 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otc/otc-core/target/classes/logback.xml]
19:53:01,032 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@710f953 - Adding [file:/D:/otc-home/config/logback-included.xml] to configuration watch list.
19:53:01,038 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:53:01,041 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:53:01,048 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:53:01,094 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:53:01,098 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otcLogger]
19:53:01,100 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:53:01,101 |-INFO in ch.qos.logback.core.FileAppender[otcLogger] - File property is set to [d:/otc-home/logs/otc.log]
19:53:01,104 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otc] to DEBUG
19:53:01,104 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otcLogger] to Logger[org.otc]
19:53:01,105 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otc]
19:53:01,106 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:53:01,106 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:53:01,107 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:53:01,109 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@1bcf293f - Registering current configuration as safe fallback point
initialized MapStruct test...............
573893.499 ops/s
# Warmup Iteration   2: 749212.943 ops/s
# Warmup Iteration   3: 746916.262 ops/s
# Warmup Iteration   4: 756369.310 ops/s
# Warmup Iteration   5: 780313.981 ops/s
# Warmup Iteration   6: 815124.997 ops/s
# Warmup Iteration   7: 835603.699 ops/s
# Warmup Iteration   8: 825560.432 ops/s
# Warmup Iteration   9: 832782.643 ops/s
# Warmup Iteration  10: 818905.265 ops/s
Iteration   1: 828100.937 ops/s
Iteration   2: 831788.174 ops/s
Iteration   3: 810519.042 ops/s
Iteration   4: 830733.066 ops/s
Iteration   5: 808384.237 ops/s
Iteration   6: 840532.113 ops/s
Iteration   7: 824163.275 ops/s
Iteration   8: 830251.429 ops/s
Iteration   9: 837729.318 ops/s
Iteration  10: 815063.608 ops/s
Iteration  11: 817894.932 ops/s
Iteration  12: 823306.166 ops/s
Iteration  13: 810721.009 ops/s
Iteration  14: 824683.380 ops/s
Iteration  15: 806897.793 ops/s
Iteration  16: 840739.958 ops/s
Iteration  17: 835718.717 ops/s
Iteration  18: 819230.910 ops/s
Iteration  19: 829657.015 ops/s
Iteration  20: 806832.660 ops/s
Iteration  21: 834616.016 ops/s
Iteration  22: 821129.550 ops/s
Iteration  23: 823565.076 ops/s
Iteration  24: 833180.289 ops/s
Iteration  25: 810648.694 ops/s
Iteration  26: 831149.431 ops/s
Iteration  27: 823362.670 ops/s
Iteration  28: 754562.963 ops/s
Iteration  29: 826300.501 ops/s
Iteration  30: 810144.358 ops/s
Iteration  31: 820231.097 ops/s
Iteration  32: 827706.669 ops/s
Iteration  33: 767632.655 ops/s
Iteration  34: 812295.476 ops/s
Iteration  35: 815443.463 ops/s
Iteration  36: 827364.597 ops/s
Iteration  37: 820516.466 ops/s
Iteration  38: 824229.823 ops/s
Iteration  39: 821482.536 ops/s
Iteration  40: 793335.930 ops/s
Iteration  41: 810961.581 ops/s
Iteration  42: 822093.066 ops/s
Iteration  43: 815707.194 ops/s
Iteration  44: 824016.520 ops/s
Iteration  45: 796839.849 ops/s
Iteration  46: 820671.452 ops/s
Iteration  47: 824645.636 ops/s
Iteration  48: 816423.537 ops/s
Iteration  49: 817869.241 ops/s
Iteration  50: 

Total operations in this iteration - 0
795780.756 ops/s

# Run progress: 66.67% complete, ETA 00:00:15
# Fork: 1 of 1
# Warmup Iteration   1: 19:53:16,661 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:53:16,662 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:53:16,662 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otc/otc-core/target/classes/logback.xml]
19:53:16,782 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@4aa9be64 - Adding [file:/D:/otc-home/config/logback-included.xml] to configuration watch list.
19:53:16,787 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:53:16,790 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:53:16,797 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:53:16,833 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:53:16,837 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otcLogger]
19:53:16,839 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:53:16,840 |-INFO in ch.qos.logback.core.FileAppender[otcLogger] - File property is set to [d:/otc-home/logs/otc.log]
19:53:16,842 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otc] to DEBUG
19:53:16,842 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otcLogger] to Logger[org.otc]
19:53:16,843 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otc]
19:53:16,844 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:53:16,844 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:53:16,844 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:53:16,845 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@28b7380a - Registering current configuration as safe fallback point
initialized MapStruct test...............
622273.857 ops/s
# Warmup Iteration   2: 787819.187 ops/s
# Warmup Iteration   3: 833234.573 ops/s
# Warmup Iteration   4: 766770.784 ops/s
# Warmup Iteration   5: 881894.843 ops/s
# Warmup Iteration   6: 897166.786 ops/s
# Warmup Iteration   7: 886211.363 ops/s
# Warmup Iteration   8: 885027.750 ops/s
# Warmup Iteration   9: 879474.742 ops/s
# Warmup Iteration  10: 898454.495 ops/s
Iteration   1: 895442.621 ops/s
Iteration   2: 878980.210 ops/s
Iteration   3: 892817.222 ops/s
Iteration   4: 889789.421 ops/s
Iteration   5: 892357.327 ops/s
Iteration   6: 885636.387 ops/s
Iteration   7: 865129.329 ops/s
Iteration   8: 908486.078 ops/s
Iteration   9: 890170.774 ops/s
Iteration  10: 886465.844 ops/s
Iteration  11: 872197.763 ops/s
Iteration  12: 864727.214 ops/s
Iteration  13: 899869.209 ops/s
Iteration  14: 886811.897 ops/s
Iteration  15: 894204.661 ops/s
Iteration  16: 887817.153 ops/s
Iteration  17: 886276.680 ops/s
Iteration  18: 888312.866 ops/s
Iteration  19: 883721.357 ops/s
Iteration  20: 883520.381 ops/s
Iteration  21: 807163.887 ops/s
Iteration  22: 806265.740 ops/s
Iteration  23: 874934.239 ops/s
Iteration  24: 842800.860 ops/s
Iteration  25: 885449.266 ops/s
Iteration  26: 855229.474 ops/s
Iteration  27: 869386.120 ops/s
Iteration  28: 864578.297 ops/s
Iteration  29: 876955.015 ops/s
Iteration  30: 893626.984 ops/s
Iteration  31: 870378.415 ops/s
Iteration  32: 883955.570 ops/s
Iteration  33: 891281.673 ops/s
Iteration  34: 882139.130 ops/s
Iteration  35: 884396.800 ops/s
Iteration  36: 870424.884 ops/s
Iteration  37: 876800.920 ops/s
Iteration  38: 879926.892 ops/s
Iteration  39: 881421.875 ops/s
Iteration  40: 888827.926 ops/s
Iteration  41: 858223.166 ops/s
Iteration  42: 861678.199 ops/s
Iteration  43: 884246.342 ops/s
Iteration  44: 879154.386 ops/s
Iteration  45: 885974.235 ops/s
Iteration  46: 855026.686 ops/s
Iteration  47: 878667.861 ops/s
Iteration  48: 879899.258 ops/s
Iteration  49: 853691.653 ops/s
Iteration  50: 

887916.599 ops/s


Result "org.otc.test.benchmark.mapstruct.JmhTest.test":
  876863.135 ±(99.9%) 9626.390 ops/s [Average]
  (min, avg, max) = (806265.740, 876863.135, 908486.078), stdev = 19445.783
  CI (99.9%): [867236.745, 886489.525] (assumes normal distribution)


# Run complete. Total time: 00:00:47

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark      Mode  Cnt       Score      Error  Units
JmhTest.test  thrpt   50  876863.135 ± 9626.390  ops/s
