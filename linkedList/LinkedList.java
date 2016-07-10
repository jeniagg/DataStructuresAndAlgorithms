package linkedList;

public class LinkedList<T> {

	private Node<T> head = null;
	private	Node<T> tail = null;
	private int size = 0;
	
	private Node<T> getNode(int index) {
		Node<T> node = head;
		for(int i = 0; i < index; i++) {
			node = node.getNext();
		}
		return node;
	}
	
	public void append(T value) {
		Node<T> node = new Node<T>(null, value);
		tail.setNext(node);
		tail = node;
		this.size++;
	}
	
	public void prepend(T value) {
		Node<T> node = new Node<T>(this.head, value);
		head = node;
		this.size++;
	}
	
	public void add(int index, T value) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		} 
		if (size == 0) {
			Node<T> node = new Node<T>(null, value);
			head = node;
			tail = node;
			this.size++;
		} else if (index == 0) {
			this.prepend(value);
		} else if (index == size) {
			this.append(value);
		} else {
			Node<T> preNode = this.getNode(index - 1);
			Node<T> node = new Node<T>(preNode.getNext(), value);
			preNode.setNext(node);
			this.size++;
		}
	}

	public void delete(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			this.head = head.getNext();
		} else {
			Node<T> preNode = this.getNode(index - 1);
			preNode.setNext(preNode.getNext().getNext());
			if ( index == size - 1) {
				tail = preNode;
			}
		}
		this.size--;
	}
	
	public T getValue(int index) {
		return this.getNode(index).getValue();
	}
	
	public int size() {
		return this.size;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		Node<T> nodeIterator = head;
		for (int i = 0; i < this.size - 1; i++, nodeIterator = nodeIterator.getNext()) {
			str.append(nodeIterator.getValue());
			str.append(", ");
		}
		str.append(nodeIterator.getValue()).append("]");
		return str.toString();
	}
}
