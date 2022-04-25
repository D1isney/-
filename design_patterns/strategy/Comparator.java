package strategy;

//声明是一个函数接口
@FunctionalInterface
public interface Comparator<T>{
//	api中o1 < o2 返回-1
//		 o1 = o2 返回 0
//		 o1 > o2 返回 正数
	int compar(T o1, T o2);
	//比较器Comparator
	
	default void m() {
		System.out.println("m");
	}
}
