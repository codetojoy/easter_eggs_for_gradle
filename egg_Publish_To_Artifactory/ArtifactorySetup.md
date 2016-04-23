
* this doc assumes that Docker is installed on Mac OS X

* in Docker shell, discover the IP address (we need it later):

<pre>$ echo $DOCKER_HOST</pre>
<pre>tcp://192.168.99.100:2376</pre>

* pull image:

`docker pull jfrog-docker-reg2.bintray.io/jfrog/artifactory-oss`

* set environment variable for volumes:

`export ARTIFACTORY_HOME=/var/opt/jfrog/artifactory`

* run the Docker container for Artifactory:

<pre>docker run --name Sandbox3 -p 8081:8081 -p 80:80 -p 443:443 \</pre>
<pre>-v $ARTIFACTORY_HOME/data -v $ARTIFACTORY_HOME/logs -v $ARTIFACTORY_HOME/backup -v $ARTIFACTORY_HOME/etc \</pre>
<pre>jfrog-docker-reg2.bintray.io/jfrog/artifactory-oss:latest</pre>

* browse to this link (using IP address from `DOCKER_HOST`): http://192.168.99.100:8081/artifactory
    * default credentials are *admin/password*

