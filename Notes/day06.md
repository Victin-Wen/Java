## video 01 方法的可变个数的参数
### 体会可变个数的形参
```
//下面采用数组形参来定义方法
public static void test(int a ,String[] books);
//以可变个数形参来定义方法
public static void test(int a ,String…books);
```
说明：

1. 可变参数：方法参数部分指定类型的参数个数是可变多个
2. 声明方式：方法名（参数的类型名...参数名）
3. 可变参数方法的使用与方法参数部分使用数组是一致的
4. 方法的参数部分有可变形参，需要放在形参声明的最后

## video 02 方法的参数传递
- 方法，必须有其所在类或对象调用才有意义。若方法含有参数：

形参：方法声明时的参数

实参：方法调用时实际传给形参的参数值

- Java的实参值如何传入方法呢？

Java里方法的参数传递方式只有一种：值传递。  即将实际参数值的副本（复制品）传入方法内，而参数本身不受影响。

方法只有被调用才有意义

基本数据类型，值保存在栈中，引用对象，值保存在堆中。栈中存的是对象在堆中的地址。
### 总结
方法的参数传递：
1. 如果方法的形参是基本数据类型，那么实参向形参传递参数时，就是直接传递值，把实参的值复制给形参。

2. 如果方法的形参是对象，那么实参（实际的对象），那么实参向形参传递参数时，也是把值（实参在栈内存中的值，即引用对象在堆内存中的地
址）给形参。

基本数据类型都是保存在栈内存中，引用对象在栈内存中保存的是引用对象的地址，方法的参数传递是传递值（是变量在栈内存中的值）。

## video 03 包package和引用import

在我们个人电脑中，如果不建文件夹，所有文件都放在某个盘下，则很杂乱，还有同名文件的问题。类似的，出现了package解决此问题。

**软件包：**
- 包帮助管理大型软件系统：将语义近似的类组织到包中；解决类命名冲突的问题。
- 包可以包含类和子包。
- 例：某航运软件系统包括：一组域对象、GUI和reports子系统

### 关键字- package

- package语句作为Java源文件的第一条语句，指明该文件中定义的类所在的包。(若缺省该语句，则指定为无名包)。它的格式为：
	
    `package 顶层包名.子包名 ;`

举例：

```
pack\Test.java
		package p1;    //指定类Test属于包p1
		public class Test{
		        public void display(){
			System.out.println("in  method display()");
		        }
		}
```

- 包对应于文件系统的目录，package语句中，用 “.” 来指明包(目录)的层次；
- 包通常用小写单词，类名首字母通常大写。

### 关键字- import
为使用定义在不同包中的Java类，需用import语句来引入指定包层次下所需要的类或全部类(.*)。import语句告诉编译器到哪里去寻找类。
语法格式：
 
    import  包名[.子包名…]. <类名 |*>  

应用举例： 

```
	import  p1.Test;   //import p1.*;表示引入p1包中的所有类
	public class TestPackage{
		public static void main(String args[]){
		          Test t = new Test();          //Test类在p1包中定义
		          t.display();
		}
      }
```

**注意**：
- 若引入的包为：java.lang，则编译器默认可获取此包下的类，不需要再显示声明。
- import语句出现在package语句之后、类定义之前
- 一个源文件中可包含多个import语句
- 可以使用import lee.* ;语句，表明导入lee包下的所有类。而lee包下sub子包内的类则不会被导入。import lee.sub.*;
- import语句不是必需的，可坚持在类里使用其它类的全名
- JDK 1.5加入import static语句

### JDK中主要的包介绍

1. java.lang----包含一些Java语言的核心类，如String、Math、Integer、System和Thread，提供常用功能。
2. java.net----包含执行与网络相关的操作的类和接口。
3. java.io   ----包含能提供多种输入/输出功能的类。
4. java.util----包含一些实用工具类，如定义系统特性、接口的集合框架类、使用与日期日历相关的函数。
5. java.text----包含了一些java格式化相关的类
6. java.sql----包含了java进行JDBC数据库编程的相关类/接口
7. java.awt----包含了构成抽象窗口工具集（abstract window toolkits）的多个类，这些类被用来构建和管理应用程序的图形用户界面(GUI)。
8. java.applet----包含applet运行所需的一些类。

