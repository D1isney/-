package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

//如果想让LogProxy 不仅可以代理坦克，
//还可以代理任何其他可以代理的类型 Object

/*
 * 动态代理
 * 使用 jdk的动态代理
 */

class Tank7 implements Movable{
	@Override
	public void move() {
		System.out.println("tank7 moving claclacla...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class V7 {
	public static void main(String[] args) {
		Tank7 tank7 = new Tank7();
		
			/* class
			 * class文件都叫java的字节码
			 * 通过二进制字节码分析类的属性和方法
			 */
		
			/* Proxy
			 * reflection
			 * java的反射
			 */
		
			/* newProxyInstance()
			 * 创建代理对象
			 * 调用成功一定返回一个代理对象
			 */
		
			/* 第一个参数
			 * 写类加载器
			 * Tank7.class.getClassLoader()
			 */
		
			/* 第二个参数
			 * new Class[] {Movable.class}
			 * 应该实现什么样的接口
			 */
		
			/* 第三个参数
			 * InvocationHandler()
			 * 调用的时候的处理器
			 * 指定了被调用的方法怎么去处理
			 */
		Movable m = (Movable)Proxy.newProxyInstance(Tank7.class.getClassLoader(), 
				new Class[] {Movable.class},        //tank.class.getInterfaces()
				new LogHander7(tank7)
					
//				new InvocationHandler() {
					//匿名类
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
////						System.out.println("method " + method.getName() + " start..");
////						long start = System.currentTimeMillis();
////						Object o = method.invoke(tank7, args);
////						long end = System.currentTimeMillis();
////						System.out.println("method " + method.getName() + " end!");
////						System.out.println("time:"+((end/1000)-(start/1000))+"s");
////						return o;
//					}
//				}
				);
				m.move();
	}
}


//外部类实现
class LogHander7 implements InvocationHandler{
	
	Tank7 tank7;
	
	public LogHander7(Tank7 tank7) {
		this.tank7 = tank7;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("method " + method.getName() + " start..");
		long start = System.currentTimeMillis();
		Object o = method.invoke(tank7, args);
		long end = System.currentTimeMillis();
		System.out.println("method " + method.getName() + " end!");
		System.out.println("time:"+((end/1000)-(start/1000))+"s");
		return o;
	}
}
