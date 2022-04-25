package strategy;

/**
 *泛型替换Object
 */
public interface Comparable<T> {
	/**
	 * 自己定义的
	 * 不要跟java.lang的混搅
	 */
	int compareTo(T o);

}
