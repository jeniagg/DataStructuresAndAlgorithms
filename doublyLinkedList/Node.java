package doublyLinkedList;

public class Node<T> {
	private Node<T> previous;
	private Node<T> next;
	private T element;

	public Node(T element) {
		this.element = element;
		this.next = null;
		this.previous = null;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public T getElement() {
		return this.element;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getNext() {
		return this.next;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}

	public Node<T> getPrevious() {
		return this.previous;
	}

}