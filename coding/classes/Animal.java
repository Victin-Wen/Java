/**
 * Day05 Page02
 * 动物
 * author Vickie
 */
package learn;

public class Animal {
	String name;//动物的名称
	int eye;//眼睛的个数
	int legs;//几条腿
	
/**
 * 	输出动物吃的食物
 * @param food 食物
 */
	public void eat(String food, int i, char s) {//方法的参数,形参，可以有多个，用逗号隔开
		System.out.println("此种动物的食物是： " + food);
	}
/**
 * 动物的移动方式
 * @param moveType 移动方式
 */
	public void move(String moveType) {
		System.out.println("此种动物的移动方式是： " + moveType);
	}

}
