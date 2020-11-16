
### Summary

* example for [this question](https://stackoverflow.com/questions/64578015) on Stack Overflow
* see [this egg](https://github.com/codetojoy/easter_eggs_for_gradle/tree/master/egg_StackOverflow_64578015_v2) for a more elegant version of `build.gradle`

### Usage

* `./build.sh` will compile Java and display `Constants.java`
    - edit `./build.sh` to change the `Environment` parameter
* `./run.sh` will compile Java and display `Constants.java`
    - edit `./run.sh` to change the `Environment` parameter

### Notes

* see `build.gradle`. It does the following:
    - generates `src/main/java/net/codetojoy/util/Constants.java`
    - copies `resources/TemplateConstants.java` into place and performs substitutions 
