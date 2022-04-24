package strategy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	
	/**
	 * 策略模式
	 */

	public static void main(String[] args) {
//		int[]a ={9,2,3,5,7,1,4};
		Cat []a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
		//定义一个排序器
		//选择排序 也可以用冒泡排序
//		Dog[] a = {new Dog(3),new Dog(5),new Dog(1)};
		Sorter<Cat> sorter = new Sorter<>();
		
		/**
		 * 策略模式
		 * Comparator接口是桥梁
		 * implements实现接口的策略通过接口传到sort上
		 * 需要不同的排序就 添加一个类实现implements接口
		 */
//		sorter.sort(a,new CatHeightComparator());
		
		//拉姆达表达式
		//函数式接口
		sorter.sort(a,(o1,o2)->{
			if(o1.weight < o2.weight) return -1;
			else if(o1.weight > o2.weight) return 1;
			else return 0;
		});
		System.out.println(Arrays.toString(a));
		
		
	}

}
