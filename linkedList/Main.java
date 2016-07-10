package linkedList;

public class Main {
	public static void main(String[] argv) {
		
	LinkedList<Integer> l = new LinkedList<Integer>();
	l.add(0, 7);
	l.append(25);
	l.add(1, 2);
	l.add(0, 7);
	l.add(0, 36);
	l.delete(2);
	l.append(78);
	l.prepend(5);
	System.out.println(l.size());
	System.out.println(l.getValue(1));
	System.out.println(l.toString());
	}
}
