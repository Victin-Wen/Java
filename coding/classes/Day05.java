/**
 * 顺序参考
 * Day05 Page01： Person.java
 * Day05 Page02： Animal.java
 * Day05 Page03： Student.java
 * Day05 Page04： Person1.java
 * Day05 Page05： Person2.java
 * Day05 Page06： Circle.java
 */
package learn;
public class Day05 {
	public static void main(String[] args) {
//		//实例化Person类，即创建Person对象
////		int i = 0;
////		String = "";
//		Person person = new Person();//声明一个Person类型的变量，变量名叫person，实例化Person类并且给person赋值为当前的实例new Person
//		//new Person()就是实例化Person类
//		person.name = "小明";//给person对象的name属性赋值为小明
//		person.showName();//对象方法的调用
//		int i = person.getAge();//有返回值的方法，在调用之后会有一个值，即方法中return的部分;用i接收这个值
//		System.out.println(i);
//		
//		person.age = 11;//给person对象的age属性赋值
//		int a = person.getAge();
//		System.out.println(a);//输入sysout，使用Alt键+ /快速输出
		
//		//实例化一个Animal的对象
//		Animal ani = new Animal();
//		
//		ani.eat("老鼠");
//		ani.move("飞");
		//未来可能会学习更加复杂的类，会给这个类创建对象并且使用对象。对象的使用：操作对象的变量，调用类的方法
		
//		Person1 p = new Person1();
//		p.name;
//		p.age;
//		Person1.sex;
//		//类一个，通过类实例化出来的对象可以有多个，每个对象独立互不干扰
//		Person p1 = new Person();
//		Person p2 = new Person();
//		p1.name = "Vickie";
//		p2.name = "Felix";
//		p1.showName();
//		p2.showName();
		
//		Student stu = new Student();
//		stu.name = "Vickie";
//		stu.age = 12;
//		stu.course = "math, language, english";
//		stu.interest = "sing, dance, basketball";
//		stu.showInfo();
//		
//		Day05 d5 = new Day05();
//		int area = d5.getArea(2, 3);
//		System.out.println(area);
//		Student s = new Student();
//		s.showInfo();
//		new Student().showInfo();//匿名对象
//		Person2 p = new Person2();
//		p.name = "Lucy";
//		p.age = 11;
//		p.sex = 1; //1是女，0是男
//		p.study();
//		
//		int a = p.addAge(2);
//		System.out.println("a: "+ a + " p.age: " + p.age);
//		double area = new Circle().area(2);
//		System.out.println("半径为2的圆的面积是： " + area);
//		//练习3，2
//		Day05 d5 = new Day05();
//		d5.mOL(2);
//		d5.mOL(2,3);
//		d5.mOL("重载方法mOL");
//		//练习3，3
//		d5.max(2,8);
//		d5.max(0.2,1.8);
//		d5.max(16,8.9,4.7);
	}
	
	public int getArea(int x, int y) {
		return x * y;
	}
	//多个同名的方法如果想在一个类中共存，那么它们一定是个数或类型不同，这样的重名方法叫重载
	public int add(int x, int y) {
		return x + y;
	}
	
	public double add(int x, double y) {
		return x + y;
	}
	
	public int add(int x, int y, int z) {
		return x + y + z;
	}
	
//  //练习3，2: 定义三个重载方法并调用。方法名为mOL。
//	三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
//	在主类的main ()方法中分别用参数区别调用三个方法。

	public void mOL(int i) {
		System.out.println("立方运算结果为： " + i * i * i);
	}
	
	public void mOL(int x, int y) {
		System.out.println("相乘运算结果为： " + x * y);
	}
	
	public void mOL(String s) {
		System.out.println("s的信息： " + s);
	}
	
	//练习3，3: 定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方法求两个double值中的最大值，第三个方法求三个double值中的最大值，并分别调用三个方法。
	public void max(int x, int y) {
		if (x > y) {
			System.out.println("最大值是： " + x);
		}else {
			System.out.println("最大值是： " + y);
		}
	}
	
	public void max(double x, double y) {
		double res = 0;
		if(x > y) {
			res = x;
		}else {
			res = y;
		}
		System.out.println("最大值是： " + res);
	}
	
	public void max(double a, double b, double c) {
		double res = 0;
		if(a > b) {
			if(a > c) {
				res = a;
			}else {
				res = c;
			}
		}else {
			if(b > c) {
				res = b;
			}else {
				res = c;
			}
		}
		System.out.println("最大值是： " + res);
	}
	
}