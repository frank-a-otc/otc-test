19:34:42,655 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:34:42,656 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:34:42,656 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:34:42,830 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@41975e01 - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:34:42,849 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:34:42,856 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:34:42,871 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:34:42,917 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:34:42,921 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:34:42,922 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:34:42,923 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:34:42,927 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:34:42,928 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:34:42,929 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:34:42,929 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:34:42,929 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:34:42,929 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:34:42,931 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@22a71081 - Registering current configuration as safe fallback point
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
# Warmup Iteration   1: 19:34:43,962 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:34:43,962 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:34:43,963 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:34:44,135 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@50f9671d - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:34:44,141 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:34:44,145 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:34:44,152 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:34:44,193 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:34:44,197 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:34:44,199 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:34:44,200 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:34:44,202 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:34:44,203 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:34:44,204 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:34:44,204 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:34:44,204 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:34:44,205 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:34:44,207 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@7e72dd57 - Registering current configuration as safe fallback point
[INFO ] 2021/02/24 19:34:44 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Begining OTCL deployment from D:\otcl-home\bin\ 
[INFO ] 2021/02/24 19:34:44 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Completed OTCL deployments. 
initialized OTCL 2 test ...............
6844879.665 ops/s
# Warmup Iteration   2: 7757249.711 ops/s
# Warmup Iteration   3: 9160294.836 ops/s
# Warmup Iteration   4: 9453027.089 ops/s
# Warmup Iteration   5: 9838559.239 ops/s
# Warmup Iteration   6: 9958454.080 ops/s
# Warmup Iteration   7: 9752148.692 ops/s
# Warmup Iteration   8: 9946708.521 ops/s
# Warmup Iteration   9: 9834957.280 ops/s
# Warmup Iteration  10: 9976264.468 ops/s
Iteration   1: 10025890.299 ops/s
Iteration   2: 9565198.624 ops/s
Iteration   3: 9893179.953 ops/s
Iteration   4: 9928413.039 ops/s
Iteration   5: 9967125.014 ops/s
Iteration   6: 10006957.179 ops/s
Iteration   7: 9129218.410 ops/s
Iteration   8: 10014911.664 ops/s
Iteration   9: 10017673.611 ops/s
Iteration  10: 9943652.082 ops/s
Iteration  11: 9822056.268 ops/s
Iteration  12: 9332675.879 ops/s
Iteration  13: 9863432.552 ops/s
Iteration  14: 9780443.160 ops/s
Iteration  15: 9967289.631 ops/s
Iteration  16: 9933042.119 ops/s
Iteration  17: 9209057.461 ops/s
Iteration  18: 9847100.199 ops/s
Iteration  19: 9901170.630 ops/s
Iteration  20: 9886740.730 ops/s
Iteration  21: 9803729.386 ops/s
Iteration  22: 9352544.793 ops/s
Iteration  23: 9890536.377 ops/s
Iteration  24: 9921252.315 ops/s
Iteration  25: 9903708.503 ops/s
Iteration  26: 9953612.095 ops/s
Iteration  27: 8949304.872 ops/s
Iteration  28: 9910508.315 ops/s
Iteration  29: 9961850.855 ops/s
Iteration  30: 9891231.171 ops/s
Iteration  31: 9932925.468 ops/s
Iteration  32: 9198271.125 ops/s
Iteration  33: 9852449.866 ops/s
Iteration  34: 9879222.178 ops/s
Iteration  35: 9893197.401 ops/s
Iteration  36: 9965196.377 ops/s
Iteration  37: 9254543.107 ops/s
Iteration  38: 9887390.467 ops/s
Iteration  39: 9867198.821 ops/s
Iteration  40: 9793560.278 ops/s
Iteration  41: 9970229.330 ops/s
Iteration  42: 9158721.886 ops/s
Iteration  43: 9852285.388 ops/s
Iteration  44: 9427882.507 ops/s
Iteration  45: 9890591.042 ops/s
Iteration  46: 9810030.207 ops/s
Iteration  47: 9407878.112 ops/s
Iteration  48: 9790081.226 ops/s
Iteration  49: 9885440.161 ops/s
Iteration  50: 

Total operations in this iteration - 0
9909226.012 ops/s

