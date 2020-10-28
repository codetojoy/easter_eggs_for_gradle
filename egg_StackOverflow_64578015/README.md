
### Summary

* example for [this question](https://stackoverflow.com/questions/64578015) on Stack Overflow

### Usage

* `./build.sh` will compile Java and display `Constants.java`
    - edit `./build.sh` to change the `Environment` parameter
* `./run.sh` will compile Java and display `Constants.java`
    - edit `./run.sh` to change the `Environment` parameter

### Notes

* see `build.gradle`. It does the following:
    - generates `src/main/java/net/codetojoy/util/Constants.java`
    - copies `resources/TemplateConstants.java` into place and performs substitutions 
