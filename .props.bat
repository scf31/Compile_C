@echo off

%~d0
cd "%~dp0"


set JAVA_HOME=D:\Applications\JDK 7\

set ANTLR_JAR=.\lib\antlr-3.2.jar
rem set ANTLR_JAR=.\lib\antlr-3.4-complete.jar


set JAVA="%JAVA_HOME%\bin\java"
set JAVAC="%JAVA_HOME%\bin\javac"

set ANTLR=%JAVA% -classpath .;%CLASSPATH%;%ANTLR_JAR% org.antlr.Tool


set SRC_DIR=.
set ANTLR_SRC_DIR=.\generated
set CLASSES_DIR=.\classes

set INPUT_FILE=.\in.txt
