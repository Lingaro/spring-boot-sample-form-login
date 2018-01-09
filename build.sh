#!/bin/bash
# CI build script
set -e
cd `dirname $0`
./mvnw clean
mkdir -p target/classes
git describe > target/classes/VERSION
./mvnw verify
