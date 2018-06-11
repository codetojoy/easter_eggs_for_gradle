
### Resources

* see [doc](https://docs.gradle.org/4.8/userguide/signing_plugin.html)
* [Gnu Privacy Guard](https://gnupg.org/)
* [GPG How To](https://www.dewinter.com/gnupg_howto/english/GPGMiniHowto.html)
* [blog post](https://davesteele.github.io/gpg/2014/09/20/anatomy-of-a-gpg-key/)

### Setup

* uses Gradle 4.8 on Mac
* uses Gnu Privacy Guard via Docker
    * in the folder of this repo on Mac
    * see `Dockerfile`
    * to build container:
        * `docker run --rm -i -t -v $(pwd):/data gnupg`
    * to attach to running container:
        * find <containerId> with `docker ps -a | grep gnupg`
        * `docker start <containerId>`
        * `docker attach <containerId>`

### Generate Key

* follow doc [here](https://www.dewinter.com/gnupg_howto/english/GPGMiniHowto-3.html#ss3.1) 
* of course, note the passphrase used and keep secret
* to generate entropy: 
    * `ping www.cnn.com &` and others
    * monitor `cat /proc/sys/kernel/random/entropy_avail`
        * GPG will drain this to 0 but we want to replenish with values (e.g. 50)
        * if it remains at 0, then generating a key will come to a grinding halt

### Gradle configuration

* in `gradle.properties`:
    * `signing.keyId`
        * assume that key name is "CodeToJoy"
        * `gpg --fingerprint "CodeToJoy"`
        * use last 8 symbols of fingerprint 
    * `signing.secretKeyRingFile`
        * in Docker
            * mkdir `area51`
            * `gpg --keyring secring.gpg --export-secret-keys > ./area51/secring.gpg`
        * use host/Mac absolute path to `secring.gpg`
    * `signing.password properties`
        * passphrase used to generate the key
* DO NOT check-in `gradle.properties` with these values

### Build and Sign

* `gradle clean build sign`

### Verify

* in Docker image
    * `mkdir /data/staging`
* on Mac
    * from `./build/libs` copy both `simple_app-1.0.0-RELEASE.war` and `simple_app-1.0.0-RELEASE.war.asc` to `staging`
* in Docker image
    * `gpg --verify simple_app-1.0.0-RELEASE.war.asc simple_app-1.0.0-RELEASE.war`
