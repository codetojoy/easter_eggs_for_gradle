
### Notes

* Generates a simple jar named `common-1.0.0.jar`
* Java package is `ca.foo`
    * source code lives in project root
    * test code lives in `test`
* Publishes to Artifactory into `libs-release-snapshot`
* Contains build information which can be interrogated
* see `build.gradle`

### To Publish To Artifactory 

* `gradle publish`
    * compiles code, runs the tests
    * builds the artifact
    * publishes the artifact to Artifactory
* view jar in Artifactory in `libs-release-snapshot`

### To View Build Info

* A template file is used. See `~/resources/TemplateBuildInfo.java`
    * This is "stamped" into `ca/foo/BuildInfo.java` for every build
* `gradle build`
* confirm that jar is in `~/build/libs`
* example run:
```
$ java -cp build/libs/common-1.0.0.jar ca.foo.BuildInfo

artifact      : common
version         : 1.0.0
build timestamp : Sun Feb 10 16:12:30 AST 2019
git info        : cb9dd53 example 1 under Feb 2019 basics
``` 

