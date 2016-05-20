#mappers-benchmark
You can find MapStruct-Selma-Dozer-Orika-ManualMapping benchmark results i this repo

just run app with an argument. You can find arguments desctiptions and test results in below;

-d : DOZER // -s : SELMA // -o : ORIKA // -m : MANUAL // -ms : MAPSTRUCT 


> ## Orika Test Results
cmd     : java -jar BenchMarking.jar -o 10000

>Before Warm Up JVM

> - Total Miliseconds  : 61134
> - Times              : 10000
> - Average Milisecods : 6.1134

>After Warm Up JVM

> - Total Miliseconds  : 59891
> - Times              : 10000
> - Average Milisecods : 5.9891

> ## Dozer Test Results
cmd     : java -jar BenchMarking.jar -d 10000

>Before Warm Up JVM

> - Total Miliseconds  : 2010
> - Times              : 10000
> - Average Milisecods : 0.201

>After Warm Up JVM

> - Total Miliseconds  : 1943
> - Times              : 10000
> - Average Milisecods : 0.1943

> ## Selma Test Results
cmd     : java -jar BenchMarking.jar -s 10000

>Before Warm Up JVM

> - Total Miliseconds  : 823
> - Times              : 10000
> - Average Milisecods : 0.0823

>After Warm Up JVM

> - Total Miliseconds  : 811
> - Times              : 10000
> - Average Milisecods : 0.0811

> ## MapStruct Test Results
cmd     : java -jar BenchMarking.jar -ms 10000

>Before Warm Up JVM

> - Total Miliseconds  : 671
> - Times              : 10000
> - Average Milisecods : 0.0671

>After Warm Up JVM

> - Total Miliseconds  : 604
> - Times              : 10000
> - Average Milisecods : 0.0604

> ## Manual Mapping Test Results
cmd     : java -jar BenchMarking.jar -m 10000

>Before Warm Up JVM

> - Total Miliseconds  : 591
> - Times              : 10000
> - Average Milisecods : 0.0591

>After Warm Up JVM

> - Total Miliseconds  : 584
> - Times              : 10000
> - Average Milisecods : 0.0584


