package Iterator;

import org.w3c.dom.Node;

/*迭代器
 * 链表实现
 */

public class V2 {
	public static void main(String[] args) {
		LinkedList_ list = new LinkedList_();
		for(int i = 0;i<15;i++) {
			list.add(new String("S" + i));
		}
		System.out.println(list.size());
	}
}

//相比数组，这个容器不用考虑边界问题，可以动态扩展
class LinkedList_{
	Node head = null;
	Node tail = null;
	//日前容器有中有多个元素
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
	
	//内部类
	private class Node{
		//真正的数据
		private Object o;
		
		//指向下一个节点
		Node next;
		public Node(Object o) {
			this.o = o;
		}
		public int size() {
			return size;
		}
	}
}

