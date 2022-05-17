package state;

public class V2 {

}

class MM2{
	String name;
	MMState2 state2;
	public void smile() {
		state2.smile();
	}
	public void cry() {
		state2.cry();
	}
	public void say() {
		state2.say();
	}
}

class MMGappyState extends MMState2{

	@Override
	void smile() {
		System.out.println("happy smile");
	}

	@Override
	void cry() {
		System.out.println("happy cry");
	}

	@Override
	void say() {
		System.out.println("happy say");
	}
	
}

abstract class MMState2{
	abstract void smile();
	abstract void cry();
	abstract void say();
}