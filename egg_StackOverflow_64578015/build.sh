#!/bin/bash

set -e

gradle compileJava -PEnvironment=uat 

cat src/main/java/net/codetojoy/util/Constants.java
