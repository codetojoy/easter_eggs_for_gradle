
### Summary

* example for [this question](https://stackoverflow.com/questions/64489426) on Stack Overflow

### Use-case 1

* `sdk use java 8u131`
* edit `build.gradle` so that compatibility flags are commented out 
* `sdk use java 7.0.181-zulu`
* `./run.sh`
    - this should fail, because it is built as JDK 8 

### Use-case 2

* `sdk use java 8u131`
* edit `build.gradle` so that compatibility flags are enabled
* `sdk use java 7.0.181-zulu`
* `./run.sh`
    - this should work, because it is built as JDK 1.7 
