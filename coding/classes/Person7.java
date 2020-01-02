package day06;

public class Person7 {
	public Person7(){
		
	}
	
	public Person7(int age){
		this.age = age;
	}
	
	public Person7(String name){
		this();//等同于调用public Person7()
		this.name = name;
	}
	
	public Person7(int age, String name){
		this(1);//等同于调用public Person7(int age)
		this.age = age;
		this.name = name;
	}
	int age;
	String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setName1(String name){
		this.setName(name);
	}
	
	public void showInfo(){
		System.out.println("姓名：" + this.name);
		System.out.println("年龄：" + this.age);
	}
	
}
