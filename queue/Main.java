package queue;

public class Main {

	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<Integer>();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.toString());
		System.out.println(q.element());

	}

}
