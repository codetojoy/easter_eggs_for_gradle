
### Notes

* this example illustrates input / output for a task

* execute the task:

<pre>
gradle foo
</pre>

* experiment like so:
    * execute again and notice that it is UP-TO-DATE
    * even if timestamp is modified for `in.txt`, another exec remains UP-TO-DATE
    * modify the content of `in.txt`, and another exec will perform the copy

* for continuous build:

<pre>
gradle foo -t
</pre>

* and then change `in.txt` in another window
