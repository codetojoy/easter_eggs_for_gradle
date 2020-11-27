
### Summary 

* example for [this question](https://stackoverflow.com/questions/65019617) on Stack Overflow

### Tools 

* [SDKMan!](https://sdkman.io/) is extremely useful for testing this 
    - it allows installing/switching versions of Java, Gradle, Maven, etc

### Notes: Jersey

* it is possible that Jersey (e.g. `@GET`) was contained in JDK 7, then moved out of JDK 8 and requires a jar
    - TODO: confirm this with link 
* the following works with JDK 7.0.181-zulu and Gradle 4.7:
    - `gradle -b build.gradle.jdk7 clean compileJava` 
        - note separate Gradle file
    - however JDK 8+ requires this jar: 
        - `implementation 'org.glassfish.jersey.containers:jersey-container-servlet:2.14'`

### Notes: Netflix

* the following works with JDK 11.0.2-open and Gradle 6.7:
    - `gradle clean compileJava` 
    - I get a compile error on this with JDK 8
* it is possible that some Netflix jars don't specify all of the transitive dependencies, in the respective POM files
    - I had to do some digging to find, for example, `governator`
* `runJavaWithExec` doesn't work for me, despite trying many versions of the JDK 
