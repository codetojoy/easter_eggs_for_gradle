#!/bin/bash

set -e

cp ./Original.txt src/main/java/Example.java

echo "-------------------------------"
echo "ORIGINAL file:"
cat src/main/java/Example.java
echo "-------------------------------"

gradle fmt 

echo "-------------------------------"
echo "FORMATTED file:"
cat src/main/java/Example.java
echo "-------------------------------"
