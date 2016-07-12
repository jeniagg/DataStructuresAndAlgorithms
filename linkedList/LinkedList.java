package linkedList;

import arrayList.MyContainer;

public class LinkedList<T> implements MyContainer<T>{

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

	@Override
	public boolean add(T element) {
		Node<T> node = new Node<T>(null, element);
		if (size == 0) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		this.size++;
		return true;
	}
	
	public void prepend(T value) {
		Node<T> node = new Node<T>(this.head, value);
		head = node;
		this.size++;
	}
	
	@Override
	public void add(int index, T element) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		} 
		if (size == 0) {
			Node<T> node = new Node<T>(null, element);
			head = node;
			tail = node;
			this.size++;
		} else if (index == 0) {
			this.prepend(element);
		} else if (index == size) {
			this.add(element);
		} else {
			Node<T> preNode = this.getNode(index - 1);
			Node<T> node = new Node<T>(preNode.getNext(), element);
			preNode.setNext(node);
			this.size++;
		}
	}
	
	@Override
	public T remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		T removedNode = this.getValue(index);
		
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
		return (T) removedNode;
	}
	
	public T getValue(int index) {
		return this.getNode(index).getValue();
	}
	
	@Override
	public int size() {
		return this.size;
	}
	
	@Override
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
	
	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

}