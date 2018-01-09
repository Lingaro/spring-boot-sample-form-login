#!/bin/bash
# CI build script
set -e
./mvnw clean verify
git describe > target/version
