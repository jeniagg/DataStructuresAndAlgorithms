package arrayList;

import java.util.Collection;

public class MyArrayList<T> implements MyContainer<T> {
	private T[] data;
	private int size = 0;
	private int capacity = 10;

	public MyArrayList() {
		data = (T[]) new Object[capacity];
	}
	
	public MyArrayList(int capacity) {
		this.capacity = capacity;
		data = (T[]) new Object[capacity];
	}

	public T getData(int index) {
		return data[index];
	}

	public void setData(int index, T element) {
		this.data[index] = element;
	}

	public void resize() {
		capacity *= 2;
		T[] temp = (T[])new Object[capacity];
		for (int i = 0; i < size(); i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	@Override
	public void add(int index, T element) {
		if (size == capacity) {
			resize();
		}
		if (index < size) {
			for (int i = size - 1; i >= index; i--) {
				data[i+1] = data[i];
			}
		}
			data[index] = (T) element;
		size++;
	}
	
	@Override
	public void remove(int index) {
		for (int i = index; i < size - 1; i++) {
			data[i] = data[i + 1];
		}
		size--;
	}
	
	public boolean remove(T element) {
		for (int i = 0; i < size; i++) {
			if (data[i] == element) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeAll(Collection<T> c) {
		boolean isRemoveAll = false;
		for (T element : c) {
			remove(element);
			isRemoveAll = true;
		}
		return isRemoveAll;
	}	
	
	public void clear() {
		for (int i = 0; i < size - 1; i++) {
			data[i] = data[i+1];
		}
		size = 0;
	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean add(T element) {
		if (size == capacity) {
			resize();
		}
		data[size] = element;
		size++;
		return true;
	}
	
	public Object clone() {
		MyArrayList<T> newData = new MyArrayList<T>(capacity);
		for (int i = 0; i < size; i++) {
			newData.add(data[i]);
		}
		return newData;
	}
	
	public boolean contains(T element) {
		for (int i = 0; i < size; i++ ) {
			if (data[i] == element) {
				return true;
			}
		} 
		return false;
	}
	
	public int indexOf(T element) {
		for (int i = 0; i < size; i++) {
			if (data[i] == element) {
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(T element) {
		for (int i = size - 1; i >= 0; i--) {
			if (data[i] == element) {
				return i;
			}
		}
		return -1;
	}

}
