
### Summary

* example for [this question](https://stackoverflow.com/questions/64091259) on Stack Overflow

### Notes

* this example replaces Windows paths (e.g. `C:/reporter`) with local substitutes (e.g. `./c_reporter`)

### Usage 1
* it copies the files in the union to the `./dest` folder
* usage: `gradle mytask`
    - inspect the `dest` folder

### Usage 2
* lists files to the console 
* usage: `gradle -b b2.gradle mytask`
