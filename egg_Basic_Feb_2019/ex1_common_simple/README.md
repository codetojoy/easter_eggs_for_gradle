
### Notes

* Generates a simple jar named `common-1.0.0.jar`
* Java package is `ca.foo`
    * source code lives in project root
    * test code lives in `test`
* see `build.gradle`
    * uses Maven Central repository, but can easily use JCenter or on-prem repository
    * defines dependencies much like Maven
    * flexible 'source sets' which define code location
    * configurable artifact info such as jar name, version, etc

### To Run

* `gradle build`
    * compiles code, runs the tests
    * builds the artifact
* view jar in `build/libs`

