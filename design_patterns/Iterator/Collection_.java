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
