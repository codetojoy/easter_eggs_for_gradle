#!/bin/bash 

rm -rf dirDest
rm -rf dirSrc

mkdir dirDest
mkdir dirSrc

echo "abc" > dirSrc/abc.txt
echo "ijk" > dirSrc/ijk.txt

# this one will be deleted by the sync
echo "xyz" > dirDest/xyz.txt
