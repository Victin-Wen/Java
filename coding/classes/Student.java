/**
 * Day05 Page03
 * 学生类
 * @author Vickie
 * 
 */
package learn;

public class Student {
	public String name;//姓名
	public int age;//年龄
	public String course;//课程
	public String interest;//兴趣
	
	/**
	 * 显示学生个人信息
	 */
	public void showInfo() {//列编辑模式： Shift + Alt + A，鼠标变为十字模式
		System.out.println("name： " + name);
		System.out.println("age： " + age);
		System.out.println("course： " + course);
		System.out.println("interest： " + interest);
	}

}
