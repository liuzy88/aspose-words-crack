#!/bin/sh

set -e

echo '==> 官网下载'
#wget https://repository.aspose.com/repo/com/aspose/aspose-words/20.12/aspose-words-20.12-jdk17.jar
cp ~/Downloads/aspose-words-20.12-jdk17.jar .

echo '==> 用7z命令删除jar内的META-INF文件夹'
7z d aspose-words-20.12-jdk17.jar META-INF

echo '==> 执行破解,生成类'
javac -classpath .:javassist-3.24.1-GA.jar AsposeWords_20_12.java
java -classpath .:javassist-3.24.1-GA.jar AsposeWords_20_12

echo '==> 用jar命令更新jar内的类'
echo '替换前'
jar -tvf aspose-words-20.12-jdk17.jar|grep zzZDZ
jar uvf aspose-words-20.12-jdk17.jar com/aspose/words/zzZDZ.class
echo '替换后'
jar -tvf aspose-words-20.12-jdk17.jar|grep zzZDZ
rm -rf com/

echo '==> 重命名'
rm -f aspose-words-20.12-jdk17-cracked.jar
mv aspose-words-20.12-jdk17.jar aspose-words-20.12-jdk17-cracked.jar

echo '==> 测试转换'
javac -classpath aspose-words-20.12-jdk17-cracked.jar Office2PdfTest.java
java -classpath .:aspose-words-20.12-jdk17-cracked.jar Office2PdfTest
