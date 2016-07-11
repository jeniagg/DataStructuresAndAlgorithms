package arrayList;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		MyArrayList<Integer> arr = new MyArrayList<Integer>();
		LinkedList<Integer> l = new LinkedList<Integer>();
		arr.add(0, 15);
		arr.add(1, 12);
		arr.add(12);
		
		l.add(12);
		l.add(12);
		System.out.println(arr.removeAll(l));
		
	//	arr.add(2, 1);
	//	arr.add(3, 11);
	//	arr.add(100);
	//	arr.setData(2, 22);
		
//		for (int i = 0; i < arr.size() ; i++) {
//			System.out.println("index is " + i + " element is " + arr.getData(i));
//		}
	//	arr.remove(1);
	//	System.out.println(arr.isEmpty());
	//	arr.clear();
	//	System.out.println(arr.isEmpty());
	//	System.out.println(arr.indexOf(12));
		for (int i = 0; i < arr.size() ; i++) {
			System.out.println("index is " + i + " element is " + arr.getData(i));
		}
	//	System.out.println(arr.contains(17));

	}

}
