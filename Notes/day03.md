## Video 01 逻辑运算符

&—逻辑与         | —逻辑或         ！—逻辑非
&& —短路与      || —短路或        ^ —逻辑异或 
- 逻辑运算符用于连接布尔型表达式，在Java中不可以写成3<x<6，应该写成x>3 & x<6 。
- “&”和“&&”的区别：
- 单&时，左边无论真假，右边都进行运算；
- 双&时，如果左边为真，右边参与运算，如果左边为假，那么右边不参与运算。
- “|”和“||”的区别同理，||表示：当左边为真，右边不参与运算。
- 在不需要逻辑运算两边都参与运算的时候，尽量使用&&和||
- 异或( ^ )与或( | )的不同之处是：当左右都为true时，结果为false。
理解：异或，追求的是“异”!

## Video 02 位运算符
- 有符号的右移看右移之后的首位，是0前面空位补零，是一补一。
- 无符号的右移，首位直接补零。
- 与运算（&）同位相与运算时，都是一结果为一，其他情况都是零
- 或运算（|）同位或运算时，都是零结果为零，其他情况都为一。
- 异或运算（^）时，同位异或运算时，都是零或都是一的时候结果为一，其他情况都是零。
- 反码运算，就是把二进制的同位反转，一变零，零变一。

## Video 03 三元运算符（三目运算符）
- 格式:
```
(条件表达式)? 表达式1：表达式2；

                      为true，运算后的结果是表达式1；
            为false，运算后的结果是表达式2；
```

## Video 04 运算符的优先级

- 运算符有不同的优先级，所谓优先级就是表达式运算中的运算顺序。如右表，上一行运算符总优先于下一行。  
- 只有单目运算符、三元运算符、赋值运算符是从右向左运算的。
小括号优先级最高，可以使用小括号提高想要先计算的表达式的优先级

## Video 05 顺序结构

> 顺序结构
>> 程序从上到下逐行地执行，中间没有任何判断和跳转。
> 分支结构
>> 根据条件，选择性地执行某段代码。
>> 有if…else和switch两种分支语句。
> 循环结构
>> 根据循环条件，重复性的执行某段代码。
>> 有while、do…while、for三种循环语句。
注：JDK1.5之后提供了foreach循环，方便的遍历集合、数组元素。

## Video 06 分支结构if - else

### if语句三种格式：
```
1.  if(true){
	执行代码块；
     }

2.  if(条件表达式){
	执行代码块；
      }
     else{
	执行代码块；
      }
3.  if(条件表达式){
	执行代码块；
      }
      else if (条件表达式){
	执行代码块；
      }
       ……
       else{
	执行代码块；
       }
```

## Video 07 分支结构which

```
	switch(变量){
	case 常量1:
		语句1;
		break;
	case 常量2:
		语句2;
		break;
	… …
	case 常量N:
		语句N;
		break;
	default:
		语句;
		break;
	 } 
```
### switch语句相关规则
- switch(表达式)中表达式的返回值必须是下述几种类型之一：
byte，short，char，int，枚举，String；
- case子句中的值必须是常量，且所有case子句中的值应是不同的；
- default子句是可任选的，当没有匹配的case时，执行default
- break语句用来在执行完一个case分支后使程序跳出switch语句块；如果没有break，程序会顺序执行到switch结尾

### switch和if语句的对比
if和switch语句很像，
如果判断的具体数值不多，而且符合byte、 short 、int、 char、枚举，String这六种类型。虽然两个语句都可以使用，建议使用swtich语句。因为效率稍高。
其他情况：对区间判断，对结果为boolean类型判断，使用if，if的使用范围更广。
> 当不知道使用if还是switch时，都使用if就可以,if使用的较多。