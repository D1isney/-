package bridge;

/*桥接模式
 * 分离抽象类与具体实现，让他们可以独自发展
 * 用聚合代替继承
 * Gift -> WarmGift ColdGift WildGift
 * GiftImpl -> Flower Ring Car
 */

abstract class Gift4{
	GiftImpl impl;
}
class Book4 extends GiftImpl{
}
class Flower4 extends GiftImpl{
}
class MM4{
	String name;
}

class GiftImpl extends Gift4{
}

class WarmGift4 extends Gift4{
	public WarmGift4(GiftImpl impl) {
		this.impl = impl;
	}
}
class WildGift4 extends Gift4{
	public WildGift4(GiftImpl impl) {
		this.impl = impl;
	}
}

public class V4 {
	public class GG4{
		public void chase(MM4 mm) {
			Gift4 g = new WarmGift4(new Flower4());
			give4(mm,g);
		}
	public void give4(MM4 m ,Gift4 g) {
		System.out.println(g+"gived!");
		}
	}
}
