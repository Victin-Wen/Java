package day06;

public class Person3 {
	/**
	 * 用数组的方式来传递可变个数的参数
	 * 如果没有参数，就要定义一个空数组或者是null
	 * @param args
	 */
	public void printInfo(String[] args){//问题，我们能够的打印的信息都有来源于方法的参数也就是形参的传递
		//我现在可能给方法要传递的不同的参数？如果在这种情况下，我们不知道想要给方法传递多少个参数（姓名、性别、年龄；也可能身份证号码、家庭住址、手机号）
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}
	/**
	 * 用java特有的...的方式来传递可变个数的参数，这种参数在使用时与数组的使用方式相同
	 * 如果没有参数就可以不填.
	 * 这种...代表可以传递0到多个参数
	 * 如果一个方法有多个的形参，可变的形参（...这种的参数）一定要放在所有的参数最后
	 * printInfo1(String s,int d,String... args)这样的放置参数的方式是对的
	 * printInfo1(String s,String... args,int d)这样的放置参数的方式是不对的
	 * printInfo1(String... args,String s,int d)这样的放置参数的方式是不对的
	 * @param args
	 */
	public void printInfo1(String... args){
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}
	
	public void test(int... i){
		
	}
}
