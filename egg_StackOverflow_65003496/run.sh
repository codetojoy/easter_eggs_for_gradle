#!/bin/bash

set -e

rm -rf myDir anotherDir 

mkdir -p myDir/util myDir/abcd myDir/parsing_jars
mkdir -p anotherDir

echo "hello" > ./myDir/util/Util.jar
echo "hello" > ./myDir/abcd/abcd.jar
echo "hello" > ./myDir/parsing_jars/pars.jar

rm -f ./anotherDir/*.jar

gradle copyUtil

ls -lrt ./anotherDir
