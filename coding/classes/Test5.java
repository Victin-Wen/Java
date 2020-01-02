package day06;

public class Test5 {
	public static void main(String[] args) {
		Person3 p3 = new Person3();
//		String[] ss = new String[]{"zhangsan","11"};
//		p3.printInfo(ss);
//		String[] ss1 = new String[]{"北京市xxx","13133334444","152109874523666541"};
//		p3.printInfo(ss1);
		
//		p3.printInfo1("lisi","23","男","","");
//		
		String[] ss2 = new String[]{"北京市xxx","13133334444","152109874523666541"};
		p3.printInfo1(ss2);
		p3.printInfo1();//如果没有参数就可以不填
		p3.printInfo(null);
	}
}
