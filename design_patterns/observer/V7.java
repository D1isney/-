package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，观察者需要根据事情的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 */

class Child7{
	private boolean cry = false;
	
	//使用链表把观察者的对象装起来
	private List<Observer7> observer = new ArrayList<>();
	{
		observer.add(new Dad7());
		observer.add(new Mum7());
		observer.add(new Dog7());
	}
	public boolean isCry7() {return cry;}
	
	public void wakeUp7() {
		cry = true;
		
		wakeUpEvent7 event7 = new 
				wakeUpEvent7(System.currentTimeMillis(), "bed",this);
		
		for(Observer7 o : observer) {
			o.actionOnWakeUp7(event7);
		}
	}
}

class Dad7 implements Observer7{
	public void feed7() {System.out.println("dad7 feeding.....");}

	@Override
	public void actionOnWakeUp7(wakeUpEvent7 event7) {
		feed7();
	}
}

class Mum7 implements Observer7{
	public void hug7() {System.out.println("Mum7 hugging.....");}

	@Override
	public void actionOnWakeUp7(wakeUpEvent7 event7) {
		hug7();
	}
}

class Dog7 implements Observer7{
	public void wang7() {System.out.println("Dog7 wang.....");}

	@Override
	public void actionOnWakeUp7(wakeUpEvent7 event7) {
		wang7();
	}
}

/**
 * 观察者只和事件打交道
 * 不和事件源打交道
 * 这样观察者和事件源解耦合了
 */

//事件类
class wakeUpEvent7{
	long timestamp7;
	String loc7;
	
	//源对象
	Child7 source;
	
	public wakeUpEvent7(long timestamp7,String loc7,Child7 source) {
		this.timestamp7 =timestamp7;
		this.loc7 = loc7;
		this.source = source;
	}
}


//定义一个接口
//任何一个观察者都应该去实现这个方法
interface Observer7{
	void actionOnWakeUp7(wakeUpEvent7 event7);
}

public class V7 {

	public static void main(String[] args) {
		Child7 ch = new Child7();
		ch.wakeUp7();
	}

}
