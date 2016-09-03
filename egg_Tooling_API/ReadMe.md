
# Notes

* This example illustrates usage of the [Tooling API](https://docs.gradle.org/current/userguide/embedding.html)
    
* The `service` project has a task `runService` that appends to a file indefinitely.

* The `console` project has a Groovy script that will:
    * Start the `runService` task
    * Wait for a console command
    * Given the command, stop the `runService` task and call the `tasks` task to restart the Gradle daemon

# Usage

* edit the paths in `console\Console.groovy`
* confirm that the `GRADLE_HOME` env var is set 

<pre>
cd console
. ./setvars.sh
groovy Console.groovy
</pre>

