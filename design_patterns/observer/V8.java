package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，观察者需要根据事情的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 事件也可以行程继承体系
 */

class Child8{
	private boolean cry = false;
	
	//使用链表把观察者的对象装起来
	private List<Observer8> observer = new ArrayList<>();
	{
		observer.add(new Dad8());
		observer.add(new Mum8());
		observer.add(new Dog8());
	}
	public boolean isCry8() {return cry;}
	
	public void wakeUp8() {
		cry = true;
		
		wakeUpEvent8 event8 = new 
				wakeUpEvent8(System.currentTimeMillis(), "bed",this);
		
		for(Observer8 o : observer) {
			o.actionOnWakeUp8(event8);
		}
	}
}

class Dad8 implements Observer8{
	public void feed8() {System.out.println("dad8 feeding.....");}

	@Override
	public void actionOnWakeUp8(wakeUpEvent8 event8) {
		feed8();
	}
}

class Mum8 implements Observer8{
	public void hug8() {System.out.println("Mum8 hugging.....");}

	@Override
	public void actionOnWakeUp8(wakeUpEvent8 event8) {
		hug8();
	}
}

class Dog8 implements Observer8{
	public void wang8() {System.out.println("Dog8 wang.....");}

	@Override
	public void actionOnWakeUp8(wakeUpEvent8 event8) {
		wang8();
	}
}

/**
 * 观察者只和事件打交道
 * 不和事件源打交道
 * 这样观察者和事件源解耦合了
 */

abstract class Event<T>{
	abstract T getSource();
}

//事件类
class wakeUpEvent8 extends Event<Child8>{
	long timestamp8;
	String loc8;
	
	//源对象
	Child8 source8;
	
	public wakeUpEvent8(long timestamp8,String loc8,Child8 source8) {
		this.timestamp8 =timestamp8;
		this.loc8 = loc8;
		this.source8 = source8;
	}
	
	@Override
	Child8 getSource() { return source8;}
}


//定义一个接口
//任何一个观察者都应该去实现这个方法
interface Observer8{
	void actionOnWakeUp8(wakeUpEvent8 event8);
}

public class V8 {

	public static void main(String[] args) {
		Child8 ch = new Child8();
		ch.wakeUp8();
	}

}
