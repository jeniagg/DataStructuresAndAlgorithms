package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> l = new DoublyLinkedList<Integer>();
		System.out.println(l.isEmpty());
		l.add(101);
		l.add(50);
		l.add(20);
		l.add(5);
		l.add(8);
		l.add(1);
		l.add(12);
		l.setHead(0);
		l.setTail(800);
		l.setNode(2, 2589);
		System.out.println(l.toString());
		System.out.println("head: " + l.getHead());
		System.out.println("tail: " + l.getTail());
		System.out.println("element with index 2: " + l.getValue(2));
		// l.remove(2, 7);
		// l.removeFirst();
		// System.out.println(l.removeValue(12));
		// System.out.println(l.isEmpty());
		// l.addFirst(7);
		// l.add(5, 80);
		// l.add(0, 78);
		// l.add(8,88);
		// l.clear();
		System.out.println(l.toString());
		System.out.println(l.contains(122));
		System.out.println(l.contains(7));
		System.out.println(l.size());

	}

}
