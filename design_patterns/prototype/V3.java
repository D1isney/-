package prototype;

/*深克隆
 */

public class V3 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person3 p1 = new Person3();
		Person3 p2 = (Person3) p1.clone();
		System.out.println(p2.age +" "+ p2.score);
		System.out.println(p2.loc);
		
		System.out.println(p1.loc == p2.loc);
		p2.loc.street = "sh";
		System.out.println(p2.loc);
		
	}
}

class Person3 implements Cloneable{
	int age = 8;
	int score = 100;
	
	Location3 loc = new Location3("bj",22);
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person3 p = (Person3) super.clone();
		p.loc = (Location3) loc.clone();
		return p;
	}
}

class Location3 implements Cloneable{
	//引用类型 String类型不需要进行克隆
	//String类型无法克隆
	//因为在常量池 本来就是公用的
	String street;
	int roomNo;
	
	public Location3(String street,int roomNo){
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