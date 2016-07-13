package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		MyArrayList<Integer> arr = new MyArrayList<Integer>();
		arr.add(0, 0);
		arr.add(1, 7);
		arr.add(12);
		arr.add(3);
		arr.add(5);
		arr.add(28);
		arr.add(14);
	
		System.out.println(arr.getData(2));
		System.out.println(arr.subList(2, 5));
//		for (int i = 0; i < arr.size() ; i++) {
//			System.out.println("index is " + i + " element is " + arr.getData(i));
//		}
//		System.out.println(arr.toString());
//		System.out.println(arr.toArray());
		//System.out.println(arr.clone());
		
//		ArrayList<Integer> test = new ArrayList<Integer>();
		LinkedList<Integer> test2 = new LinkedList<Integer>();
//		test2.add(25);
		System.out.println(arr.addAll(5,test2));
//		test.add(1);
//		test.add(151);
//		test.add(150);
//		test.add(15);
//		System.out.println(test.toArray());
//		System.out.println(test.iterator());
//		test2.add(17);
//		test2.add(18);
//		test.addAll(1, test2);
//		test.subList(0, 2);
//		//System.out.println(test.listIterator());
		

	}

}
