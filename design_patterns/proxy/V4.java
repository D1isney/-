package proxy;

import java.util.Random;

/*
 * 问题二：不修改源代码去记录坦克移动的时间
 * 解决：使用代理模式
 */
class Tank4 implements Movable{
	
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
class TanKTimeProxy4 implements Movable{
	
	Tank4 tank4;
	public TanKTimeProxy4(Tank4 tank4) {
		this.tank4 = tank4;
	}

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		tank4.move();
		long end = System.currentTimeMillis();
		
		start /= 1000;
		end /= 1000;
		System.out.println((end-start)+"s");
	}
}

public class V4 {
	public static void main(String[] args) {
		new TanKTimeProxy4(new Tank4()).move();
	}
}
