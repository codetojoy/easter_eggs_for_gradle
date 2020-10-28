#!/bin/bash

set -e

gradle jar -PEnvironment=dev 

cd ./build/libs

java -cp example-1.0.0.jar net.codetojoy.example.Example

cd ../..
