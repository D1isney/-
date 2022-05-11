package Iterator;

/*迭代器
 * 添加容器的共同接口，实现容器的替换
 */

class ArrayList3_ implements Collection_{
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

class LinkedList3_ implements Collection_{
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

//interface Collection_{
//	void add(Object o);
//	int size();
//}
	
public class V3 {
	public static void main(String[] args) {
		Collection_ list = new LinkedList3_();
//		Collection_ list = new ArrayList3_();
		for(int i = 0;i<15;i++) {
			list.add(new String("s"+i));
		}
		System.out.println(list.size());
	}
}
