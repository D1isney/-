package abstractFactory;


public class Main {

	public static void main(String[] args) {
		
//		Car c = new Car();
//		c.go();
//		MagicStick w = new MagicStick();
//		w.shoot();
//		MushRoom b = new MushRoom();
//		b.printName();
		
		/**
		 * 产品族
		 */
		AbstractFactory f = new ModernFactory();
		
		Vehicle c = f.createVehicle();
		c.go();
		
		Weapon w = f.createWeapon();
		w.shoot();
		
		Food b = f.createFood();
		b.printName();
	}
}
