package Iterator;


/*迭代器
 * 遍历
 */

class ArrayList5_ implements Collection2_{
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
	
	@Override
	public Iterator_ iterator() {
		return new ArrayListerator();
	}
	//内部类
	private class ArrayListerator implements Iterator_{
		private int currentIndex = 0;

		//没有下一个
		@Override
		public boolean hasNext() {
			if(currentIndex >= index)return false;
			return true;
		}

		@Override
		public Object next() {
			Object o = objects[currentIndex];
			currentIndex++;
			return o;
		}
	}
}

class LinkedList5_ implements Collection2_{
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
	@Override
	public Iterator_ iterator() {
		return new ArrayListerator();
		}
		//内部类
		private class ArrayListerator implements Iterator_{
			private int currentIndex = 0;

			//没有下一个
			@Override
			public boolean hasNext() {
				if(currentIndex >= size)return false;
				return true;
			}

			@Override
			public Object next() {
				Object o = new Node(currentIndex);
				currentIndex++;
				return o;
			}
		}
}

public class V5 {
	public static void main(String[] args) {
		Collection2_ list = new LinkedList5_();
//		Collection2_ list = new ArrayList5_();
		for(int i = 0;i<15;i++) {
			list.add(new String("s"+i));
		}
		System.out.println(list.size());
		
		//这个接口的调用方式
		Iterator_ it = list.iterator();
		//直到hasNext没有下一个了
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
	}
}
