package doublyLinkedList;

import arrayList.MyContainer;

public class DoublyLinkedList<T> implements MyContainer<T> {

	int size;
	private Node<T> head;
	private Node<T> tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void setHead(T newHead) {
		if (isEmpty()) {
			throw new NullPointerException();
		}
		Node<T> node = new Node<T>(newHead);
		node.setNext(head.getNext());
		head.getNext().setPrevious(node);
		this.head = node;
	}

	public T getHead() {
		if (isEmpty()) {
			return null;
		}
		return getValue(0);
	}

	public void setTail(T newTail) {
		if (isEmpty()) {
			throw new NullPointerException();
		}
		Node<T> node = new Node<T>(newTail);
		tail.getPrevious().setNext(node);
		node.setPrevious(tail.getPrevious());
		this.tail = node;
	}

	public T getTail() {
		if (isEmpty()) {
			return null;
		}
		return getValue(size - 1);
	}

	public void setNode(int index, T newNode) {
		if (isEmpty()) {
			throw new NullPointerException();
		} else if (index == size - 1) {
			setTail(newNode);
		} else if (index == 0) {
			setHead(newNode);
		} else {
			Node<T> node = new Node<T>(newNode);
			Node<T> oldNode = getNode(index);
			node.setNext(oldNode.getNext());
			node.setPrevious(oldNode.getPrevious());
			oldNode.getNext().setPrevious(node);
			oldNode.getPrevious().setNext(node);
		}
	}

	public Node<T> getNode(int index) {
		Node<T> node = head;
		if (isEmpty()) {
			return null;
		} else {
			for (int i = 0; i < index; i++) {
				node = node.getNext();
			}
		}
		return node;
	}

	public T getValue(int index) {
		return getNode(index).getElement();
	}

	public boolean add(T element) {
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
		return true;
	}

	public void addFirst(T element) {
		Node<T> node = new Node<T>(element);
		if (isEmpty()) {
			head = node;
			tail = head;
			head.setNext(tail);
			tail.setPrevious(head);
		} else {
			head.setPrevious(node);
			node.setNext(head);
			head = node;
		}
		size++;
	}

	@Override
	public void add(int index, T element) {
		if (index > size) {
			throw new IndexOutOfBoundsException();
		} else if (index == 0) {
			addFirst(element);
		} else if (index == size) {
			add(element);
		} else {
			Node<T> node = new Node<T>(element);
			Node<T> indexNode = getNode(index);
			indexNode.getPrevious().setNext(node);
			node.setPrevious(indexNode.getPrevious());
			node.setNext(indexNode);
			indexNode.setPrevious(node);
			size++;
		}

	}

	public T removeLast() {
		T removedElement = tail.getElement();
		if (isEmpty()) {
			throw new NullPointerException();
		} else if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			tail.getPrevious().setNext(null);
			this.tail = tail.getPrevious();
			this.size--;
		}
		return removedElement;
	}

	public T removeFirst() {
		T removedElement = head.getElement();
		if (isEmpty()) {
			return null;
		} else if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head.getNext().setPrevious(null);
			this.head = head.getNext();
			this.size--;
		}
		return removedElement;
	}

	@Override
	public T remove(int index) {
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException();
		}
		T removedElement = getValue(index);
		if (index == 0) {
			removeFirst();
		} else if (index == size - 1) {
			removeLast();
		} else {
			Node<T> indexNode = getNode(index);
			indexNode.getPrevious().setNext(indexNode.getNext());
			indexNode.getNext().setPrevious(indexNode.getPrevious());
			this.size--;
		}
		return removedElement;
	}

	public boolean removeValue(T element) {
		for (int i = 0; i < size; i++) {
			if (element.equals(getValue(i))) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	public void remove(int fromIndex, int toIndex) {
		if (fromIndex < 0 || toIndex > size || toIndex < fromIndex) {
			throw new IndexOutOfBoundsException();
		} else {
			int counter = toIndex - fromIndex;
			while (counter > 0) {
				remove(fromIndex);
				counter--;
			}
		}

	}

	public void clear() {
		while (!isEmpty()) {
			removeLast();
		}
	}

	public boolean contains(T element) {
		for (int i = 0; i < size; i++) {
			if (getValue(i).equals(element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		if (size == 0) {
			return null;
		}
		StringBuilder str = new StringBuilder("[");
		for (int i = 0; i < size - 1; i++) {
			str.append(getValue(i));
			str.append(", ");
		}
		str.append(getValue(size - 1)).append("]");
		return str.toString();
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

}
