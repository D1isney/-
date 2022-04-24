package strategy;

public class Cat implements Comparable<Cat>{ 
	int weight,height;
	public Cat(int weigjt,int height){
		this.weight = weigjt;
		this.height = height;
	}
	
	public int compareTo(Cat c) {
//		//强制转换
//		Cat c = (Cat)o;
		if(this.weight < c.weight) return -1;
		else if(this.weight > c.weight) return 1;
		else return 0;
	}

	
	@Override
	public String toString() {
		return "Cat [weight=" + weight + ", height=" + height + "]";
	}

	
}
