package bridge;

abstract class Gift{
}
class Book extends Gift{
}
class Flower extends Gift{
}
class MM{
	String name;
}

public class V1 {
	public class GG{
		public void chase(MM mm) {
			Gift g = new Book();
			give(mm,g);
		}
	}
	public void give(MM m ,Gift g) {
		
	}
}
