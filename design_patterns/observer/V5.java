package observer;

import java.util.ArrayList;
import java.util.List;


/**
 *分离观察者与被观察者
 */

class Child5{
	private boolean cry = false;
	
	//使用链表把观察者的对象装起来
	private List<Observer> observer = new ArrayList<>();
	{
		observer.add(new Dad5());
		observer.add(new Mum5());
		observer.add(new Dog5());
	}
	public boolean isCry() {return cry;}
	
	public void wakeUp() {
		cry = true;
		for(Observer o : observer) {
			o.actionOnWakeUp();
		}
	}
}

class Dad5 implements Observer{
	public void feed() {System.out.println("dad feeding.....");}

	@Override
	public void actionOnWakeUp() {
		feed();
	}
}

class Mum5 implements Observer{
	public void hug5() {System.out.println("Mum5 hugging.....");}

	@Override
	public void actionOnWakeUp() {
		hug5();
	}
}

class Dog5 implements Observer{
	public void wang5() {System.out.println("Dog5 wang.....");}

	@Override
	public void actionOnWakeUp() {
		wang5();
	}
}

//定义一个接口
//任何一个观察者都应该去实现这个方法
interface Observer{
	void actionOnWakeUp();
}

public class V5 {

	public static void main(String[] args) {
		Child5 ch = new Child5();
		ch.wakeUp();
	}

}
