@echo off

%~d0
cd "%~dp0"

call .\.props.bat


%JAVA% -classpath ".;%CLASSES_DIR%;%ANTLR_JAR%" main.Program "%INPUT_FILE%"
