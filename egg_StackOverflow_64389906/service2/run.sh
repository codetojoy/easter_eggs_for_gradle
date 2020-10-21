#!/bin/bash

set -e

./build.sh 

java -jar build/libs/service2-0.0.2-SNAPSHOT.jar

echo "Ready."
