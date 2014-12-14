@echo off

%~d0
cd "%~dp0"

call .\.props.bat


rmdir /s /q "%CLASSES_DIR%" >nul 2>nul
rmdir /s /q "%ANTLR_SRC_DIR%" >nul 2>nul
