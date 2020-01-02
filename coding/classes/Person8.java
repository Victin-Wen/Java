package day06;
/**
 * 一个javabean
 * 私有的属性
 * 属性对应的get和set方法
 * @author lby
 *
 */
public class Person8 {
	private String name;//姓名
	private int sex;//性别，0男1女
	private int age;//年龄
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
//	public void setName(String name){
//		this.name = name;
//	}
//	
//	public String getName(){
//		return this.name;
//	}
//	
//	public void setSex(int sex){
//		this.sex = sex;
//	}
//	
//	public int getSex(){
//		return this.sex;
//	}
//	
//	public void setAge(int age){
//		this.age = age;
//	}
//	
//	public int getAge(){
//		return this.age;
//	}
}
