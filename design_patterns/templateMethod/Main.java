package templateMethod;

/*模版方法（钩子函数）
 * 定好了模版 等调用者去实现
 */

public class Main {
	public static void main(String[] args) {
		//一定是多态
		Father f = new F();
		f.m();
	}
}

abstract class Father{
	void m() {
		op1();
		op2();
	}
	abstract void op1();
	abstract void op2();
}

class F extends Father{

	@Override
	void op1() {
		System.out.println("op1");
	}

	@Override
	void op2() {
		System.out.println("op2");
	}
	
}
