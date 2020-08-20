package demo03;

/**
 * 
 * @author 12057
 * 
 * 案例1-2-2:被动引用不会导致类的装载实例
 * 
 * 步骤一:创建测试类，测试调用服了静态变量
 * 
 * 测试:子类调用父类静态成员，是否对子类进行加载和初始化
 * 
 * 总结:
 * 	1.Father类和Son类都有被类加载器加载到JVM中了。
 * 	2.打印出了"完成父类静态代码块初始化"语句说明父类Father类进行初始化，但是
 * 	子类Son虽然被加载了但是没有被初始化。
 * 	3.打印出了"itheima"数值,则说明了只有直接定义该字段的类才会被初始化
 */
public class LoaderFatherTest {

	public static void main(String[] args) {
		System.out.println(Son.myname);
	}

}
