package proxy;

/*代理模式
 * 业务逻辑代码分离AOP
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

class TimeProxy7 implements InvocationHandler{
	Movable m;
	
	public TimeProxy7(Movable m) {this.m = m;}
	public void before() {
		System.out.println("method start..");
	}
	
	public void after() {
		System.out.println("method stop..");
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object o = method.invoke(m, args);
		after();
		return o;
	}
}

class LogHander8 implements InvocationHandler {
	
	Tank8 tank8;
	
	public LogHander8(Tank8 tank8) {
		this.tank8 = tank8;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("method " + method.getName() +" start..");
		Object o = method.invoke(tank8, args);
		System.out.println("method " + method.getName() +" start..");
		return o;
	}
	
} 


class Tank8 implements Movable {
	

	@Override
	public void move() {
		System.out.println("Tank moving claclaclacla.....");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class V8 {
	public static void main(String[] args) {
		Tank8 tank8 = new Tank8();
		
		Movable m = (Movable)Proxy.newProxyInstance(Tank8.class.getClassLoader(),
				new Class[] {Movable.class}, 
				new LogHander8(tank8)
				);
		m.move();
	}
}
