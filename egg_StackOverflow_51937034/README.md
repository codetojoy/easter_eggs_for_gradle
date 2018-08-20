
* example for [this question](https://stackoverflow.com/questions/51937034) on Stack Overflow

### Usage

* `gradle clean run`

### Notes

* this example stamps `templates\BuildInfo.java` with build info and writes it to `src/main/java/net/codetojoy/util`
    * `appVersion` is defined in gradle.properties
    * `build timestamp` is generated in `build.gradle`
    * the actual stamp code is in `build.gradle`
