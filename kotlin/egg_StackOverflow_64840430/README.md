
### Summary

* example for [this question](https://stackoverflow.com/questions/64840430) on Stack Overflow
* usage: `gradle clean run`
* generates `src/main/kotlin/net/codetojoy/Version.kt` from `resources/TemplateVersion.kt`
* NOTE: 
    - new task called `generateVersion` that uses proper Gradle inputs/outputs
    - `compileKotlin` depends on `generateVersion`
* tested with
    - JDK: openjdk 11-ea 2018-09-25
    - Gradle: 6.7
