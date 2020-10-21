#!/bin/bash

set -e

./build.sh 

java -jar build/libs/service1-0.0.2-SNAPSHOT.jar

echo "Ready."
