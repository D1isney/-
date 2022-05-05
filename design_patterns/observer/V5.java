package observer;

import java.util.ArrayList;
import java.util.List;


/**
 *分离观察者与被观察者
 */

class Child5{
	private boolean cry = false;
	
	//使用链表把观察者的对象装起来
	private List<Observer5> observer = new ArrayList<>();
	{
		observer.add(new Dad5());
		observer.add(new Mum5());
		observer.add(new Dog5());
	}
	public boolean isCry() {return cry;}
	
	public void wakeUp() {
		cry = true;
		for(Observer5 o : observer) {
			o.actionOnWakeUp5();
		}
	}
}

class Dad5 implements Observer5{
	public void feed() {System.out.println("dad feeding.....");}

	@Override
	public void actionOnWakeUp5() {
		feed();
	}
}

class Mum5 implements Observer5{
	public void hug5() {System.out.println("Mum5 hugging.....");}

	@Override
	public void actionOnWakeUp5() {
		hug5();
	}
}

class Dog5 implements Observer5{
	public void wang5() {System.out.println("Dog5 wang.....");}

	@Override
	public void actionOnWakeUp5() {
		wang5();
	}
}

//定义一个接口
//任何一个观察者都应该去实现这个方法
interface Observer5{
	void actionOnWakeUp5();
}

public class V5 {

	public static void main(String[] args) {
		Child5 ch = new Child5();
		ch.wakeUp();
	}

}
