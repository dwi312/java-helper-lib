#!/bin/bash
# Build script untuk Java Helper Library

# Buat folder output
mkdir -p out

# Compile source code
javac -d out src/helper/AppHelper.java

# Buat JAR dari hasil compile
jar cf helper-lib.jar -C out .

# Bersihkan folder out (opsional)
rm -rf out

echo "Build selesai! File JAR: helper-lib.jar"
