
* example for [this question](https://stackoverflow.com/questions/48815890) on Stack Overflow

### Usage

* `gradle test`
    * 2 tests pass, 2 fail
    * observe failures written to `failures.log`
* execute:
    * rm -rf src
    * cp -r src.all.pass src
* `gradle test`
    * observe 2 failed tests are executed (and now pass)
