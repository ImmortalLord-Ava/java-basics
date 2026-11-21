#!/usr/bin/env bash
# 编译并运行。用法：./run.sh
set -euo pipefail

cd "$(dirname "$0")"

rm -rf out
mkdir -p out

javac -encoding UTF-8 -d out $(find src -name '*.java')
java -cp out practice.App
