package observer;

/**观察者
 *加入观察者
 */

class Child3{
	private boolean cry = false;
	
	public Dad3 d = new Dad3();
	
	public boolean isCry() {
		return cry;
	}
	
	public void wakeUp3() {
		cry = true;
		d.feed3();
	}
}
class Dad3{
	public void feed3() {
		System.out.println("dad feeding.....");
	}
}

public class V3 {

	public static void main(String[] args) {
//		V3 v = new V3();
		Child3 ch = new Child3();
		ch.wakeUp3();
	}
}
