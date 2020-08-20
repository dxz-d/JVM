package demo01;

/**
 * 案例1-1:使用java命令来运行HelloWorld类
 * Java类编译、运行机制
 * 
 * @author 12057
 * 步骤1：使用java命令来执行一个HelloWorld类
 * 
 * 步骤2：使用javac和java命令分别编译和执行
 *      //编译成class 文件		-d代表
 *      javac -d . HelloWorld.java
 *      //运行class文件
 *      java com.itheima.HelloWorld		
 *
 *
 *	<>编译过程：当执行“javac HelloWorld.java”命令的时候，.java源文件会编译成.class字节码文件
 *
 *	<>运行过程
 *	1.类加载
 *	       编译好的字节码文件首先经过字节码效验器对文件进行校验，最终要通过加载器加载到JVM中。这里需要说明一下，
 *	程序第1次加载类的时候，才会去加载该类。也就是说不是一开始就把所有的类加载到内存中，用的时候才会加载，而
 *  且只加载1次。
 *  2.类的执行
 *     当执行“java com.itheima.HelloWorld”命令的时候，系统就会启动一个JVM进程，JVM进程从classpath
 *  路径中找到一个HelloWorld.class二进制文件，首先将HelloWorld类信息加载到方法区内，这个过程叫做类加载过
 *  程。JVM完成堆栈内存存储数据之后，JVM解释完之后，会将该文件发送给JIT编译器(将class文件编译成机器代码)。
 *  
 *  问题回答：3个关键字
 *     编译：Java编译器会对源文件进行编译成class文件，这一过程叫做“编译过程”
 *     加载：类加载器会将class字节码文件加载到JVM完成解释
 *     运行：JVM将class字节码文件解释之后会发给JIT编译器，以翻译成机器代码，进行运行
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

}
