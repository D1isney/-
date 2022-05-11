package Iterator;

/*迭代器
 * 遍历容器
 */

class ArrayList4_ implements Collection_{
	Object[] objects = new Object[10];
	private int index = 0;
	public void add(Object o) {
		if(index == objects.length) {
			Object[] newObjects = new Object[objects.length * 2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}
		objects[index] = o;
		index++;
	}
	@Override
	public int size() {
		return index;
	}
}

class LinkedList4_ implements Collection_{
	Node head = null;
	Node tail = null;
	private int size = 0;
	public void add(Object o) {
		Node n = new Node(o);
		n.next = null;
		if(head == null) {
			head = n;
			tail = n;
		}
		
		tail.next = n;
		tail = n;
		size++;
	}
	public int size() {
		return size;
	}
	private class Node{
		private Object o;
		Node next;
		public Node(Object o) {
			this.o = o;
		}
		public int size() {
			return size;
		}
	}
}

public class V4 {
	public static void main(String[] args) {
		Collection_ list = new LinkedList4_();
//		Collection_ list = new ArrayList4_();
		for(int i = 0;i<15;i++) {
			list.add(new String("s"+i));
		}
		System.out.println(list.size());
		
		//强转为LinkedList4
		LinkedList4_ list4 = (LinkedList4_)list;
		
		for(int i =0;i<list4.size();i++) {
			//这种遍历不能实现通用
			//例如 可以遍历ArrayList LinkedList 
			//但是无法遍历 哈希set
		}
	}
}
