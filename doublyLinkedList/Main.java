package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> l = new DoublyLinkedList<Integer>();
		l.add(5);
		l.add(8);
		l.add(12);
		System.out.println(l.size());
		System.out.println(l.toString());

	}

}
