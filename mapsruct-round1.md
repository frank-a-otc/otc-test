19:44:04,197 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:44:04,198 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:44:04,198 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:44:04,353 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@41975e01 - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:44:04,359 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:44:04,363 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:44:04,371 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:44:04,419 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:44:04,424 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:44:04,427 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:44:04,430 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:44:04,433 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:44:04,433 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:44:04,435 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:44:04,435 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:44:04,435 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:44:04,436 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:44:04,437 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@22a71081 - Registering current configuration as safe fallback point
# JMH version: 1.23
# VM version: JDK 1.8.0_66, Java HotSpot(TM) 64-Bit Server VM, 25.66-b18
# VM invoker: D:\Software\Java\jdk1.8.0_66\jre\bin\java.exe
# VM options: -Dfile.encoding=Cp1252
# Warmup: 10 iterations, 500 ms each
# Measurement: 50 iterations, 200 ms each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.otcl.test.benchmark.mapstruct.JmhTest.test

# Run progress: 0.00% complete, ETA 00:00:45
# Warmup Fork: 1 of 2
# Warmup Iteration   1: 19:44:05,335 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:44:05,336 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:44:05,336 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:44:05,508 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@1fe5095a - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:44:05,516 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:44:05,519 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:44:05,526 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:44:05,564 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:44:05,570 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:44:05,573 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:44:05,574 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:44:05,578 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:44:05,578 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:44:05,579 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:44:05,579 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:44:05,580 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:44:05,581 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:44:05,582 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@4ca8dd3b - Registering current configuration as safe fallback point
initialized MapStruct test...............
524873.722 ops/s
# Warmup Iteration   2: 797249.286 ops/s
# Warmup Iteration   3: 760567.466 ops/s
# Warmup Iteration   4: 701794.224 ops/s
# Warmup Iteration   5: 777045.811 ops/s
# Warmup Iteration   6: 847365.264 ops/s
# Warmup Iteration   7: 845704.754 ops/s
# Warmup Iteration   8: 871148.424 ops/s
# Warmup Iteration   9: 878306.786 ops/s
# Warmup Iteration  10: 898132.483 ops/s
Iteration   1: 840174.760 ops/s
Iteration   2: 883480.775 ops/s
Iteration   3: 832965.742 ops/s
Iteration   4: 887370.143 ops/s
Iteration   5: 872202.090 ops/s
Iteration   6: 857656.066 ops/s
Iteration   7: 877821.629 ops/s
Iteration   8: 867788.652 ops/s
Iteration   9: 869786.452 ops/s
Iteration  10: 397224.992 ops/s
Iteration  11: 742471.977 ops/s
Iteration  12: 418487.988 ops/s
Iteration  13: 802935.599 ops/s
Iteration  14: 860145.395 ops/s
Iteration  15: 854170.557 ops/s
Iteration  16: 892616.572 ops/s
Iteration  17: 835605.148 ops/s
Iteration  18: 651738.567 ops/s
Iteration  19: 694264.656 ops/s
Iteration  20: 674862.690 ops/s
Iteration  21: 667018.185 ops/s
Iteration  22: 724489.871 ops/s
Iteration  23: 873186.815 ops/s
Iteration  24: 889309.785 ops/s
Iteration  25: 900463.974 ops/s
Iteration  26: 890293.111 ops/s
Iteration  27: 876486.281 ops/s
Iteration  28: 882202.446 ops/s
Iteration  29: 863533.435 ops/s
Iteration  30: 878083.862 ops/s
Iteration  31: 865605.419 ops/s
Iteration  32: 840688.742 ops/s
Iteration  33: 822739.553 ops/s
Iteration  34: 879608.136 ops/s
Iteration  35: 839553.344 ops/s
Iteration  36: 867391.152 ops/s
Iteration  37: 826475.670 ops/s
Iteration  38: 869396.928 ops/s
Iteration  39: 829111.093 ops/s
Iteration  40: 888451.388 ops/s
Iteration  41: 882694.471 ops/s
Iteration  42: 856629.363 ops/s
Iteration  43: 870175.938 ops/s
Iteration  44: 871262.885 ops/s
Iteration  45: 886377.514 ops/s
Iteration  46: 881280.381 ops/s
Iteration  47: 840658.974 ops/s
Iteration  48: 882267.673 ops/s
Iteration  49: 883627.699 ops/s
Iteration  50: 

