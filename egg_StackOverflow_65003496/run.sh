#!/bin/bash

set -e

mkdir -p myDir anotherDir
echo "hello" > ./myDir/Util.class
echo "hello" > ./myDir/abcd.class
echo "hello" > ./myDir/pars.class

rm -f ./anotherDir/*.class

gradle copyUtil

ls -lrt ./anotherDir
