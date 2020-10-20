#!/bin/bash

set -e

gradle clean 

gradle :G_modding:jtta-core:build
gradle :G_modding:jtta-primitive-lite:build

find . -name "*.jar"