Total operations in this iteration - 0
886087.271 ops/s

# Run progress: 33.33% complete, ETA 00:00:32
# Warmup Fork: 2 of 2
# Warmup Iteration   1: 19:44:21,186 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:44:21,186 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:44:21,187 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:44:21,304 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@1fe5095a - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:44:21,311 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:44:21,315 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:44:21,321 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:44:21,360 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:44:21,365 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:44:21,368 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:44:21,369 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:44:21,372 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:44:21,372 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:44:21,373 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:44:21,373 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:44:21,373 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:44:21,374 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:44:21,375 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@4ca8dd3b - Registering current configuration as safe fallback point
initialized MapStruct test...............
641713.839 ops/s
# Warmup Iteration   2: 772956.765 ops/s
# Warmup Iteration   3: 855218.366 ops/s
# Warmup Iteration   4: 770428.273 ops/s
# Warmup Iteration   5: 906314.568 ops/s
# Warmup Iteration   6: 891330.506 ops/s
# Warmup Iteration   7: 898615.915 ops/s
# Warmup Iteration   8: 857821.382 ops/s
# Warmup Iteration   9: 866957.566 ops/s
# Warmup Iteration  10: 859204.896 ops/s
Iteration   1: 860906.526 ops/s
Iteration   2: 882436.573 ops/s
Iteration   3: 858039.144 ops/s
Iteration   4: 883170.818 ops/s
Iteration   5: 856543.934 ops/s
Iteration   6: 841209.535 ops/s
Iteration   7: 914960.824 ops/s
Iteration   8: 887584.040 ops/s
Iteration   9: 857239.505 ops/s
Iteration  10: 891943.744 ops/s
Iteration  11: 607843.768 ops/s
Iteration  12: 719362.799 ops/s
Iteration  13: 867497.908 ops/s
Iteration  14: 882981.648 ops/s
Iteration  15: 896316.832 ops/s
Iteration  16: 875202.874 ops/s
Iteration  17: 879117.891 ops/s
Iteration  18: 866017.656 ops/s
Iteration  19: 851448.400 ops/s
Iteration  20: 864570.633 ops/s
Iteration  21: 856931.729 ops/s
Iteration  22: 815116.283 ops/s
Iteration  23: 826772.039 ops/s
Iteration  24: 840976.956 ops/s
Iteration  25: 846364.162 ops/s
Iteration  26: 810582.692 ops/s
Iteration  27: 892271.211 ops/s
Iteration  28: 878894.111 ops/s
Iteration  29: 878226.301 ops/s
Iteration  30: 892645.682 ops/s
Iteration  31: 892660.241 ops/s
Iteration  32: 885223.958 ops/s
Iteration  33: 860207.131 ops/s
Iteration  34: 886102.349 ops/s
Iteration  35: 904862.500 ops/s
Iteration  36: 903845.736 ops/s
Iteration  37: 902289.830 ops/s
Iteration  38: 877737.472 ops/s
Iteration  39: 883478.270 ops/s
Iteration  40: 881426.895 ops/s
Iteration  41: 885133.720 ops/s
Iteration  42: 888228.532 ops/s
Iteration  43: 875290.633 ops/s
Iteration  44: 879993.074 ops/s
Iteration  45: 886817.820 ops/s
Iteration  46: 883096.813 ops/s
Iteration  47: 891506.129 ops/s
Iteration  48: 865956.145 ops/s
Iteration  49: 889242.757 ops/s
Iteration  50: 

Total operations in this iteration - 0
893474.795 ops/s

