package demo01;

/**
 * ����1-1:ʹ��java����������HelloWorld��
 * Java����롢���л���
 * 
 * @author 12057
 * ����1��ʹ��java������ִ��һ��HelloWorld��
 * 
 * ����2��ʹ��javac��java����ֱ�����ִ��
 *      //�����class �ļ�		-d����
 *      javac -d . HelloWorld.java
 *      //����class�ļ�
 *      java com.itheima.HelloWorld		
 *
 *
 *	<>������̣���ִ�С�javac HelloWorld.java�������ʱ��.javaԴ�ļ�������.class�ֽ����ļ�
 *
 *	<>���й���
 *	1.�����
 *	       ����õ��ֽ����ļ����Ⱦ����ֽ���Ч�������ļ�����У�飬����Ҫͨ�����������ص�JVM�С�������Ҫ˵��һ�£�
 *	�����1�μ������ʱ�򣬲Ż�ȥ���ظ��ࡣҲ����˵����һ��ʼ�Ͱ����е�����ص��ڴ��У��õ�ʱ��Ż���أ���
 *  ��ֻ����1�Ρ�
 *  2.���ִ��
 *     ��ִ�С�java com.itheima.HelloWorld�������ʱ��ϵͳ�ͻ�����һ��JVM���̣�JVM���̴�classpath
 *  ·�����ҵ�һ��HelloWorld.class�������ļ������Ƚ�HelloWorld����Ϣ���ص��������ڣ�������̽�������ع�
 *  �̡�JVM��ɶ�ջ�ڴ�洢����֮��JVM������֮�󣬻Ὣ���ļ����͸�JIT������(��class�ļ�����ɻ�������)��
 *  
 *  ����ش�3���ؼ���
 *     ���룺Java���������Դ�ļ����б����class�ļ�����һ���̽�����������̡�
 *     ���أ���������Ὣclass�ֽ����ļ����ص�JVM��ɽ���
 *     ���У�JVM��class�ֽ����ļ�����֮��ᷢ��JIT���������Է���ɻ������룬��������
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

}
