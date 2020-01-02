package learn;

public class Day03 {
	public static void main(String[] args) {
		
//		System.out.println(4 == 4 & 1 == 1);
//		System.out.println(4 == 4 || 1 == 1);
//		int x = 4;
////		System.out.println(3 < x < 6);错误写法
//		System.out.println(3 < x && x < 6);
		
//		int i = 0;
//		int k = 1;
//		//k++,++k
//		System.out.println(++k ==2);
//		System.out.println(i != 0 & ++k ==2);//单个，两边都要参与运算
		
//		System.out.println(i != 0 && ++k ==2);//两个，左边为真时右边才运算
//		
//	    System.out.println(k);
	    
//	    int x = 1;
//	    int y = 1;
//
//	    if(x++==2 & ++y==2){
//	    	//x++ == 2，x先取值后计算，i==2,结果false,再计算++后x值是2
//	    	//y先计算为2，在逻辑判断true
//	    	//false & true为false
//	    	x =7;
//	    }
//	    System.out.println("x="+x+",y="+y);//2 2

//		System.out.println(1 << 2);//1×2的2次方
//		System.out.println(~ 12);// -13
//		int i = 1;
//		int k = i > 0? 1 : 0;
//		
//		System.out.println(k);
//找两个数种最大的数		
//		int m = 1;
//		int n = 2;
//		
//		System.out.println(m > n ? m : n);//2
////找三个数中最大的数		
//		int k = 0;
//		//(条件表达式)? 表达式1：表达式2；
//
//		System.out.println(m > n ? (m > k ? m : k) : (n > k? n : k));
//		//条件表达式m > n
//		//表达式1 （m > K ? m :k）
//		//表达式2(n > k? n : k)

//		int i = 1;
//		int k = 2;
//		if(i == 1 && k ==2) {
//			
//			System.out.println(i);
//		}
		//	判断一个数字是奇数还是偶数
//		int i = 5;
//		if(i % 2 == 0) {
//			System.out.println("偶数");
//		}
//		else {
//			System.out.println("奇数");	
//		}
		
		//如果是数字1，输出星期一，2数字对应输出星期二，3数字对应输出星期三，其余输出不知道
//		int i = 8;
//		if(i == 1) {
//			System.out.println("星期一");	
//		}else if(i == 2) {
//			
//			System.out.println("星期二");
//		}else if(i == 3) {
//			
//			System.out.println("星期三");
//		}else {
//			System.out.println("不知道星期几");
//		}
	    
//		int score = 100;
//		
//		if (score == 100) {
//			
//			System.out.println("奖励一辆BMW");
//		}else if(score > 80 && score <= 99) {
//			System.out.println("奖励一台手机");
//		}else if(score >= 60 && score <= 80) {
//			System.out.println("奖励一本书");
//		}else {
//			System.out.println("Nothing");
//		}
//		int x = 4;
//		int y = 1;
//		if (x > 2) {//x = 4,所以走if分支
//		       if (y > 2) {//判断y是否大于2,如果是走这个分支
//		                System.out.println(x + y);
//		                System.out.println("atguigu");
//		        }
//		} else{
//		       System.out.println("x is " + x);
//		}
		
//		//if-else可以嵌套使用
//		if(false) {
//			//这里可以写任何代码段，包括if-else
//		}else {
//			//这里可以写任何代码段，包括if-else
//
//		
//		}
		
		//如果是数字1输出星期一，数字2输出星期二，除此之外输出不知道星期几
//		int i = 2;
//		switch(i) {
//		
//		case 1:
//			System.out.println("星期一");
//			break;
//		case 2:
//			System.out.println("星期二");
//			break;
//		default:
//			System.out.println("不知道星期几");
//			break;
//		}
		
//		String str = "bcd";
//		switch(str) {
//		case "a":
//			System.out.println("a = "+ str);
//			break;
//		case "bcd":
//			System.out.println("bcd = "+ str);
//			break;
//		default:
//			System.out.println("unknown");
//			break;	
//		}
//		
//		char c = 'o';
//		
//		switch(c) {
//		
//		case 'a':
//			System.out.println("A");
//			break;
//		case 'b':
//			System.out.println("B");
//			break;
//		case 'c':
//			System.out.println("C");
//			break;
//		case 'd':
//			System.out.println("D");
//			break;
//		case 'e':
//			System.out.println("E");
//			break;
//		default:
//			System.out.println("other");
//			break;
//		}
		
	}
}