# Run progress: 66.67% complete, ETA 00:00:15
# Fork: 1 of 1
# Warmup Iteration   1: 19:44:36,936 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:44:36,936 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:44:36,936 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:44:37,045 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@7af7ef8d - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:44:37,053 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:44:37,057 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:44:37,067 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:44:37,100 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:44:37,103 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:44:37,105 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:44:37,107 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:44:37,109 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:44:37,109 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:44:37,110 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:44:37,111 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:44:37,111 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:44:37,111 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:44:37,113 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@24421b3b - Registering current configuration as safe fallback point
initialized MapStruct test...............
632710.719 ops/s
# Warmup Iteration   2: 772161.116 ops/s
# Warmup Iteration   3: 818764.100 ops/s
# Warmup Iteration   4: 744904.671 ops/s
# Warmup Iteration   5: 893339.419 ops/s
# Warmup Iteration   6: 884870.074 ops/s
# Warmup Iteration   7: 905392.381 ops/s
# Warmup Iteration   8: 864480.112 ops/s
# Warmup Iteration   9: 892213.682 ops/s
# Warmup Iteration  10: 876614.032 ops/s
Iteration   1: 901017.137 ops/s
Iteration   2: 904527.186 ops/s
Iteration   3: 894469.720 ops/s
Iteration   4: 891274.064 ops/s
Iteration   5: 841099.951 ops/s
Iteration   6: 899053.727 ops/s
Iteration   7: 878699.564 ops/s
Iteration   8: 894980.508 ops/s
Iteration   9: 896077.535 ops/s
Iteration  10: 869533.004 ops/s
Iteration  11: 889917.128 ops/s
Iteration  12: 899908.823 ops/s
Iteration  13: 894099.836 ops/s
Iteration  14: 895061.424 ops/s
Iteration  15: 863141.080 ops/s
Iteration  16: 898849.291 ops/s
Iteration  17: 894487.279 ops/s
Iteration  18: 889784.709 ops/s
Iteration  19: 896358.359 ops/s
Iteration  20: 879402.627 ops/s
Iteration  21: 894941.705 ops/s
Iteration  22: 874959.003 ops/s
Iteration  23: 900903.575 ops/s
Iteration  24: 890326.146 ops/s
Iteration  25: 868730.868 ops/s
Iteration  26: 897321.673 ops/s
Iteration  27: 887434.236 ops/s
Iteration  28: 875044.147 ops/s
Iteration  29: 881544.322 ops/s
Iteration  30: 833094.896 ops/s
Iteration  31: 890419.750 ops/s
Iteration  32: 890462.649 ops/s
Iteration  33: 896067.532 ops/s
Iteration  34: 887042.136 ops/s
Iteration  35: 848957.494 ops/s
Iteration  36: 892821.848 ops/s
Iteration  37: 889986.153 ops/s
Iteration  38: 892231.418 ops/s
Iteration  39: 886385.728 ops/s
Iteration  40: 854948.324 ops/s
Iteration  41: 884690.945 ops/s
Iteration  42: 884822.540 ops/s
Iteration  43: 885458.340 ops/s
Iteration  44: 883971.515 ops/s
Iteration  45: 847813.894 ops/s
Iteration  46: 890390.301 ops/s
Iteration  47: 886428.178 ops/s
Iteration  48: 886498.569 ops/s
Iteration  49: 886151.217 ops/s
Iteration  50: 

820666.780 ops/s


Result "org.otcl.test.benchmark.mapstruct.JmhTest.test":
  883245.177 ±(99.9%) 9058.397 ops/s [Average]
  (min, avg, max) = (820666.780, 883245.177, 904527.186), stdev = 18298.410
  CI (99.9%): [874186.780, 892303.574] (assumes normal distribution)


# Run complete. Total time: 00:00:47

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark      Mode  Cnt       Score      Error  Units
JmhTest.test  thrpt   50  883245.177 ± 9058.397  ops/s
