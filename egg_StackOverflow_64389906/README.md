
* example for [this question](https://stackoverflow.com/questions/64389906) on Stack Overflow
* We note that the question states that each project/service is in its own repository, but this example doesn't prevent that.

### Usage Example

* place `spring-boot.txt` onto appropriate web server (possibly CI/CD server)
    - note that is a simple text file, but it could easily be a more formal JSON specification
* edit `service1/build.gradle` and `service2/build.gradle` with appropriate URI
* `cd service1`
    * `./run.sh`
    * browse to http://localhost:5150/greeting
* `cd service2`
    * `./run.sh`
    * browse to http://localhost:6160/greeting
