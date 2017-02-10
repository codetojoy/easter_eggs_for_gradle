
### To Run 

* to build all projects:

<pre>
find . -name "*.jar" -exec rm {} \; 
gradle build -p build_all 
find . -name "*.jar"
</pre>

* to build 'A' projects;

<pre>
find . -name "*.jar" -exec rm {} \; 
gradle build -p build_As 
find . -name "*.jar"
</pre>

* to build '2' projects;

<pre>
find . -name "*.jar" -exec rm {} \; 
gradle build -p build_2s 
find . -name "*.jar"
</pre>
