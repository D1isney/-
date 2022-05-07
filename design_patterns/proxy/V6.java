package proxy;

import java.util.Random;

/**
 * 静态代理
 */

class TankTimeProxy6 implements Movable{
	Movable m;
	
	public TankTimeProxy6(Movable m) {
		this.m = m;
	}
	
	@Override
	public void move() {
		
		long start = System.currentTimeMillis();
		m.move();
		long end = System.currentTimeMillis();
		
		start /= 1000;
		end /= 1000;
		System.out.println((end-start)+"s");
	}
}

class TankLogProxy6 implements Movable{
	Movable m;
	
	public TankLogProxy6(Movable m) {
		this.m = m;
	}
	
	@Override
	public void move() {
		System.out.println("start moving.....");
		m.move();
		long end = System.currentTimeMillis();
		System.out.println("stoppped!");
	}
	
}
class Tank6 implements Movable{

	@Override
	public void move() {
		System.out.println("Tank moving claclacla......");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class V6 {
	public static void main(String[] args) {
		new TankTimeProxy6(
				new TankLogProxy6(
						new Tank6()
						)
				).move();
	}

}
