# otc-test

------ dated 24th Feb 21.  

OTC Executor
-------------
Round 1:
Result "org.otc.test.benchmark.otc.JmhTest.test":
  9978236.474 ±(99.9%) 57706.154 ops/s [Average]
  (min, avg, max) = (9664690.420, 9978236.474, 10149562.674), stdev = 116569.286
  CI (99.9%): [9920530.320, 10035942.628] (assumes normal distribution)

Round 2:
Result "org.otc.test.benchmark.otc.JmhTest.test":
  9773824.531 ±(99.9%) 73830.472 ops/s [Average]
  (min, avg, max) = (9372715.918, 9773824.531, 10026345.115), stdev = 149141.205
  CI (99.9%): [9699994.059, 9847655.002] (assumes normal distribution)

  

Other frameworks : 
--Mapstruct
Round 1:
Result "org.otc.test.benchmark.mapstruct.JmhTest.test":
  883245.177 ±(99.9%) 9058.397 ops/s [Average]
  (min, avg, max) = (820666.780, 883245.177, 904527.186), stdev = 18298.410
  CI (99.9%): [874186.780, 892303.574] (assumes normal distribution)


-- OTC
Round 2:
Result "org.otc.test.benchmark.mapstruct.JmhTest.test":
  876863.135 ±(99.9%) 9626.390 ops/s [Average]
  (min, avg, max) = (806265.740, 876863.135, 908486.078), stdev = 19445.783
  CI (99.9%): [867236.745, 886489.525] (assumes normal distribution)




  