package Iterator;

/*迭代器接口
 * 需要遍历的都要实现这个接口
 * 并且判断容器的类型
 */

public interface Iterator_ {
	boolean hasNext();
	
	Object next();
}

interface Iterator2_<E> {
	boolean hasNext();
	
	E next();
}
