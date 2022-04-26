package factory;

public class Main {
	public static void main(String[] args) {
//		Car c = new Car();
//		c.go();
//		
//		Plane p = new Plane();
//		p.go();
		
		//多态
		//新建一个接口 让他作为所有类的父类
//		Moreable m = new Brroom();
//		m.go();
		
		Moreable m = new CarFactory().creat();
		m.go();
		
		
	}
}
