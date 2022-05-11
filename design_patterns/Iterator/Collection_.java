package Iterator;

public interface Collection_ {
	void add(Object o);
	int size();
}

/*迭代器
 * 添加遍历方法
 */
interface Collection2_ {
	void add(Object o);
	int size();
	Iterator_ iterator();
}

interface Collection3_<E> {
	void add(E o);
	int size();
	Iterator2_<E> iterator2();
}

