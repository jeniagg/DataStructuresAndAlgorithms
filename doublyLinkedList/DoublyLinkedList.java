package doublyLinkedList;

public class DoublyLinkedList<T> {

	int size;
	private Node<T> head;
	private Node<T> tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getHead() {
		return this.head;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public Node<T> getTail() {
		return this.tail;
	}

	public T getNode(int index) {
		Node<T> node = head;
		if (isEmpty()) {
			return null;
		} else {
			for (int i = 0; i < index; i++) {
				node = node.getNext();
			}
		}
		return node.getElement();
	}

	public void add(T element) {
		Node<T> node = new Node<T>(element);
		if (isEmpty()) {
			head = node;
			tail = head;
			tail.setPrevious(head);
			head.setNext(tail);
		} else {
			node.setPrevious(tail);
			tail.setNext(node);
			tail = node;
		}
		size++;
	}

	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for (int i = 0; i < size - 1; i++) {
			str.append(getNode(i));
			str.append(", ");
		}
		str.append(getNode(size - 1)).append("]");
		return str.toString();
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

}
