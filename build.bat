@echo off
REM Build script untuk Java Helper Library

REM Buat folder output
if not exist out mkdir out

REM Compile source code
javac -d out src\helper\AppHelper.java

REM Buat JAR dari hasil compile
jar cf helper-lib.jar -C out .

REM Hapus folder out (opsional)
rmdir /s /q out

echo Build selesai! File JAR: helper-lib.jar
pause
