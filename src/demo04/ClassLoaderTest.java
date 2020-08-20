package demo04;

/**
 * 类加载器委派过程
 * @author 12057
 *
 * 案例1-3:打印所当前类的所有上层的加载器的名称
 * 打印出测试类所有加载器
 * 
 * 类加载器介绍
 * 	类加载器作用
 * 	类加载可以将classpath目录下.class文件，加载到内存中进行一些处理,处理完的结果就是一些字节编码
 *
 * 	类加载器本质
 * 		Java虚拟机中可以安装多个类加载器，系统默认的3个加载器，每个加载器负责加载不同位置的类，
 * 	BootStrap，ExtClassLoader，AppClassLoader。类加载器也是java类，但这里说一下BootStrap不是一个
 * 	Java类，不需要类加载器，它是嵌套在JVM中内核里面的，它可以加载ExtClassLoader和AppClassLoader类。
 *
 * 	双亲委派机制介绍
 * 	从JDK1.2开始类加载采用双亲委托机制。如果一个类加载器收到了类加载器的请求，它首先不会自己去尝试加载
 * 	这个类，而是把这个请求委派给父加载器去完成。每个层次的类加载器都是如此。因此所有的加载请求最终都会传
 * 	送到BootStrap类加载器(启动类加载器)中，只有父类加载反馈自己无法加载这个请求(它的搜索范围没有找到所需
 * 	的类)时，自加载器才会尝试自己去加载。
 *
 * 	1.启动类加载器
 * 		Bootstrap ClassLoader,父子加载存放JDK jre lib(JDK代表JDK的安装目录，下同)，或被Xbootclasspath
 * 	参数指定的路径中的，并且能被虚拟机识别的类库(如rt.jar,所有的java.*开头的类均被Bootstrap Classloader加载)。
 * 	启动类加载器时无法被Java程序直接引用的。
 * 	2.扩展类加载器
 * 		Extension ClassLoader，该加载器由sum.misc.Launcher$ExtClassLoader实现，它负责加载JDK jre lib ext
 * 	目录中，或者由java.ext.dirs系统变量指定的路径中的所有类库(如javax.*开头的类)，开发者可以直接使用扩展类
 * 	加载器。
 * 	3.应用程序类加载器
 * 		Application ClassLoader，该类加载器由sun.misc.Launcher$AppClassLoader来实现，它负责加载用户类路径(
 * 	ClassPath)所指定的类，开发者可以直接使用该类加载器，如果应用程序中没有自定义过自己的类加载器，一般情况
 * 	下这个就是程序中默认的类加载器。
 *
 * 	总结：
 * 		从上面的结果可以看出，并没有获取到ExtClassLoader的父Loader，原因时BootStrap Loader(引用类加载器)
 * 	是用C语言实现的，找不到一个确定的返回父Loader的方式，于是就返回null。
 */

public class ClassLoaderTest {

	public static void main(String[] args) {
		ClassLoader classLoader = ClassLoader.class.getClassLoader();
		while (classLoader != null) {
			String name = classLoader.getClass().getName();
			System.out.println("---->"+name);
			classLoader = classLoader.getParent();
		}
		System.out.println("---->"+classLoader);
	}

}
