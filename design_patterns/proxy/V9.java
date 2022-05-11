package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

class TimeProxy9 implements InvocationHandler{
	Movable m;
	
	public TimeProxy9(Movable m) {this.m = m;}
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

class LogHander9 implements InvocationHandler {
	
	Tank9 tank9;
	
	public LogHander9(Tank9 tank9) {
		this.tank9 = tank9;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("method " + method.getName() +" start..");
		Object o = method.invoke(tank9, args);
		System.out.println("method " + method.getName() +" start..");
		return o;
	}
	
} 


class Tank9 implements Movable {
	

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

public class V9 {
	public static void main(String[] args) {
		Tank9 tank9 = new Tank9();
		
		//代理产生器
		//动态生成class
//		System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
		
		Movable m = (Movable)Proxy.newProxyInstance(Tank8.class.getClassLoader(),
				new Class[] {Movable.class}, 
				new LogHander9(tank9)
				);
		m.move();
	}
}

