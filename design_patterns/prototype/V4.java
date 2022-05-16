package prototype;

/*深克隆
 */

public class V4 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person4 p1 = new Person4();
		Person4 p2 = (Person4) p1.clone();
		System.out.println(p2.age +" "+ p2.score);
		System.out.println(p2.loc);
		System.out.println(p1.loc == p2.loc);
		
		//让p1的street逆序
		p1.loc.street.reverse();
		System.out.println(p2.loc.street);
		
		p2.loc.street = new StringBuilder("sh");
		
		System.out.println(p2.loc);
		
	}
}

class Person4 implements Cloneable{
	int age = 8;
	int score = 100;
	
	Location4 loc = new Location4(new StringBuilder("bj"),22);
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person4 p = (Person4) super.clone();
		p.loc = (Location4) loc.clone();
		return p;
	}
}

class Location4 implements Cloneable{
	//这样StringBuilder就要重新去克隆一份
	StringBuilder street;
	int roomNo;
	
	public Location4(StringBuilder street,int roomNo){
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
