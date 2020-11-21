#!/bin/bash

set -e

rm -f *.zip

gradle sourceDrop 

unzip -l sourceDrop-1.0.zip 
