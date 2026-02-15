# Java的类加载机制（ClassLoader）

## 一、什么是ClassLoader?
大家都知道，当我们写好一个Java程序之后，不是管是CS还是BS应用，
都是由若干个.class文件组织而成的一个完整的Java应用程序，
当程序在运行时，即会调用该程序的一个入口函数来调用系统的相关功能，
而这些功能都被封装在不同的class文件当中，
所以经常要从这个class文件中要调用另外一个class文件中的方法，
如果另外一个文件不存在的，则会引发系统异常。
而程序在启动的时候，并不会一次性加载程序所要用的所有class文件，
而是根据程序的需要，
通过Java的类加载机制（ClassLoader）来动态加载某个class文件到内存当中的，
从而只有class文件被载入到了内存之后，才能被其它class所引用。
所以ClassLoader就是用来动态加载class文件到内存当中用的。

## 二、Java默认提供的三个ClassLoader

### 1.BootStrap ClassLoader（启动类加载器）

是Java类加载层次中最顶层的类加载器，负责加载JDK中的核心类库，
如：rt.jar、resources.jar、charsets.jar等，
可通过如下程序获得该类加载器从哪些地方加载了相关的jar或class文件：

```java
URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();  
for (int i = 0; i < urls.length; i++) {  
    System.out.println(urls[i].toExternalForm());  
}

以下内容是上述程序从本机JDK环境所获得的结果：
file:/C:/Program%20Files/Java/jdk1.6.0_22/jre/lib/resources.jar
file:/C:/Program%20Files/Java/jdk1.6.0_22/jre/lib/rt.jar
file:/C:/Program%20Files/Java/jdk1.6.0_22/jre/lib/sunrsasign.jar
file:/C:/Program%20Files/Java/jdk1.6.0_22/jre/lib/jsse.jar
file:/C:/Program%20Files/Java/jdk1.6.0_22/jre/lib/jce.jar
file:/C:/Program%20Files/Java/jdk1.6.0_22/jre/lib/charsets.jar
file:/C:/Program%20Files/Java/jdk1.6.0_22/jre/classes/
```

其实上述结果也是通过查找sun.boot.class.path这个系统属性所得知的。
```java
System.out.println(System.getProperty("sun.boot.class.path"));
```