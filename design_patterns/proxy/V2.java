package proxy;
import java.util.Random;

/*
 * 问题一：我想记录坦克移动时间
 * 最简单的办法：修改代码，记录时间
 */

class Tank2 implements Movable {
	/*
	 * 模拟坦克移动了一段时间
	 */
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		System.out.println("Tank moving claclaclacla.....");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		start = start / 1000;
		long end = System.currentTimeMillis();
		end /= 1000;
		
		System.out.println((end-start)+"s");
	}
}

public class V2 {
	public static void main(String[] args) {
		new Tank2().move();
	}
}
