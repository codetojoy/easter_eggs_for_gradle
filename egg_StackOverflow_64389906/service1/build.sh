#!/bin/bash

set -e

gradle -q clean build

find . -name "*.class"
find . -name "*.jar"

echo "Ready."
