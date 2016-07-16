package queue;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.toString());
		System.out.println(q.element());

		Result result = JUnitCore.runClasses(MyQueueTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());

	}

}