## video 04 封装和隐藏
使用者对类内部定义的属性(对象的成员变量)的直接操作会导致数据的错误、混乱或安全性问题。
```$xslt
使用者对类内部定义的属性(对象的成员变量)的直接操作会导致数据的错误、混乱或安全性问题。

public class Animal {
	 public int legs;	    
	 public void  eat(){
		System.out.println(“Eating.”);
	 }
	 public void move(){
		System.out.println(“Moving.”);
    }
 }

public class Zoo{
	  public static void main(String args[]){
		 Animal xb=new Animal();
		 xb.legs=4;
		 System.out.println(xb.legs);
	           xb.eat();xb.move();
     }  }

```
问题：xb.legs = -1000;

应该将legs属性保护起来，防止乱用。

保护的方式：信息隐藏

Java中通过将数据声明为私有的(private)，再提供公共的（public）方法:getXxx()和setXxx()实现对该属性的操作，以实现下述目的：
先把属性设置声明私有的，用private关键字；

通过编写public类型的setXxx()和getXxx()方法来设置属性和获取属性。
- 隐藏一个类中不需要对外提供的实现细节；
- 使用者只能通过事先定制好的方法来访问数据，可以方便地加入控制逻辑，限制对属性的不合理操作；
- 便于修改，增强代码的可维护性。
```$xslt
public class Animal{
	private int legs;//将属性legs定义为private，只能被Animal类内部访问
	public void setLegs(int i){  //在这里定义方法 eat() 和 move() 
		if (i != 0 && i != 2 && i != 4){
		     System.out.println("Wrong number of legs!");
		     return;
		}
		legs=i;
	}
	public int getLegs(){
		return legs;
	}  }
public class Zoo{
	public static void main(String args[]){
		Animal xb=new Animal();
		xb.setLegs(4);	  //xb.setLegs(-1000);       
        		 xb.legs=-1000;	  //非法
		System.out.println(xb.getLegs());
    }  }

```

## video 05 访问权限修饰符
### 四种访问权限修饰符
Java权限修饰符public、protected、private置于类的成员定义前，用来限定对象对该类成员的访问权限。

| 修饰符 | 类内部 | 同一个包 | 子类 | 任何地方 |
|:--:|:--:|:--:|:--:|:--:|
| private | Yes | 
| (缺省) | Yes | Yes |
| protect | Yes | Yes | Yes |
| public | Yes | Yes | Yes | Yes |
- 对于class的权限修饰只可以用public和default(缺省)。
public类可以在任意地方被访问。
default类只可以被同一个包内部的类访问。
- 按从小到大的范围：
private -> default -> protected -> public

## video 06 类的构造方法  
### 3.8  类的成员之三：构造器(构造方法)
- 构造器的特征
1. 它具有与类相同的名称
2. 它不声明返回值类型。（与声明为void不同）
3. 不能被static、final、synchronized、abstract、native修饰，不能有return语句返回值

- 构造器的作用：创建对象；给对象进行初始化
如：Order o = new Order();    Person p = new Person(Peter,15);
如同我们规定每个“人”一出生就必须先洗澡，我们就可以在“人”的构造方法中加入完成“洗澡”的程序代码，于是每个“人”一出生就会自动完成“洗澡”，程序就不必再在每个人刚出生时一个一个地告诉他们要“洗澡”了。

### 构造器
- 语法格式

```$xslt
修饰符  类名 (参数列表) {
	    初始化语句；
} 
```
- 举例：
```$xslt
public class Animal {
private int legs;
public Animal() {legs = 4; }	   //构造器
public void setLegs(int i) { legs = i; }
public int getLegs(){return legs;}
}
创建Animal类的实例：Animal  a=new Animal();    
//调用构造器，将legs初始化为4。

```
- 根据参数不同，构造器可以分为如下两类：

  隐式无参构造器（系统默认提供）；
  
  显式定义一个或多个构造器（无参、有参）
  
- 注意：

1. Java语言中，每个类都至少有一个构造器
  
2. 默认构造器的修饰符与所属类的修饰符一致
  
3. 一旦显式定义了构造器，则系统不再提供默认构造器
  
4. 一个类可以创建多个重载的构造器
  
5. 父类的构造器不可被子类继承

## video 07 构造方法重载
## video 08 this关键字
## video 09 JavaBean
## video 10 补充