# Run progress: 33.33% complete, ETA 00:00:32
# Warmup Fork: 2 of 2
# Warmup Iteration   1: 19:35:00,334 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:35:00,334 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:35:00,335 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:35:00,462 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@9d65182 - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:35:00,469 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:35:00,473 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:35:00,480 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:35:00,515 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:35:00,519 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:35:00,521 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:35:00,522 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:35:00,524 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:35:00,524 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:35:00,525 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:35:00,525 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:35:00,525 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:35:00,526 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:35:00,527 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@7a37d74b - Registering current configuration as safe fallback point
[INFO ] 2021/02/24 19:35:00 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Begining OTCL deployment from D:\otcl-home\bin\ 
[INFO ] 2021/02/24 19:35:00 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Completed OTCL deployments. 
initialized OTCL 2 test ...............
7495352.091 ops/s
# Warmup Iteration   2: 8618434.619 ops/s
# Warmup Iteration   3: 7929054.718 ops/s
# Warmup Iteration   4: 10105843.709 ops/s
# Warmup Iteration   5: 9922213.827 ops/s
# Warmup Iteration   6: 10127180.553 ops/s
# Warmup Iteration   7: 9806778.852 ops/s
# Warmup Iteration   8: 10254884.431 ops/s
# Warmup Iteration   9: 9860756.554 ops/s
# Warmup Iteration  10: 10144404.710 ops/s
Iteration   1: 9776201.295 ops/s
Iteration   2: 10070611.418 ops/s
Iteration   3: 10117239.467 ops/s
Iteration   4: 10097317.371 ops/s
Iteration   5: 10098356.617 ops/s
Iteration   6: 9756593.995 ops/s
Iteration   7: 9927700.665 ops/s
Iteration   8: 10097963.017 ops/s
Iteration   9: 9972361.954 ops/s
Iteration  10: 9982175.958 ops/s
Iteration  11: 9419094.963 ops/s
Iteration  12: 9908913.641 ops/s
Iteration  13: 9949646.022 ops/s
Iteration  14: 9945656.272 ops/s
Iteration  15: 9951349.831 ops/s
Iteration  16: 9292774.024 ops/s
Iteration  17: 10008787.623 ops/s
Iteration  18: 10099748.074 ops/s
Iteration  19: 9935485.448 ops/s
Iteration  20: 9695577.566 ops/s
Iteration  21: 8669355.852 ops/s
Iteration  22: 9950570.571 ops/s
Iteration  23: 9995478.815 ops/s
Iteration  24: 10011182.173 ops/s
Iteration  25: 9641154.763 ops/s
Iteration  26: 9813986.262 ops/s
Iteration  27: 10043341.789 ops/s
Iteration  28: 9630408.927 ops/s
Iteration  29: 10017871.757 ops/s
Iteration  30: 9842161.816 ops/s
Iteration  31: 9676865.669 ops/s
Iteration  32: 9990041.981 ops/s
Iteration  33: 9486893.730 ops/s
Iteration  34: 9931121.664 ops/s
Iteration  35: 9985241.042 ops/s
Iteration  36: 9731938.376 ops/s
Iteration  37: 10002198.925 ops/s
Iteration  38: 10016410.081 ops/s
Iteration  39: 9985380.325 ops/s
Iteration  40: 9769321.126 ops/s
Iteration  41: 9852532.453 ops/s
Iteration  42: 10020184.508 ops/s
Iteration  43: 10101227.242 ops/s
Iteration  44: 9990335.740 ops/s
Iteration  45: 9889533.506 ops/s
Iteration  46: 9914506.976 ops/s
Iteration  47: 9571454.343 ops/s
Iteration  48: 9510566.075 ops/s
Iteration  49: 9871396.205 ops/s
Iteration  50: 

Total operations in this iteration - 0
9858222.113 ops/s

