#!/bin/bash

set -e

rm -f examples.jar
./gradlew dAJ

unzip -l examples.jar 
