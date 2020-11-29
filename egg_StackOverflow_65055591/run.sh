#!/bin/bash

set -e 

./gradlew clean jar

ls -lrt build/libs 
