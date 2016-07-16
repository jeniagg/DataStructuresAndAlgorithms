package queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest<T> {

	private MyQueue<Integer> q = new MyQueue<Integer>();

	@Test
	public void testSize() {
		q.add(2);
		q.add(3);
		assertEquals(2, q.size());
	}

	@Test
	public void testSizeZero() {
		assertEquals(0, q.size());
	}

	@Test
	public void testIsEmptyYes() {
		assertTrue(q.isEmpty());
	}

	@Test
	public void testIsEmptyNo() {
		q.add(5);
		assertTrue(!q.isEmpty());
	}

	@Test
	public void testAddandToString() {
		q.add(5);
		q.add(-17);
		q.add(2);
		q.add(16);
		assertEquals("[5, -17, 2, 16]", q.toString());
	}

	@Test
	public void toStringEmpty() {
		assertEquals(null, q.toString());
	}

	@Test
	public void testRemove() {
		q.add(5);
		q.add(7);
		q.add(0);
		q.add(3);
		q.remove();
		assertEquals("[7, 0, 3]", q.toString());
	}

	@Test(expected = Exception.class)
	public void testRemoveNull() {
		q.remove();
	}

	@Test
	public void testPoll() {
		q.add(5);
		q.add(-7);
		q.add(0);
		q.remove();
		assertEquals("[-7, 0]", q.toString());
	}

	@Test
	public void testPollNull() {
		assertEquals(null, q.poll());
	}

	@Test
	public void testPeek() {
		q.add(5);
		q.add(0);
		q.add(-7);
		assertEquals("5", q.peek().toString());
	}

	@Test
	public void testPeekNull() {
		assertNull(q.peek());
	}

	@Test
	public void testElement() {
		q.add(2);
		q.add(0);
		assertEquals("2", q.element().toString());
	}

	@Test(expected = Exception.class)
	public void testElementNull() {
		q.element();
	}

	@Test
	public void testToString() {
		q.add(0);
		q.add(1000);
		assertEquals("[0, 1000]", q.toString());
	}

	@Test
	public void testToStringEmpty() {
		assertNull(q.toString());
	}
}
