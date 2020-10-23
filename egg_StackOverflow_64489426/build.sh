#!/bin/bash

set -e

echo "NOTE: JDK VERSION IS `java -version`"

gradle clean cJ
