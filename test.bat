taskkill /im java.exe /f
antlr4 MAT.g4
antlr4 -Dlanguage=Python3 MAT.g4
javac MAT*.java
python main.py mattest.mat
start /b grun MAT complete -gui mattest.mat
