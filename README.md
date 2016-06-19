# springboot-test

## configure
* java 1.8+
* maven 3.3+
* spring-boot 1.3.5
* idea 15
* Thymeleaf 3

## how to run
1. [install java 1.8](#java)
2. [install maven](#maven)
2. [clone code and run](#run)







## <a name="java"/>install java 1.8
1. download from https://yunpan.cn/cR2GuInzbzWfh （提取码：a6c7）
2. double-click and install to your windows and make sure the install path contains no Chinese
3. find the install path, it may like
>     D:\Java\jdk1.8.0_73
4. add to System environment 添加到环境变量。
>    右键我的电脑-》属性-》高级系统设置-》环境变量-》新建 JAVA_HOME:D:\Java\jdk1.8.0_73
![javahome](src/main/webapp/images/javahome.png "JAVA_HOME")
>    将%JAVA_HOME%/bin;追加到path环境变量。若path变量结尾没有分号，则先添加分号，注意是英文的分号
![path](src/main/webapp/images/path.png "path")
5. 测试是否安装成功。   打开命令提示符（开始》运行》cmd 或win+r 输入cmd）输入java -version 和javac -version。如果显示如下则安装成功
            ![cmd](src/main/webapp/images/cmd.png "cmd")
```
     C:\Users\miaorf>java -version
     java version "1.8.0_77"
     Java(TM) SE Runtime Environment (build 1.8.0_77-b03)
     Java HotSpot(TM) 64-Bit Server VM (build 25.77-b03, mixed mode)
     C:\Users\miaorf>javac -version
     javac 1.8.0_73
```
## <a name="maven"/>install maven
1. 下载压缩包   https://yunpan.cn/cR2DrHF3UZAzg （提取码：a38a）并解压到合适的目录，比如解压后为：D:\Java\apache-maven-3.3.9
2. 添加到环境变量,像java一样 ：  新建 MAVEN_HOME:D:\Java\apache-maven-3.3.9，追加到path:%MAVEN_HOME%\bin
3. 测试是否安装成功
```
    在cmd中输入：
 C:\Users\miaorf>mvn -version
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-11T00:41:47+08:00)
Maven home: D:\Java\apache-maven-3.3.9\bin\..
Java version: 1.8.0_73, vendor: Oracle Corporation
Java home: D:\Java\jdk1.8.0_73\jre
Default locale: zh_CN, platform encoding: GBK
OS name: "windows 10", version: "10.0", arch: "amd64", family: "dos"
```

## <a name="run"/>clone code and run
在d盘创建一个你放代码的地方，比如：d:/workspace.cmd进入d盘并clone：
```
 git clone git@github.com:chenxing12/springboot-test.git
```
![clone](src/main/webapp/images/clone.png "clone")

运行项目：
```
mvn spring-boot:run
```
第一次运行会下载依赖的包，大概需要几分钟，如果运行成功，则显示如下：
```
D:\workspace>cd springboot-test

D:\workspace\springboot-test>mvn spring-boot:run
[INFO] Scanning for projects...
[WARNING]
[WARNING] Some problems were encountered while building the effective model for com.test:springboot-test:jar:1.0-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.springframework.boot:spring-boot-maven-plugin is missing. @ line 49, column 21
[WARNING]
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING]
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING]
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building springboot-test 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> spring-boot-maven-plugin:1.3.5.RELEASE:run (default-cli) > test-compile @ springboot-test >>>
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ springboot-test ---
[WARNING] Using platform encoding (GBK actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 2 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ springboot-test ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding GBK, i.e. build is platform dependent!
[INFO] Compiling 3 source files to D:\workspace\springboot-test\target\classes
[WARNING] /D:/workspace/springboot-test/src/main/java/com/test/controller/HelloController.java: D:\workspace\springboot-test\src\main\java\com\test\controller\HelloController.java使用了未经检查或不安全的操作。
[WARNING] /D:/workspace/springboot-test/src/main/java/com/test/controller/HelloController.java: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ springboot-test ---
[WARNING] Using platform encoding (GBK actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory D:\workspace\springboot-test\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ springboot-test ---
[INFO] No sources to compile
[INFO]
[INFO] <<< spring-boot-maven-plugin:1.3.5.RELEASE:run (default-cli) < test-compile @ springboot-test <<<
[INFO]
[INFO] --- spring-boot-maven-plugin:1.3.5.RELEASE:run (default-cli) @ springboot-test ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.3.5.RELEASE)
```


打开浏览器输入：
```
http://localhost:8080/ajax/info.html
```
![info](src/main/webapp/images/info.png "info")




## Teach ajax by springboot

环境安装成功后就可以测试ajax了。更多介绍点击[ajax](./doc/ajax.md)

