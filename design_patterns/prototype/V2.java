package prototype;

/*深克隆
 * 对象p1就不会再等于p2对象
 */

public class V2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person2 p1 = new Person2();
		//克隆
		Person2 p2 = (Person2) p1.clone();
		System.out.println(p2.age +" "+ p2.score);
		System.out.println(p2.loc);
		
		System.out.println(p1.loc == p2.loc);
		p2.loc.street = "sh";
		System.out.println(p2.loc);
		
	}
}

class Person2 implements Cloneable{
	int age = 8;
	int score = 100;
	
	Location2 loc = new Location2("bj",22);
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person2 p = (Person2) super.clone();
		p.loc = (Location2) loc.clone();
		return p;
	}
}

class Location2 implements Cloneable{
	String street;
	int roomNo;
	
	public Location2(String street,int roomNo){
		this.street = street;
		this.roomNo = roomNo;
	}
	
	@Override
	public String toString() {
		return "Location [street=" + street + ", roomNo=" + roomNo + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}