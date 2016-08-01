
* inspired by [mrhaki.com](http://mrhaki.blogspot.ca/2013/01/groovy-goodness-adding-extra-methods.html)
* there are two projects:
    * `extension` has a simple camel-case method that converts `this is a test` into `thisIsATest`
    * `dsl` uses the jar created by the `extension` project, which is written to a local `jars` directory

* to build the extension jar: 
```bash
gradle :extension:jar
```

* to run the tests in `dsl`:
```bash
gradle :dsl:build
```
