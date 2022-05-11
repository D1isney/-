package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/*迭代器
 * JDK的容器的Iterator
 */

public class V6 {
	public static void main(String[] args) {
		Collection a = new LinkedList();
		Collection c = new ArrayList();
		for(int i = 0;i<15;i++) {
			c.add(new String("s"+i));
		}
		System.out.println(c.size());
	}
}
