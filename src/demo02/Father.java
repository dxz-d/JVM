package demo02;

/**
 * 类加载生命周期
 * @author 12057
 * 案例1-2-1：主动引用
 * 
 * 步骤一：创建Father类和Son类
 * 父类
 */
public class Father {
	static {
		System.out.println("完成父类静态代码块初始化");
	}
	public static String myname = "itheima";
}


