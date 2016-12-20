
### Structure

* `utils` and `service` are libraries used by `app`
* `mainBuild` is the composite build of the above
 
### Usage 

* `cd utils ; gradle uploadArchives` to write deliverable to `~/jars`
* `cd service ; gradle uploadArchives` to write deliverable to `~/jars`
* `cd mainBuild ; gradle run`
* note build numbers in output
* observe `~/mainBuild/settings.gradle`
* e.g. if `utils` is defined as an *includedBuild* then the project overrides
  the jar *without* re-writing it 
