package day06;
import day06.Person;//如果使用同一个包下的类，import可以省略
public class Test {
	public static void main(String[] args) {
//		Person p = new Person();
////		p.age = -100;//这样的情况，程序是对的，能执行，但是不符合正常逻辑
//		//像这种情况，是把类的属性开发出来，让调用者随意使用，这样会有问题
//		p.setAge(12);
//		p.printAge();
		//new 对象的根本原理？就是通过类的构造方法
//		Person4 p4 = new Person4();//new Person4对象调用的是public Person4(){}
//		
////		p4.age = 1;
//		p4.getAge();
		
//		Person5 p5 = new Person5();
//		p5.showInfo();
		
		//需求？希望在new对象的时候能够自己给属性不同的值
//		Person5 p5 = new Person5(2,"lisi");
//		p5.showInfo();
		
//		Person6 p6 = new Person6();
//		System.out.println(p6.age);
//		Person6 p6 = new Person6(12,"张三");
//		System.out.println(p6.age);
//		System.out.println(p6.name);
//		
//		Point po = new Point(1,2,3);
//		
//		po.setPoint(6, 7, 8);
//		new Person6();
//		new Person6(1);
//		new Person6("ss");
//		new Person6(1,"ss");
		
		Person8 p8 = new Person8();
		
		p8.setName("张三");
		p8.setSex(0);
		p8.setAge(20);
		
		System.out.println(p8.getName());
		System.out.println(p8.getAge());
		System.out.println(p8.getSex());
	}
}

/**
 * 在同一个java文件中可以写多个的class，但是只有一个public的，其他的class只能缺省的
 * @author lby
 *
 */
class T0{
	
}