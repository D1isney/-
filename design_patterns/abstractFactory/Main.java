package abstractFactory;


public class Main {

	public static void main(String[] args) {
		Car c = new Car();
		c.go();
		MagicStick w = new MagicStick();
		w.shoot();
		MushRoom b = new MushRoom();
		b.pringtName();
	}

}
