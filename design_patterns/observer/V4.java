package observer;

/**观察者
 * 加入多个观察者
 */

class Dad4{
	public void feed() {
		System.out.println("dad feeding.....");
	}
}
class Mum4{
	public void hug() {
		System.out.println("mum hugging.....");
	}
}
class Dog4{
	public void wang() {
		System.out.println("dog wang.......");
	}
}
class Child4{
	private boolean cry = false;
	private Dad4 dad = new Dad4();
	private Mum4 mum = new Mum4();
	private Dog4 dog = new Dog4();
	
	public boolean isCry() {
		return cry;
	}
	
	public void wakeUp4() {
		cry = true;
		dad.feed();
		mum.hug();
		dog.wang();
	}
	
}


public class V4 {
	public static void main(String[] args) {
		Child4 ch = new Child4();
		ch.wakeUp4();
	}
}
