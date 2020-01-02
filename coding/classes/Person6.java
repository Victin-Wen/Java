package day06;

public class Person6 {
	/**
	 * 构造器的重载，就是为了方便调用方可以灵活的创建出不同需要的对象
	 * 重载的多个构造方法实际上就是相当于提供了多个初始化new对象的模板
	 */
	public Person6(){
		
	}
	public Person6(int a){
		
	}
	public Person6(String n){
		
	}
	public Person6(int a,String n){
//		age = 18;
		age = a;
		name = n;
	}
	public int age;
	public String name;
}
