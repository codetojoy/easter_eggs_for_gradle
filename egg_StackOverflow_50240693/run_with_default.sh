
gradle clean fatJar
rm -rf tmp
mkdir -p tmp/config

cp build/libs/example.jar tmp

cd tmp
java -jar example.jar
cd - 
