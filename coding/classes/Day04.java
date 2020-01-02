package learn;

public class Day04 {
	public static void main (String [] args) {
//		//连续输出五次hello world
//		for (int i = 0; i < 5; i++) {//初始化表达式；布尔值测试表达式；更改表达式
//			System.out.println("hello wold");
//			System.out.println(i);
//		}
//		//初始化变量i,判断是否小于5，如果是执行代码块，执行更改表达式i++给i重新赋值
//		//判断i是否小于5,不满足条件时不往下执行
		
//		for(int i = 1; i <= 150; i++) {
//			String str = "";
//			str += i;
//			if (i % 3 == 0) {
//				str += " foo";	
//			}
//			if (i % 5 == 0) {
//				str += " biz";
//			}
//			if (i % 7 == 0) {
//				str += " baz";
//			}
//			System.out.println(str);
//		}
		
//		for (int i = 100; i < 999; i++) {
//			//145,145/100=1,(145-1*100)/10,145-1*100-4*10 = 5
//			int m = i / 100;//得到百位上的数
//			int n = (i - m *100)/10;//得到十位上的数
//			int k = (i - m *100 - n * 10);//得到个位上的数
//			System.out.println(i);
//			System.out.println( m + "" + n + "" + k);
//			int res = m*m*m + n*n*n + k*k*k;//各个位上数字立方和
//			if (res == i) {//判断是不是水仙花数
//				
//				System.out.println(i);
//			}
//		}
		//循环输出1-100的数字
//			int i = 1;
//			while (i <= 100) {
//				System.out.println(i);
//				i++;	
//			}
			
//		int m = 1;
//		do {
//			System.out.println(m);
//			m++;
//		}while (m <= 100);
		//求1到100之间所有偶数的和。用for和while语句分别完成。
//		int res = 0;
//		for (int i = 1; i < 101; i++) {
//			if (i % 2 == 0) {
//				res += i;
//			}
//		}
//		System.out.println(res);//要在for循环外输出最后结果，因为只有全部循环计算完毕才有1-100的所有偶数的和
//
//		int res0 = 0;
//		int k = 1;
//		while(k <= 100) {
//			if(k % 2 == 0) {
//				
//			res0 += k;
//			}
//			k++;
//		}
//		System.out.println(res0);
//		for(;;) {//for的无限循环
//			
//		}
//		while(true) {//while的无限循环
//			
//		}
//		for (int i = 0; i < 4; i++) {//每一次循环都会执行大括号里面的所有代码
//			System.out.println("大循环---"+ i);
//			for (int j = 0; j < 3; j++) {//大循环次数乘小循环次数是小循环大括号里代码执行的次数
//				System.out.println("大循环---"+ i + "小循环---" + j);
//			}
//		}
//		//注意：在写嵌套循环时，尽量保证外层循环的循环次数小于内层的循环次数,即选择下面第二种
//		for (int i =1; i <= 900; i++) {
//			for (int j = 0; j< 20; j++) {
//				
//			}
//		}
//		for (int j = 0; j <= 20; j++) {
//			for (int i = 1; i < 900; i++) {
//				
//			}
//		}
//		//打印九九乘法表
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j<= i; j++) {
//				
//				System.out.print(i + "*" + j + " = " + (i * j) + " ");//print不换行
//				
//			}
//			System.out.println();//println换行
//		}
//		//输出1-100之间的所有质数[大于一的自然数，并且只能被一和本身整除]
//		//以7为例，用7与循环1到7之间的数分别取模，如果整除的次数只有两次，可判断其为质数
//		for(int i = 1; i <= 100; i++) {
//			
//			int k = 0;//整除的次数，变量是在它所在的大括号内生效
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0) {
//					k++;
//				}
//			}
//			
//			if (k == 2) {
//				
//				System.out.println(i);
//			}
//		}
//		
//		for (int i = 0; i < 9; i++) {
//			if (i > 6) {
//				break;//当i>6时终止循环
//			}
//			System.out.println(i);
//			
//		}
//		 for (int j = 0; j < 3; j++) {
//			 for (int i = 0; i < 9; i++) {
//				 if (i > 2) {
//				 break;
//			 }
//			 System.out.println(i);	
//		   }
//			break;
//		 }
//		for (int i = 0; i < 9; i++) {
//			if (i % 2 == 0) {
//				continue;//结束当前这次循环直接进入下一次循环
//			}
//			System.out.println(i);
//			
//		}
//		for (int i = 0; i < 9; i++) {
//			if (i == 7) {
//				return;//看起来类似于break，但实际上return把整个方法结束了，break只是终止当前的循环
//			}
//			System.out.println(i);
//		}
//		
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				if(j == 1) {
////					return;//看起来类似于break，但实际上return把整个方法结束了，break只是终止当前的循环
//					break;
//				}
//			}
//			System.out.println(i);
//		}
//		int i = 0;
//		int k = 1;
//		int m = 2;
//		//把多个数据放到一个变量里，数组：存放多个数据的集合
//		//例如存放多个int类型
//		int [] nn;//声明了一个数组的变量
//		int [] ii = new int [4];//声明一个能放4个int类型数据的数组
//		int [] ii0 = new int [] {1,2,3,4};//声明一个存放了1234的数组
//		String[] strs = new String[] {"c","a","b"};//数组内的元素都有一个引用的元素下标，从零开始
//		System.out.println(strs[2]);//b
//		System.out.println(strs.length);
//		int [] ii = new int[2];//使用动态初始化时，数组元素会有默认值，数字类型的默认值是零，对象的默认值是none
//		System.out.println(ii[0]);
//		int[] ii = new int[4];
//		System.out.println(ii[0]);
//		
//		ii[0] = 2;
//		System.out.println(ii[0]);
//		int [] [] ii = new int[][] {
//			{1,2},
//			{3,4}
//		};
//		int [] [] ii0 = new int[2][3];//第一维部分的长度2，第二维部分长度是3
//		int [] [] ii1 = new int[2][];//只定义第一维长度
//		System.out.println(ii[1][0]);
//
//		int [][] arr = new int [][] {					
//			{3,8,2},
//			{2,7},
//			{9,0,1,6},
//		};
//		int len = arr.length;//数组的一维的长度
//		int res = 0;
//		for (int i = 0; i < len; i++) {
//			int [] arr0 = arr [i];
//			int llen = arr0.length;//二维数组的长度
//			for(int j = 0; j < llen; j++) {
//				
//				res += arr0[j];
//
//			}
//		}
//		System.out.println(res);
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[j].length; j++) {
//				res += arr[i][j];
//			}
//		}
		
//		int [] arr = new int[] {4,2,7,1,3,5};
//		//最大值
//		int max = arr[0];//假设arr[0]是目前最大值
//		for(int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];//存放目前的最大值
//			}
//		}	
//		System.out.println("max: "+ max);
//		//最小值
//		int min = arr[0];//假设arr[0]是目前最小值
//		for(int i = 0; i < arr.length; i++) {
//			if(min > arr[i]) {
//				min = arr[i];//把目前最小的值赋给min
//			}
//			
//		}
//		System.out.println("min: "+ min);
//		//总和，平均数
//		int res = 0;
//		for(int i = 0; i < arr.length; i++) {
//			res += arr[i];			
//		}
//		System.out.println("总和: "+ res);
//		System.out.println("平均数: "+ res / arr.length);
//		//复制，不是赋值
//		int[] aa = arr;//赋值
//		int [] copy = new int[arr.length];//声明了一个与arr长度一致的数组
//		for (int i = 0; i < arr.length; i++) {
//			copy[i] = arr[i];//把每一个元素给copy赋值
//		}
//		//int [] arr = new int []{4,2,7,1,3,5};
//		//考虑声明一个数组temp.数组temp长度与arr长度一致，倒着循环arr，正着给temp元素赋值
//		//temp[0] = arr[5], temp[1] = arr[4],temp[2] = arr[3], temp[3] =arr[2] , temp[4] =arr[1] , temp[5]arr[0] = 
//		//再把temp赋值给arr, arr = temp
//		//一个数组的最后一个元素的下标是数组长度减一
//		
//		int[] temp = new int[arr.length];
//		int k = 0;//k是temp的下标
//		for (int i = arr.length - 1; i >= 0; i--) {
////			System.out.println(arr[i]);
//			temp[k] = arr[i];//第一次循环，k=0,i=5，相当于 temp[0] = arr[5]
//			k++;
//		}
//		arr = temp;
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//			
//		}
//		int[] arr = new int[] {4,7,3,1};
//		int[] arr = new int[] {5,7,8,64,72,36};
//		int temp = 0;
//		for (int i = 0; i < arr.length - 1; i++) {//外层循环是循环轮次次数是长度减一
//			for(int j = 0; j < arr.length - 1 - i; j++) {//每一轮次的数字对比排序，每轮次的循环依次4，3，2，轮次长度-1-i
//				if(arr[j] > arr[j + 1]) {//如果相邻元素前面大于后面的，则交换
//					temp = arr[j];
//					arr[j] = arr [j + 1];
//					arr[j + 1] = temp;				
//				}
//			}
//			
//		}
//		for (int i = 0; i < arr.length; i++) {//循环输出，查看结果
//			System.out.println(arr[i]);
//		}
//		
//		
//		int[] arr = new int[3];
//		System.out.println(arr[4]);
//		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3 at learn/learn.Day04.main(Day04.java:276)
//		int[] arr = null;
//		System.out.println(arr[0]);
//	    //Exception in thread "main" java.lang.NullPointerException at learn/learn.Day04.main(Day04.java:281)
		
		
	}
}