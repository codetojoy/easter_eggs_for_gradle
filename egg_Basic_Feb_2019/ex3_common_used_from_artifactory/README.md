
### Notes

* Example of a "service" jar that uses the jar from ex2, via Artifactory
* Java package is `ca.foo`
    * source code lives in project root
    * test code lives in `test`
* Uses `ca.foo.common-1.0.0.jar` from Artifactory
* see `build.gradle`

### To Build

* `gradle build`

### To View Dependencies

* `gradle dependencies`
* output illustrates our jar from Artifactory and a jar from Maven Central:
```
compileClasspath - Compile classpath for source set 'main'.
+--- ca.foo:common:1.0.0
\--- org.apache.commons:commons-lang3:3.5
``` 

