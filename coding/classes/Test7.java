package day06;

import day06.test.*;

public class Test7 {
	public static void swap(DataSwap ds1){
		ds1.a = 6;
		System.out.println("在swap方法中，ds1.a的值是：" + ds1.a);
	}
	public static void main(String[] args) {
		DataSwap ds = new DataSwap();
		System.out.println("调用swap方法之前，ds.a的值是：" + ds.a);
		swap(ds);
//		ds.a = 6;
		System.out.println("调用swap方法之后，ds.a的值是：" + ds.a);
	}
	
//	day06.test.Person p = new day06.test.Person();
	Person p = new Person();
	
	T0 t0 = new T0();
}
//this is a test record.