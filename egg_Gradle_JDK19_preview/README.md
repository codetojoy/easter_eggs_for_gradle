
Summary:
---------

* this example illustrates structured concurrency
* two tasks: `foo` and `bar`
    - can be configured to succeed or fail
* NOTE
    - happy path: one task takes X seconds; the other takes Y seconds
    - when one task is configured to fail, the other is interrupted
* many other examples of virtual threads and structured concurrency are [here](https://github.com/codetojoy/easter_eggs_for_java_loom)
    - this example is essentially 'egg_5_sc_invoke_all'

Build Notes:
------------

* requires JDK 19
* requires modern version of Gradle (uses wrapper to obtain appropriate version)
* tested with [this version](./Gradle.version.md) of Gradle 
* see also [this Github Action](../.github/workflows/build_egg_StackOverflow_03_NOV.yml)

To Build:
---------

* `./gradlew clean compileJava`

To Run:
-------

* `./gradlew run`

Misc:
-----

* [SDKMan!](https://sdkman.io/) is handy to get various versions of JDK
* `sdk env`
    - SDKMan! will set JDK to value in `.sdkmanrc`

