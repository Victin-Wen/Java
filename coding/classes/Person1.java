/**
 * Day05 Page04
 * 人
 * author Vickie
 */
package learn;

public class Person1 {
	{
		//这就是代码块
//		int i = 0;//i是代码块局部变量
	}
//	public String name;	
	public String name = "Vickie";//公有，也可在外部使用
	private int age;//私有，可以在本类的方使用，不能在外部使用
	//修饰符可以修饰变量，可以指明变量是公有还是私有，私有的类变量不能通过对象、属性的方式调用
	//实例变量，在类实例化成对象之后才能使用
	
	public static String sex = "male";//静态的，这种变量不需要类实例化成对象就可以使用
	//直接通过类名.属性的方式调用,这样的变量叫类变量
	public void showAge() {
		System.out.println(age);
	}

}
