package linkedList;

public class Node<T> {
	private Node<T> next;
	private T value;
	
	public Node(Node<T> next, T value) {
		this.next = next;
		this.value = value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getNext() {
		return next;
	}

}
