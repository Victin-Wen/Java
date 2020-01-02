package day06;
class T1{
	//默认构造方法
	T1(){}
}
public class Person4 {
	//默认的构造方法前面有没有访问的修饰符跟定义的类有关，类是public的，默认的构造方法就是public，默认的类是缺省的，它的
	// 构造方法就是缺省的
	public Person4(){}
	//private的情况
//	private int age;
//	
//	private void getAge(){
//		System.out.println(age);
//	}
//	
//	public void test(){
//		getAge();
//	}
	
	//缺省的情况
//	int age;
//	
//	void getAge(){
//		System.out.println(age);
//	}
//	
//	public void test(){
//		getAge();
//	}
	
	//protected
//	protected int age;
//	
//	protected void getAge(){
//		System.out.println(age);
//	}
//	
//	public void test(){
//		getAge();
//	}
	
	public int age;
	
	public void getAge(){
		System.out.println(age);
	}
	
	public void test(){
		getAge();
	}
}
