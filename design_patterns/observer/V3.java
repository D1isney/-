package observer;
/**
 *加入观察者
 */

public class V3 {

class Child3{
	private boolean cry = false;
	
	public Dad3 d = new Dad3();
	
	public boolean isCry() {
		return cry;
	}
	
	public void wakeUp3() {
		cry = true;
		d.feed();
	}
}
	
class Dad3{
	public void feed() {
		System.out.println("dad feeding.....");
	}
}
	public static void main(String[] args) {

	}
}
