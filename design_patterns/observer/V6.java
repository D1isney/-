package observer;

import java.util.ArrayList;
import java.util.List;

class Child6{
	private boolean cry = false;
	
	//使用链表把观察者的对象装起来
	private List<Observer6> observer = new ArrayList<>();
	{
		observer.add(new Dad6());
		observer.add(new Mum6());
		observer.add(new Dog6());
	}
	public boolean isCry() {return cry;}
	
	public void wakeUp() {
		cry = true;
		
		wakeUpEvent6 event6 = new wakeUpEvent6(System.currentTimeMillis(), "bed");
		
		for(Observer6 o : observer) {
			o.actionOnWakeUp6(event6);
		}
	}
}

class Dad6 implements Observer6{
	public void feed6() {System.out.println("dad feeding.....");}

	@Override
	public void actionOnWakeUp6(wakeUpEvent6 event6) {
		feed6();
	}
}

class Mum6 implements Observer6{
	public void hug6() {System.out.println("Mum5 hugging.....");}

	@Override
	public void actionOnWakeUp6(wakeUpEvent6 event6) {
		hug6();
	}
}

class Dog6 implements Observer6{
	public void wang6() {System.out.println("Dog5 wang.....");}

	@Override
	public void actionOnWakeUp6(wakeUpEvent6 event6) {
		wang6();
	}
}

//事件类
class wakeUpEvent6{
	long timestamp6;
	String loc6;
	
	public wakeUpEvent6(long timestamp6,String loc6) {
		this.timestamp6 =timestamp6;
		this.loc6 = loc6;
	}
}


//定义一个接口
//任何一个观察者都应该去实现这个方法
interface Observer6{
	void actionOnWakeUp6(wakeUpEvent6 event6);
}

public class V6 {

	public static void main(String[] args) {
		Child5 ch = new Child5();
		ch.wakeUp();
	}

}
