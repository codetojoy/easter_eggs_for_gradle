
# Notes

* This example creates 3 dynamic tasks named `task1`, `task2`, and `task3`.
* A `primary` task depends on these 3 tasks. 
* The dynamic tasks are ordered so that they execute in this sequence: `task1`, then `task2`, then `task3`. (This could have been done via dependencies, but is an alternate approach.)
    
# Usage

<pre>
gradle primary
</pre>

