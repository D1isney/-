package factory;

//汽车工厂
public class CarFactory {
	
	//任意定制生产过程
	public Moreable creat() {
		System.out.println("a Car created!");
		return new Car();
	}

}
