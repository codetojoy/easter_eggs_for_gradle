
### Idea

* 'core' uses 'component' which uses 'utils'
* Q: can 'core' use classes from 'utils' ?
    * A: with Java Library Plugin, it depends
    * A1: if 'component' exports 'utils' as 'api', 'core' can see it
    * A2: if 'component' shields 'utils' as 'implementation', 'core' can't see it

