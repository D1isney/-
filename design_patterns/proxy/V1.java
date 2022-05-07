package proxy;

import java.util.Random;

/*
 * 问题一：我想记录坦克移动时间
 */
class Tank1 implements Movable {

	/*
	 * 模拟坦克移动了一段时间
	 */
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