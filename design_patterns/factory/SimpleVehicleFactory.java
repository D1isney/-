package factory;

/**
 *简单的工厂扩展性不好
 */

//创建一个类定义为工厂
//用来生产交通工具的对象
public class SimpleVehicleFactory {
	public Car createCar() {
		//这里定义你的前置操作
		return new Car();
	}
	
	public Plane createFlane() {
		return new Plane();
	}
	
}
