package Iterator;

import java.util.ArrayList;

/*迭代器
 * 用来做遍历的
 * 数组实现
 */

public class V1 {
	public static void main(String[] args) {
		
		//构建一个容器 可以添加对象
		ArrayList_ list = new ArrayList_ ();
		
		for(int i = 0;i<15;i++) {
			list.add(new String("s" + i));
		}
		System.out.println(list.size());
	}
}

//相比与数组 这个容器不用考虑边界 可以动态扩展
//底层用数组实现
class ArrayList_{
	Object[] objects = new Object[10];
	//objects中下一个空的位置在哪 或者说，目前容器中有多少个元素
	private int index = 0;
	public void add(Object o) {
		
		//判断容器的大小
		if(index == objects.length) {
											//jdk是按百分之50来扩
											//动态扩展
			Object[] newObjects = new Object[objects.length * 2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}
		
		objects[index] = o;
		index++;
	}
	
	public int size() {
		return index;
	}
}
