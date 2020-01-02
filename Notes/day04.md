## video 01 循环结构for
### 循环语句功能
在某些条件满足的情况下，反复执行特定代码的功能
### 循环语句的四个组成部分
- 初始化部分（init_statement）
- 循环条件部分（test_exp） 
- 循环体部分（body_statement） 
- 迭代部分（alter_statement） 
### 循环语句分类
- for 循环
- while 循环
- do/while 循环 
### for循环语句
```
for (初始化表达式①; 布尔值测试表达式②; 更改表达式)｛
         	语句或语句块③；
	 ｝
```

## video 02 循环结构while
### while 循环语句
语法格式
```
 		[初始化语句]
		while( 布尔值测试表达式)｛
	        		语句或语句块;
			[更改语句;]
		}
```
应用举例
```
		public class WhileLoop {
		        public static void main(String args[]){
        		int result = 0;
			int i=1;
			while(i<=100) {
			        result += i;
            	       	        i++;
			}
			        System.out.println("result=" + result);
		         }
		} 
```
### do-while 循环语句
语法格式
```
		[初始化语句]
		do｛
	        	语句或语句块;
		        [更改语句;]
		｝while(布尔值测试表达式); 
```
应用举例
```
		public class WhileLoop {
		        public static void main(String args[]){
        		  int result = 0,  i=1;
			        do{
			        	   result += i;
           		       	   i++;
				 }while(i<=100);
			 System.out.println("result=" + result);
		       }
		}  
```
## video 03 嵌套循环
- 将一个循环放在另一个循环体内，就形成了嵌套循环。其中，for ,while ,do…while均可以作为外层循环和内层循环。
- 实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为false时，才会完全跳出内层循环，才可结束外层的当次循环，开始下一次的循环。
- 设外层循环次数为m次，内层为n次，则内层循环体实际上需要执行m*n=mn次。

## video 04 特殊流程控制语句

### break语句

break语句用于终止某个语句块的执行

```
{
    break;
}
```
break终止当前所在的循环
### continue语句
- continue语句用于跳过某个循环语句块的一次执行 
- continue语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环 
### return：并非专门用于结束循环的，它的功能是结束一个方法。当一个方法执行到一个return语句时，这个方法将被结束。
- 与break和continue不同的是，return直接结束整个方法，不管这个return处于多少层循环之内
### 特殊流程控制语句说明
- break只能用于switch语句和循环语句中。
- continue 只能用于循环语句中。
- 二者功能类似，但continue是终止本次循环，break是终止本层循环。
- break、continue之后不能有其他的语句，因为程序永远不会执行其后的语句。

## video 05 一维数组
### 一维数组的声明方式： 
`type  var[] 或 type[]  var；`
例如：
```
		   int a[];
	   	   int[] a1;
		   double  b[];
		   Mydate[] c;  //对象数组
```
### 一维数组初始化
- 动态初始化：数组声明且为数组元素分配空间与赋值的操作分开进行
```
int[] arr = new int[3];
arr[0] = 3;
arr[1] = 9;
arr[2] = 8;
```
- 静态初始化：在定义数组的同时就为数组元素分配空间并赋值。
```
int a[] = new int[]{ 3, 9, 8};
int[] a = {3,9,8};
```

## video 06 多维数组
### 数组元素的引用
定义并用运算符new为之分配空间后，才可以引用数组中的每个元素；
数组元素的引用方式：`数组名[数组元素下标]`
 数组元素下标可以是整型常量或整型表达式。如`a[3] , b[i] , c[6*i];`
数组元素下标从0开始；长度为n的数组合法下标取值范围: 0 —>n-1；如`int a[]=new int[3]; ` 可引用的数组元素为`a[0]、a[1]、a[2]`
每个数组都有一个属性length指明它的长度，例如：`a.length `指明数组a的长度(元素个数)
数组一旦初始化，其长度是不可变的
 - 格式1（动态初始化）：`int[][] arr = new int[3][2];`
 定义了名称为arr的二维数组
 二维数组中有3个一维数组
 每一个一维数组中有2个元素
 一维数组的名称分别为`arr[0], arr[1], arr[2]`
 给第一个一维数组1脚标位赋值为78写法是：`arr[0][1] = 78;`
- 格式2（动态初始化）：`int[][] arr = new int[3][];`
 二维数组中有3个一维数组。
 每个一维数组都是默认初始化值null (注意：区别于格式1）
 可以对这个三个一维数组分别进行初始化
```
arr[0] = new int[3];   
arr[1] = new int[1];
arr[2] = new int[2];
```
注：
`int[][]arr = new int[][3];`  //非法
- 格式3（静态初始化）：`int[][] arr = new int[][]{{3,8,2},{2,7},{9,0,1,6}};`
定义一个名称为arr的二维数组，二维数组中有三个一维数组
 每一个一维数组中具体元素也都已初始化
 第一个一维数组 `arr[0] = {3,8,2};`
 第二个一维数组 `arr[1] = {2,7};`
 第三个一维数组 `arr[2] = {9,0,1,6};`
 第三个一维数组的长度表示方式：`arr[2].length;`
> 注意特殊写法情况：int[] x,y[]; x是一维数组，y是二维数组。
> Java中多维数组不必都是规则矩阵形式
### 练习
声明：`int[] x,y[];  以下选项允许通过编译的是：`
1. `x[0] = y; //no, x[0]是一个数，y是一个二维数组`
2. `y[0] = x;//yes， y[0]就是一维数组，x是一维数组`
3. `y[0][0] = x;//no， y[0][0] 是一个数字，x是一维数组`
4. `x[0][0] = y;//no， x[0][0] 不存在，x是一维数组，没有第二维`
5. `y[0][0] = x[0];//yes， y[0][0] 是一个数字， x[0]是一个数`
6. `x = y; //no， x是一维数组，y是一个二维数组`
一维数组：`int[] x  或者int x[] `  
二维数组：`int[][] y 或者  int[] y[] ` 或者` int  y[][]`

## video 07 数组常见算法
1. 求数组元素的最大值、最小值、总和、平均数
2. 数组的复制、反转
3. 数组元素的排序

### 数组排序
- 插入排序
直接插入排序、折半插入排序、Shell排序
- 交换排序
冒泡排序、快速排序（或分区交换排序）
- 选择排序
简单选择排序、堆排序
- 归并排序
- 基数排序

### 冒泡排序
排序思想：
相邻两元素进行比较，如有需要则进行交换，每完成一次循环就将最大元素排在最后（如从小到大排序），下一次循环是将其它的数进行类似操作。
```
//   	int[] arr = new int[] {4,7,3,1};
		int[] arr = new int[] {5,7,8,64,72,36};
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {//外层循环是循环轮次次数是长度减一
			for(int j = 0; j < arr.length - 1 - i; j++) {
                //每一轮次的数字对比排序，每轮次的循环依次4，3，2，轮次长度-1-i
				if(arr[j] > arr[j + 1]) {//如果相邻元素前面大于后面的，则交换
					temp = arr[j];
					arr[j] = arr [j + 1];
					arr[j + 1] = temp;				
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {//循环输出，查看结果
			System.out.println(arr[i]);
		}
```

## video 08 数组常见问题

编译时不报错：

1. 数组下标越界异常(ArrayIndexOutOfBoundsException)


```
int[] arr = new int[2];
System.out.println(arr[2]);
```

访问到了数组中的不存在的脚标时发生。

2. 空指针异常(NullPointerException)

```
int[] arr = null;
System.out.println(arr[0]);
```
arr引用没有指向实体，却在操作实体中的元素时。
