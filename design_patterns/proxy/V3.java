package proxy;
import java.util.Random;

/*
 * 问题二：不修改源代码去记录坦克移动的时间
 * 解决：继承
 * 慎用继承：耦合度太高
 */
class Tank3 implements Movable{
	@Override
	public void move() {
		System.out.println("Tank moving claclacla....");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Tank3_1 extends Tank3{
	public void move() {
		
		long start = System.currentTimeMillis();
		super.move();
		long end = System.currentTimeMillis();
		
		start /= 1000;
		end /= 1000;
		System.out.println((end-start)+"s");
	}
}

public class V3 {
	public static void main(String[] args) {
		new Tank3_1().move();
	}
}
