package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T> {
	
	ArrayList<T> arr = new ArrayList<T>();
	int size = 0;
	
	public MyStack() {
		
	}
	
	public T push(T element) {
		arr.add(element);
		size++;
		return element;
	}
	
	public T pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T element = arr.get(size-1);
		arr.remove(size -1);
		size--;
		return element;
	}
	
	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return arr.get(size - 1);
	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return size;
	}
	
	public int search(T element) {
		int distance = 1;
		for (int i = size - 1; i >= 0; i++) {
			if (arr.get(i).equals(element)) {
				distance = size - i;
				return distance;
			}
		}
		return -1;
	}
	
	public String toString() {
		if (isEmpty()) {
			return null;
		}
		StringBuilder  str = new StringBuilder("[");
		for (int i = 0; i< size - 1; i++) {
			str.append(arr.get(i));
			str.append(", ");
		}
		str.append(arr.get(size - 1));
		str.append("]");
		return str.toString();
	}
	
}
