#mappers-benchmark
You can find MapStruct-Selma-Dozer-Orika-ManualMapping benchmark results i this repo

just run app with an argument. You can find arguments desctiptions and test results in below;

-d : DOZER // -s : SELMA // -o : ORIKA // -m : MANUAL // -ms : MAPSTRUCT 


> ## Orika Test Results
cmd     : java -jar BenchMarking.jar -o 100

> - Total Miliseconds  : 3433
> - Times              : 100
> - Average Milisecods : 34.33

> ## Dozer Test Results
cmd     : java -jar BenchMarking.jar -d 100

> - Total Miliseconds  : 681
> - Times              : 100
> - Average Milisecods : 6.81

> ## Selma Test Results
cmd     : java -jar BenchMarking.jar -s 100

> - Total Miliseconds  : 535
> - Times              : 100
> - Average Milisecods : 5.35

> ## MapStruct Test Results
cmd     : java -jar BenchMarking.jar -ms 100

> - Total Miliseconds  : 499
> - Times              : 100
> - Average Milisecods : 4.99

> ## Manual Mapping Test Results
cmd     : java -jar BenchMarking.jar -m 100

> - Total Miliseconds  : 466
> - Times              : 100
> - Average Milisecods : 4.66
