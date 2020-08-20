package demo04;

/**
 * �������ί�ɹ���
 * @author 12057
 *
 * ����1-3:��ӡ����ǰ��������ϲ�ļ�����������
 * ��ӡ�����������м�����
 * 
 * �����������
 * 	�����������
 * 	����ؿ��Խ�classpathĿ¼��.class�ļ������ص��ڴ��н���һЩ����,������Ľ������һЩ�ֽڱ���
 *
 * 	�����������
 * 		Java������п��԰�װ������������ϵͳĬ�ϵ�3����������ÿ��������������ز�ͬλ�õ��࣬
 * 	BootStrap��ExtClassLoader��AppClassLoader���������Ҳ��java�࣬������˵һ��BootStrap����һ��
 * 	Java�࣬����Ҫ�������������Ƕ����JVM���ں�����ģ������Լ���ExtClassLoader��AppClassLoader�ࡣ
 *
 * 	˫��ί�ɻ��ƽ���
 * 	��JDK1.2��ʼ����ز���˫��ί�л��ơ����һ����������յ���������������������Ȳ����Լ�ȥ���Լ���
 * 	����࣬���ǰ��������ί�ɸ���������ȥ��ɡ�ÿ����ε��������������ˡ�������еļ����������ն��ᴫ
 * 	�͵�BootStrap�������(�����������)�У�ֻ�и�����ط����Լ��޷������������(����������Χû���ҵ�����
 * 	����)ʱ���Լ������Ż᳢���Լ�ȥ���ء�
 *
 * 	1.�����������
 * 		Bootstrap ClassLoader,���Ӽ��ش��JDK jre lib(JDK����JDK�İ�װĿ¼����ͬ)����Xbootclasspath
 * 	����ָ����·���еģ������ܱ������ʶ������(��rt.jar,���е�java.*��ͷ�������Bootstrap Classloader����)��
 * 	�����������ʱ�޷���Java����ֱ�����õġ�
 * 	2.��չ�������
 * 		Extension ClassLoader���ü�������sum.misc.Launcher$ExtClassLoaderʵ�֣����������JDK jre lib ext
 * 	Ŀ¼�У�������java.ext.dirsϵͳ����ָ����·���е��������(��javax.*��ͷ����)�������߿���ֱ��ʹ����չ��
 * 	��������
 * 	3.Ӧ�ó����������
 * 		Application ClassLoader�������������sun.misc.Launcher$AppClassLoader��ʵ�֣�����������û���·��(
 * 	ClassPath)��ָ�����࣬�����߿���ֱ��ʹ�ø�������������Ӧ�ó�����û���Զ�����Լ������������һ�����
 * 	��������ǳ�����Ĭ�ϵ����������
 *
 * 	�ܽ᣺
 * 		������Ľ�����Կ�������û�л�ȡ��ExtClassLoader�ĸ�Loader��ԭ��ʱBootStrap Loader(�����������)
 * 	����C����ʵ�ֵģ��Ҳ���һ��ȷ���ķ��ظ�Loader�ķ�ʽ�����Ǿͷ���null��
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
