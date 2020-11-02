#!/bin/bash

set -e

cp ./Original.txt src/main/java/Example.java

cat src/main/java/Example.java

gradle fmt 

cat src/main/java/Example.java
