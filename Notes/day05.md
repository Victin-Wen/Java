## video 01 第三章 面向对象编程
### 学习面向对象内容的三条主线
1.java类及类的成员

2.面向对象的三大特征

3.其它关键字

### 3.1 面向对象与面向过程
- 面向对象(OOP，Object Oriented Programming)与面向过程(POP，procedure oriented programming)

> 二者都是一种思想，面向对象是相对于面向过程而言的。面向过程，强调的是功能行为。面向对象，将功能封装进对象，强调具备了功能的对象。

> 面向对象更加强调运用人类在日常的思维逻辑中采用的思想方法与原则，如抽象、分类、继承、聚合、多态等。

- 面向对象的三大特征

> 封装  (Encapsulation)

> 继承  (Inheritance)

> 多态  (Polymorphism)

### java类及类的成员

- 现实世界万事万物是由分子、原子构成的。同理，Java代码世界是由诸多个不同功能的**类**构成的。

- 现实世界中的分子、原子又是由什么构成的呢？原子核、电子！那么，Java中用**类class**来描述事物也是如此

> 属性：对应类中的成员变量

> 行为：对应类中的成员方法

```
class Person {//下面三行是属性，或成员变量
    String name;
    int age;
    boolean isMarried;
    //下面是方法，或函数
    public void walk(){
        System.out.println("人走路...");
    }
    public String display(){
        return "名字是: " +name+", 年龄是：" + age+",Married:" + isMarried;
    }
}
```

## video 02 类的写法
### 类的语法格式

```
修饰符 class  类名 {
	属性声明;	
	方法声明;
}
说明：修饰符public：类可以被任意访问
	类的正文要用{  }括起来
举例：
	public class  Person{
    public int age ;	            //声明公有变量 age
    public void showAge() { //声明方法showAge( )
	 System.out.println(age);
    }
}
```

### 创建Java自定义类
步骤：
1. 定义类（考虑修饰符、类名）

2. 编写类的属性（考虑修饰符、属性类型、属性名、初始化值）

3. 编写类的方法（考虑修饰符、返回值类型、方法名、形参等）

## video 03 3.5 对象的创建和使用
Java类及类的成员 ---如何使用> java类的实例化，即创建类的对象
> 使用new +构造器创建一个新的对象；

> 使用“对象名.对象成员”的方式访问对象成员（包括属性和方法）；

```
public class Animal {
  public int legs;	    
  public void  eat(){
    System.out.println(“Eating.”);
  }
  public void move(){
      System.out.println(“Move.”);
  }
}
```

举例：

```
public class Zoo{
   public static void main(String args[]){
	Animal xb=new Animal();
	xb.legs=4;
	System.out.println(xb.legs);
	xb.eat();
	xb.move();
   }
}
```
- Eclipse中快速输入System.out.println()：

Window -> Preferences-> Keys

1.把Word Completion的快捷键 Alt+/ 移除

2.把Content Assist的快捷键设置为 Alt+/

## video 04 类的属性 3.3 类的成员之一：属性
- 语法格式：

修饰符  类型  属性名 =初值 ; 
> 说明:

**修饰符private**:该属性只能由该类的方法访问。

**修饰符public**:该属性可以被该类以外的方法访问。 

**类型**：任何基本类型，如int、boolean或任何类。
- 举例：

```
public class Person{
    private int age;             //声明private变量 age
    public String name = “Lila”;    //声明public变量 name
}
```

### 变量的分类：成员变量与局部变量
- 在方法体外，类体内声明的变量称为成员变量。

- 在方法体内部声明的变量称为局部变量。

>>>实例变量（不以static修饰）

>>成员变量

>所有变量

>>>类变量（以static修饰）

>>局部变量

>>>形参（方法签名中定义的变量）

>>>方法局部变量（在方法内定义）

>>>代码块局部变量（在代码块内定义）

### 成员变量（属性）和局部变量的区别？
- 成员变量：

> 成员变量定义在类中，在整个类中都可以被访问。实例变量只能在类实例化后的对象中使用。

> 成员变量分为类成员变量和实例成员变量，实例变量存在于对象所在的堆内存中。

> 成员变量有默认初始化值。

> 成员变量的权限修饰符可以根据需要，选择任意一个


- 局部变量：

> 局部变量只定义在局部范围内，如：方法内，代码块内等。局部变量只能在它所属的方法的范围内可以使用

> 局部变量存在于栈内存中。

