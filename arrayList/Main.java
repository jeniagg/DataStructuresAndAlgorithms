package arrayList;

public class Main {

	public static void main(String[] args) {
		MyArrayList<Integer> arr = new MyArrayList<Integer>();
		arr.add(0, 0);
		arr.add(1, 7);
		arr.add(12);
		arr.add(3);
		arr.add(5);
		arr.add(14);
		for (int i = 0; i < arr.size() ; i++) {
			System.out.println("index is " + i + " element is " + arr.getData(i));
		}

	}

}
