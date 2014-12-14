@echo off

%~d0
cd "%~dp0"

call .\.props.bat


rmdir /s /q "%CLASSES_DIR%" >nul 2>nul

%ANTLR% -o "%ANTLR_SRC_DIR%" MathExpr.g

mkdir "%CLASSES_DIR%" >nul 2>nul
%JAVAC% -classpath ".;%ANTLR_JAR%" -sourcepath ".;%SRC_DIR%;%ANTLR_SRC_DIR%" -d "%CLASSES_DIR%" *.java
