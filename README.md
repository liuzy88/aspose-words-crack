# aspose-words-crack

## 破解版下载

- 20.12 `http://upload.liuzy88.com/aspose-words-20.12-jdk17-cracked.jar`
- 19.5 `http://upload.liuzy88.com/aspose-words-19.5-jdk17-cracked.jar`
- 19.1 `http://upload.liuzy88.com/aspose-words-19.1-jdk16-cracked.jar`
- 18.5 `http://upload.liuzy88.com/aspose-words-18.5-jdk16-cracked.jar`

## 通用破解去水印:

- 1. 官网下载`https://repository.aspose.com/repo/com/aspose/aspose-words/20.12/aspose-words-20.12-jdk17.jar`
- 2. 引用到jar包到项目;打开`com.aspose.words.License`类,观察`setLicense`方法,进入`com.aspose.words.zzZ??`类,搜索`? 0 : 1;`
- 3. Maven导入`javassist`库,运行破解代码,生成`zzZ??.class`
- 4. 解压jar,删除`META-INF`,替换`com.aspose.words.zzZ??.class`
- 5. 使用jar命令,重新压缩生成jar
- 6. 得到`aspose-words-20.12-jdk17-cracked.jar`,运行`Office2PdfTest`测试


## 一键破解脚本

```bash
#!/bin/sh

set -e

echo '==> 官网下载'
wget https://repository.aspose.com/repo/com/aspose/aspose-words/20.12/aspose-words-20.12-jdk17.jar
# cp ~/Downloads/aspose-words-20.12-jdk17.jar .

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

```