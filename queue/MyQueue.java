package queue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueue<T> {
	ArrayList<T> arr = new ArrayList<T>();
	int size = 0;
	
	public MyQueue() {
		
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}
	
	public void push(T element) {
		arr.add(element);
		size++;
	}
	
	public T remove() {
		T element = arr.get(0);
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		arr.remove(0);
		size--;
		return element;
	}
	
	public T peek() {
		if (isEmpty()) {
			return null;
		}
		return arr.get(0);
	}
	
	public T element() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return arr.get(0);
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for (int i = 0; i < size - 1; i++) {
			str.append(arr.get(i));
			str.append(", ");
		}
		str.append(arr.get(size - 1));
		str.append("]");
		return str.toString();
	}
	
}
