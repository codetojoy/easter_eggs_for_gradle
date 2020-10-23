#!/bin/bash

set -e

echo "NOTE: JDK VERSION IS:"
java -version
echo "" 

java -cp build/classes/java/main Example
