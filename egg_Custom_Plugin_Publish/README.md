
### Summary

* debugging a situation where I'm trying to use a custom plugin from Artifactory
* `plugin` creates a jar with a simple `GreetingPlugin`
* `client` is a testing project:
    * using the jar on the file system works fine
    * publishing the jar to Artifactory, then downloading to a new location on the file system works fine
    * using the jar from Artifactory works fine here, but not in other contexts
