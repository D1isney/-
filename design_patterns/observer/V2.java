package observer;

/**
 * 面向对象的傻等
 */

class Child{
	private boolean cry = false;
	
	public boolean isCry() {
		return cry;
	}
	
	public void wakeUp2() {
		System.out.println("Waked Up! Crying Wuwuwuuwuw....");
		cry = true;
	}
}

public class V2 {

	public static void main(String[] args) {
		Child child = new Child();
		while(!child.isCry()) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("observing");
		}
	}

}