# Run progress: 66.67% complete, ETA 00:00:16
# Fork: 1 of 1
# Warmup Iteration   1: 19:35:16,549 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
19:35:16,549 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
19:35:16,550 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/D:/work/github_personal/otcl2/otcl2-core/target/classes/logback.xml]
19:35:16,680 |-INFO in ch.qos.logback.core.joran.util.ConfigurationWatchListUtil@50f9671d - Adding [file:/D:/otcl-home/config/logback-included.xml] to configuration watch list.
19:35:16,686 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
19:35:16,689 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [consoleLogger]
19:35:16,695 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:35:16,726 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.FileAppender]
19:35:16,730 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [otclLogger]
19:35:16,731 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
19:35:16,732 |-INFO in ch.qos.logback.core.FileAppender[otclLogger] - File property is set to [d:/otcl-home/logs/otcl.log]
19:35:16,734 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.otcl] to DEBUG
19:35:16,734 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [otclLogger] to Logger[org.otcl]
19:35:16,735 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[org.otcl]
19:35:16,735 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to DEBUG
19:35:16,735 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [consoleLogger] to Logger[ROOT]
19:35:16,736 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
19:35:16,737 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@7e72dd57 - Registering current configuration as safe fallback point
[INFO ] 2021/02/24 19:35:16 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Begining OTCL deployment from D:\otcl-home\bin\ 
[INFO ] 2021/02/24 19:35:17 [org.otcl.test.benchmark.otcl2.JmhTest.test-jmh-worker-1] o.o.c.e.DeploymentContainerImpl - Completed OTCL deployments. 
initialized OTCL 2 test ...............
7030054.326 ops/s
# Warmup Iteration   2: 7621563.355 ops/s
# Warmup Iteration   3: 9318114.142 ops/s
# Warmup Iteration   4: 9383459.035 ops/s
# Warmup Iteration   5: 9937256.474 ops/s
# Warmup Iteration   6: 9819193.027 ops/s
# Warmup Iteration   7: 9981914.133 ops/s
# Warmup Iteration   8: 9863682.776 ops/s
# Warmup Iteration   9: 10003425.235 ops/s
# Warmup Iteration  10: 9798476.896 ops/s
Iteration   1: 10026345.115 ops/s
Iteration   2: 10001569.458 ops/s
Iteration   3: 9904753.976 ops/s
Iteration   4: 9790171.735 ops/s
Iteration   5: 9398589.346 ops/s
Iteration   6: 9890054.479 ops/s
Iteration   7: 9855592.615 ops/s
Iteration   8: 9939459.578 ops/s
Iteration   9: 9697733.073 ops/s
Iteration  10: 9652249.697 ops/s
Iteration  11: 9882684.615 ops/s
Iteration  12: 9845106.509 ops/s
Iteration  13: 9838863.587 ops/s
Iteration  14: 9763359.320 ops/s
Iteration  15: 9648085.739 ops/s
Iteration  16: 9969666.731 ops/s
Iteration  17: 10019266.281 ops/s
Iteration  18: 9837587.726 ops/s
Iteration  19: 9696371.870 ops/s
Iteration  20: 9449251.430 ops/s
Iteration  21: 9675048.078 ops/s
Iteration  22: 9948893.597 ops/s
Iteration  23: 9858317.312 ops/s
Iteration  24: 9708617.778 ops/s
Iteration  25: 9746857.854 ops/s
Iteration  26: 9853173.481 ops/s
Iteration  27: 9903342.150 ops/s
Iteration  28: 9857893.137 ops/s
Iteration  29: 9715204.006 ops/s
Iteration  30: 9762788.062 ops/s
Iteration  31: 9869737.147 ops/s
Iteration  32: 9892428.232 ops/s
Iteration  33: 9874708.649 ops/s
Iteration  34: 9580807.195 ops/s
Iteration  35: 9676751.894 ops/s
Iteration  36: 9583775.984 ops/s
Iteration  37: 9372715.918 ops/s
Iteration  38: 9878825.680 ops/s
Iteration  39: 9626191.929 ops/s
Iteration  40: 9675528.332 ops/s
Iteration  41: 9788781.150 ops/s
Iteration  42: 9828705.009 ops/s
Iteration  43: 9722199.853 ops/s
Iteration  44: 9610845.532 ops/s
Iteration  45: 9699071.520 ops/s
Iteration  46: 9858313.822 ops/s
Iteration  47: 9874814.125 ops/s
Iteration  48: 9840622.716 ops/s
Iteration  49: 9637404.844 ops/s
Iteration  50: 

9662098.668 ops/s


Result "org.otcl.test.benchmark.otcl2.JmhTest.test":
  9773824.531 ±(99.9%) 73830.472 ops/s [Average]
  (min, avg, max) = (9372715.918, 9773824.531, 10026345.115), stdev = 149141.205
  CI (99.9%): [9699994.059, 9847655.002] (assumes normal distribution)


# Run complete. Total time: 00:00:48

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark      Mode  Cnt        Score       Error  Units
JmhTest.test  thrpt   50  9773824.531 ± 73830.472  ops/s
