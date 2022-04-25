package strategy;

public class CatHeightComparator implements Comparator<Cat> {

	/**
	 * 按高度排序
	 */
	@Override
	public int compar(Cat o1, Cat o2) {
		if(o1.height > o2.height) return -1;
		else if(o1.height < o2.height)return 1;
		else return 0;
	}


}
