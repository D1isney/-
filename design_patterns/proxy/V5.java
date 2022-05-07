package proxy;

import java.util.Random;

/**
 * 代理各种类型
 */

class Tank5 implements Movable{
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

class TanKTimeProxy5 implements Movable{
	Tank5 tank5;
	public TanKTimeProxy5(Tank5 tank5) {
		this.tank5 = tank5;
	}
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		tank5.move();
		long end = System.currentTimeMillis();
		start /= 1000;
		end /= 1000;
		System.out.println((end-start)+"s");
	}
}

class TankLogProxy5 implements Movable{
	Tank5 tank5;
	public TankLogProxy5(Tank5 tank5) {
		this.tank5 = tank5;
	}
	@Override
	public void move() {
		System.out.println("start moving....");
		tank5.move();
		long end = System.currentTimeMillis();
		System.out.println("stopped!");
	}
}
public class V5 {
	public static void main(String[] args) {
		new TanKTimeProxy5(new Tank5()).move();
	}
}