> 作用的范围结束，变量空间会自动释放。

> 局部变量没有默认初始化值，每次必须显式初始化。

> 局部变量声明时不指定权限修饰符

## video 05 类的方法 3.4  类的成员之二：方法
- 语法格式：
 	修饰符  返回值类型  方法名 ( 参数列表) {
  	 方法体语句；
} 

> 说明： 

**修饰符**：public, private, protected等。

**返回值类型**：return语句传递返回值。没有返回值：void。

- 举例：

```
	public class Person{
    private int age;
    public int getAge()  { return age; } //声明方法getAge
    public void setAge(int i) {          //声明方法setAge
	  age = i;        //将参数i的值赋给类的成员变量age
    }
}
```
### 对象的创建和使用
如果创建了一个类的多个对象，对于类中定义的属性，每个对象都拥有各自的一套副本，且互不干扰。
- 举例: 

```
public class Zoo{
    public static void main(String args[]){
	Animal xb=new Animal();
	Animal xh=new Animal();
	xb.legs=4;
	xh.legs=0;
	System.out.println(xb.legs);   //4
	System.out.println(xh.legs);   //0
	xb.legs=2;
	System.out.println(xb.legs);   //2
	System.out.println(xh.legs);   //0
    }  }
```

### 3.6 方法(method)
- 什么是方法（函数）？

> 方法是类或对象行为特征的抽象，也称为函数。 

> Java里的方法不能独立存在，所有的方法必须定义在类里。                  

```
修饰符 返回值类型 方法名（参数类型 形参1，参数类型 形参2，….）｛

  程序代码

  return 返回值;

｝
```

其中：

**形式参数**：在方法被调用时用于接收外部传入的数据的变量。

**参数类型**：就是该形式参数的数据类型。

**返回值**：方法在执行完毕后返还给调用它的程序的数据。

**返回值类型**：方法要返回的结果的数据类型。

**实参**：调用方法时实际传给函数形式参数的数据。

### 方法的调用
方法只有被调用才会被执行

**注意**：
> 没有具体返回值的情况，返回值类型用关键字void表示，那么该函数中的return语句如果在最后一行可以省略不写。

> 定义方法时，方法的结果应该返回给调用者，交由调用者处理。

> 方法中只能调用方法，不可以在方法内部定义方法。

## video 06 关于对象

成员变量类型|初始值
--|:--:
byte | 0
short | 0
int | 0
long | 0L
float | 0.0F
double | 0.0D
char | '\u0000'(表示为空)
boolean | false
引用类型 | null

### 类的访问机制：
- 在一个类中的访问机制：类中的方法可以直接访问类中的成员变量。（例外：static方法访问非static的成员变量，编译不通过。）

- 在不同类中的访问机制：先创建要访问类的对象，再用对象访问类中定义的成员。

### 面向对象思想“落地”法则

1. 关注于类的设计，即设计类的成员：属性 、方法

2. 类的实例化，即创建类的对象（比如：Person p = new Person()）

3. 通过“对象.属性” 、 “对象.方法” 执行

## video 07 方法的重载(overload)
- 重载的概念
在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
- 重载的特点：
与**返回值类型**无关，只看**参数列表**，且**参数列表必须不同**。（参数个数或参数类型）。调用时根据方法参数列表的不同来区别。
- 重载示例：

```
//返回两个整数的和
int add(int x, int y) {return x + y;}
//返回三个整数的和
int add(int x, int y, int z) {return x + y + z;}
//返回两个小数的和
double add(double x, double y) {return x + y;}
```

### 函数的重载

```
public class PrintStream{
public static void print(int i) {……}
public static void print(float f) {……}
private static void print(String s) {……}
	public static void main(String[] args){	
		print(3)；
		print(1.2f)；
		print(“hello!”)；
	}
}
```

练习3
1. 判 断：
与`void show(int a,char b,double c){}`构成重载的有：

a. `void show(int x,char y,double z){}`   //no，只看个数，与名称无关

b. `int show(int a,double c,char b){}`   //yes顺序不同也是重载

c. `void show(int a,double c,char b){}`  //yes顺序不同也是重载

d. `boolean show(int c,char b){}`  //yes

e. `void show(double c){}`  //yes

f. `double show(int x,char y,double z){}`  //no，类型个数相同

g. `void shows(){double c}`  //no，方法名不同

2. 编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。

3. 定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，第三个方法求三个double值中的最大值，并分别调用三个方法。
