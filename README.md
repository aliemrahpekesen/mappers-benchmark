#mappers-benchmark
You can find MapStruct-Selma-Dozer-Orika-ManualMapping benchmark results in this repo

just run app with an argument. You can find arguments descriptions and test results below;

-d : DOZER // -s : SELMA // -o : ORIKA // -m : MANUAL // -ms : MAPSTRUCT 

> ## System Details of Test Environment
> - Operating System       : Win7 SP1 
> - System Type            : 64-bit OS
> - Processor              : Intel(R) Core(TM) i7-4510U CPU @2.00Ghz 2.60Ghz
> - Memory (RAM)           : 8GB
> - Installed JDK          : jdk1.7.0_79
> - VM Options 
  * -Xmx1024m
  * -Xms512m
  * -XX:PermSize=128M
  * -XX:MaxPermSize=215m


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


