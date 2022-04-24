package strategy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	
	/**
	 * 策略模式
	 */

	public static void main(String[] args) {
//		int[]a ={9,2,3,5,7,1,4};
//		Cat []a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
		//定义一个排序器
		//选择排序 也可以用冒泡排序
		Dog[] a = {new Dog(3),new Dog(5),new Dog(1)};
		Sorter sorter = new Sorter();
		sorter.sort(a);
		System.out.println(Arrays.toString(a));
		
		
	}

}
