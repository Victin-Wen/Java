## video 01 关键字和保留字 第二章
### 本章内容
- 2.1 关键字
- 2.2 标识符
- 2.3 变量
- 2.4 运算符
- 2.5 程序流程控制
- 2.6 数组

### 2.1 关键字
- 被Java语言赋予特殊含义，有专门用途的字符串(单词)
- 特点：所有字母均小写

### 保留字
可能在以后被用来作为关键字的单词

## video 02 文本编辑器
Windows系统下：Notepad++，UltraEdit，Editplus
Mac：Sublime 
## video 03 标识符
### 2.2 标识符
定义：对各种变量、方法和类等要素命名时使用的字符序列称为标识符；凡是自己可以起名字的地方都叫标识符
规则：

> 由26个字母大小写，0-9，_或$组成
> 数字不可以开头
> 不能使用关键字和保留字，但能包含关键字和保留字
> Java中严格区分大小写，长度无限制
> 标识符不能包含空格

** 注意 ** 见名知意
- 名称命名规范

> 包名：多单词所有字母都小写: myfamily
> 类名、接口名：驼峰命名，多单词组成时每个首字母大写：MyFamily
> 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写: xxxYyyZzz
> 常量名：所有字母都大写。多单词时每个单词用下划线连接: XXX_YYY_ZZZ

## video 04 变量的概念和定义
### 2.3 变量 
数据类型 变量名 = 变量的值
例如：`int i = 1`
- 变量的概念：
内存中的一个存储区域
该区域有自己的名称（变量名）和类型（数据类型）
Java中每个变量必须先声明，后使用
该区域的数据可以在同一类型范围内不断变化
- 使用变量注意：
变量的作用域：一对{ }之间有效	
初始化值
- 定义变量的格式：数据类型    变量名  =  初始化值
- 变量是通过使用变量名来访问这块区域的

## video 05 数据类型（1）

> 数据类型
>> 基本数据类型 （8种，除此之外的都是引用数据类型）
>>> 数值型 
>>>> 整数类型 （byte, short, int, long）
>>>> 浮点类型 （）
>>> 字符型 （）
>>> 布尔型 （）
>> 引用数据类型 （）
>>> 类 （）
>>> 接口 （）
>>> 数组 （）

### 引用类型
- 引用类型都可以用null作为值，即可以在初始化时赋值为null
- String是引用类型
- String类是一个典型的不可变类，String对象创建出来就不可能被改变。创建出的字符串将存放在数据区，保证每个字符串常量只有一个，不会产生多个副本。

```
String s0 = “hello”;
String s1 = “hello”;
String s2 = “he” + “ll”+”o”;
System.out.println(s0 ==s1);
System.out.println(s0 ==s2);
```

> int i0 = 1
> int i1 = 1

这种会在内存中存储两个1的值

> String s0 = "hello"
> String s1 = "hello"

以上只存在一个hello
假设“hello”的内存地址xxxxxx，声明s0变量时给s0赋值“hello”实际上让s0变量引用“hello”的内存地址xxxxxx，再让s1也赋值“hello”实际也是直接把已存在的“hello”的内存地址给s1引用。

## video 06 集成开发环境和eclipse
创建一个java文件用文件编辑器打开 -> 写代码 -> 打开dos界面 -> javac编译 -> java运行 （过程繁琐，效率不高）
集成开发环境解决了这个问题，里面包含文本编辑工作、自动编译、简化运行、随时进行代码调试
## 集成开发环境
Eclipse安装：注意Eclipse和jdk的位数要一致。
打开.exe，Window -> Preference -> General -> Startup and Shutdown
workspace
create a java project -> Project name

> Use default JRE 'jdk-13.0.1' and workspace complier preferences -> finish 
## video 07 数据类型补充

- 自动类型转换：容量小的类型自动转换为容量大的数据类型。
- 数据类型从小到大分别是byte,short,int,long,float,double
- 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。      
- byte,short,char之间不会相互转换，他们三者在计算时首先转换为int类型。
- 当把任何基本类型的值和字符串值进行连接运算时(+)，基本类型的值将自动转化为字符串类型。 

## 练习一

```
String str1 = 4;        //判断对错：错  需要加上双引号
String str2 = 3.5f + “”;             //判断str2对错：对
System.out.println(str2);        //输出：3.5
System.out .println(3+4+“Hello!”);      //输出：7Hello!
System.out.println(“Hello!”+3+4);      //输出：Hello!34
System.out.println(‘a’+1+“Hello!”);    //输出：98Hello!
System.out.println(“Hello!”+‘a’+1);            //输出：Hello!a1
```

## 强制类型转换
自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符（()），但可能造成精度降低或溢出,格外要注意。
通常，字符串不能直接转换为基本类型，但通过基本类型对应的包装类则可以实现把字符串转换成基本类型。
如： `String a = “43”; int i = Integer.parseInt(a);`
boolean类型不可以转换为其它的数据类型。  
### 数据类型的运算规则
1. 多种数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型然后进行计算。数据类型从小到大分别是byte,short,int,long,float,double
2. 数据类型的运算中，多个相同类型变量参与的运算，变量要先转换为相对应的数据类型的默认类型（比如两个byte类型的变量相加，会先将它们转换为默认的int类型之后再计算，得到的结果是int类型）。这种情况适用于变量的数据类型的容量比默认类型的容量小（如byte,short都比int小）
3. byte,short,char之间不会相互转换，他们三者在计算时首先转换为int类型。

### 练习二

```
1） 
short  s = 5;
s = s-2;                       //判断：错
2） 
byte b = 3;
b = b + 4;                  //判断：错
b = (byte)(b+4);        //判断：对
3） 
char c = ‘a’;
int  i = 5;
double d = .314;
double result = c+i+d;     //判断：对   102.314
4） 
byte b = 5;
short s = 3;
short t = s + b;          //判断：错
```

## video 08 算数运算符

Day02_video8.java

## video 09 赋值运算符
符号：= 
当“=”两侧数据类型不一致时，可以使用自动类型转换或使用强制类型转换原则进行处理。
支持连续赋值。
扩展赋值运算符： +=, -=, *=, /=, %=
## video 10 比较运算符
- 比较运算符的结果都是boolean型，也就是要么是true，要么是false。
- 比较运算符“==”不能误写成“=” 。