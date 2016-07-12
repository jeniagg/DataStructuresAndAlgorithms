package linkedList;

public class Main {
	public static void main(String[] argv) {
		
	LinkedList<Integer> l = new LinkedList<Integer>();
	System.out.println(l.isEmpty());
	l.add(0, 4);
	l.add(6);
	l.add(1, 5);
	l.add(0, 3);
//	l.add(0, 2);
//	System.out.println(l.toString());
	System.out.println(l.remove(1));
	System.out.println(l.toString());
//	l.add(2);
//	l.add(1);
//	l.add(1, 5);
//	l.add(2, 2);
//	l.add(7);
	l.prepend(1);
	System.out.println(l.toString());
	System.out.println(l.isEmpty());
	System.out.println(l.size());
	System.out.println(l.getValue(1));
	System.out.println(l.toString());
	}
}
