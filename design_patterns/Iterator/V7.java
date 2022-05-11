package Iterator;

class ArrayList7_<E> implements Collection3_<E>{

	E[] objects = (E[])new Object[10];
	private int index = 0;
	@Override
	public void add(E o) {
		if(index == objects.length) {
			E[] newObjects = (E[])new Object[objects.length * 2];
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

	public Iterator2_<E> iterator2() {
		return new ArrayListerator();
	}
	//内部类
	private class ArrayListerator implements Iterator2_<E>{
		private int currentIndex = 0;

		//没有下一个
		@Override
		public boolean hasNext() {
			if(currentIndex >= index)return false;
			return true;
		}

		@Override
		public E next() {
			E o = objects[currentIndex];
			currentIndex++;
			return o;
		}
	}
}

public class V7 {
	public static void main(String[] args) {
		Collection3_<String> list = new ArrayList7_<>();
		for(int i = 0;i<15;i++) {
			list.add(new String("s"+i));
		}
		System.out.println(list.size());
		
		
		//这个接口的调用方式
		Iterator2_<String> it = list.iterator2();
		//直到hasNext没有下一个了
		while(it.hasNext()) {
			String o = it.next();
			System.out.println(o);
		}
	}
}
