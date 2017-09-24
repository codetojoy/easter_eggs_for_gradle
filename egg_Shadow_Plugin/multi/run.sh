
gradle clean

gradle :app:${1}:shadowJar

java -jar app/${1}/build/libs/${1}*all.jar 

