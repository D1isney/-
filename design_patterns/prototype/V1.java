package prototype;

/*浅克隆
 * 两个对象之间他的引用指向同一个对象
 * 互相就会有影响
 */

public class V1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person1 p1 = new Person1();
		//克隆
		Person1 p2 = (Person1) p1.clone();
		System.out.println(p2.age +" "+ p2.score);
		System.out.println(p2.loc);
		
		System.out.println(p1.loc == p2.loc);
		p2.loc.street = "sh";
		System.out.println(p2.loc);
		
	}
}

//  不实现接口的话不会报错 但是运行会报错
// 	标记性接口是没有办法的
//						标记性接口
class Person1 implements Cloneable{
	int age = 8;
	int score = 100;
	
	Location loc = new Location("bj",22);
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Location{
	String street;
	int roomNo;
	
	public Location(String street,int roomNo){
		this.street = street;
		this.roomNo = roomNo;
	}
	
	@Override
	public String toString() {
		return "Location [street=" + street + ", roomNo=" + roomNo + "]";
	}
	
}
