package day06;

public class Person {
//	public int age;//像这种情况，是把类的属性开发出来，让调用者随意使用，这样会有问题
	
	//我们需要对这样不能让调用者随意使用的属性做封装和隐藏
	private int age;
	
	public void printAge(){
		System.out.println("年龄是：" + age);
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int a){
		if(a <= 130 && a >= 0){
			age = a;
		}else{
			System.out.println("输入的年龄：" + a + " 不在0到150之间");
		}
	}
}
