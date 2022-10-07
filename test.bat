
::antlr4 MAT.g4
::antlr4 -Dlanguage=Cpp MAT.g4 -o mat_cpp
antlr4 -Dlanguage=Python3 MAT.g4 -o mat_py 
::javac MAT*.java
python main.py mattest.mat
::taskkill /im java.exe /f
::start /b grun MAT start -gui mattest.mat
::C:\\"Program Files"\\"National Instruments"\\"Digital Pattern Compiler"\\DigitalPatternCompiler.exe -pinmap __TMP.pinmap __TMP.digipatsrc
