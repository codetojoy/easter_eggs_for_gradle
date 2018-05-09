
gradle clean fatJar
rm -rf tmp
mkdir -p tmp/config

cp build/libs/example.jar tmp
cp data.txt tmp/config

cd tmp
java -jar example.jar
cd - 
