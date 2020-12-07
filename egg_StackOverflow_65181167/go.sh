#!/bin/bash

set -e

gradle clean $1

echo "finding..."

find build/classes -name "*.class"
find build/reports/tests -name "*.html"

echo "Ready."
