package arrayList;

import java.util.Collection;

public class MyArrayList<T> implements MyContainer<T>, MyList<T> {
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

	@Override
	public T getData(int index) {
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException();
		}
		return data[index];
	}
	
	@Override
	public T setData(int index, T element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		T previous = data[index];
		this.data[index] = element;
		return previous;
	}

	@Override
	public void resize() {
		capacity *= 2;
		T[] temp = (T[])new Object[capacity];
		for (int i = 0; i < size(); i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	@Override
	public T remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
			}
		for (int i = index; i < size; i++) {
			data[i] = data[i + 1];
		}
		size--;
		return data[index];
	}
	
	@Override
	public boolean removeElement(T element) {
		boolean isChanged = false;
		for (int i = 0; i < size; i++) {
			if (data[i] == element) {
				remove(i);
				isChanged = true;
			}
		}
		return isChanged;
	}
	
	public boolean removeAll(Collection<T> c) {
		boolean isRemoveAll = false;
		if (c == null) {
			throw new NullPointerException();
		}
		for (T element : c) {
			if (removeElement(element)) {
					removeElement(element);
				}
			isRemoveAll = true;
		}
		return isRemoveAll;
	}
	
 	protected void removeRange(int fromIndex, int toIndex) {
 		if (fromIndex < 0 || fromIndex >= size || toIndex < fromIndex || toIndex > size) {
 			throw new IndexOutOfBoundsException();
 		}
 		int count = toIndex - fromIndex; 
 		while (count > 0) {
 			remove(fromIndex);
 			count--;
 		}
 	}
	
 	@Override
	public void clear() {
		for (int i = 0; i < size - 1; i++) {
			data[i] = data[i+1];
		}
		size = 0;
	}
	
 	@Override
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
	
	@Override
	public void add(int index, T element) {
		if (size == capacity) {
			resize();
		}
		
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index < size) {
			for (int i = size - 1; i >= index; i--) {
				data[i+1] = data[i];
			}
		}
			data[index] = (T) element;
		size++;
	}
	
	public boolean addAll(Collection<T> c) {
		boolean isChanged = false; 
		
		if (c == null) {
			throw new NullPointerException();
		}
		
		for (T element : c) {
			add(element);
			if (add(element)) {
				isChanged = true;
			}
		}
		return isChanged;
	}
	
	public boolean addAll(int index, Collection<T> c) {
		boolean isChanged = false;
		
		if (c == null) {
			throw new NullPointerException();
		} else if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		for (T element : c) {
			add(index,element);
			index++;
			isChanged = true;
		}	
		return isChanged;
	}
	
	public T clone() {
		MyArrayList<T> newData = new MyArrayList<T>(capacity);
		for (int i = 0; i < size; i++) {
			newData.add(getData(i));
		}
		return (T) newData;
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
	
 	public boolean retainAll(Collection<T> c) {
 		boolean isChanged = false;
 		if (c == null) {
 			throw new NullPointerException();
 		}
 		for (int i = 0; i < size; i++) {
 			if (!c.contains(data[i])) {
 				removeElement(data[i]);
 				i--;
 				isChanged = true;
 			}
 		}
 		return isChanged;
 	}
 	
 	public MyArrayList<T> subList(int fromIndex, int toIndex) {
 		MyArrayList<T> newList = new MyArrayList<T>();
 			if (fromIndex < 0 || toIndex > size) {
 				throw new IndexOutOfBoundsException();
 			} else if (fromIndex > toIndex) {
 				throw new IllegalArgumentException();
 			} 
 			for (int i = fromIndex; i < toIndex; i++) {
 				newList.add(getData(i));
 			}
 	
		return newList;
 	}
 	
 	public T[] toArray() {
 		T[] arr = (T[]) new Object[capacity];
 		for (int i = 0; i < size; i++ ) {
 			arr[i] = getData(i);
 		}
 		return arr;	
 	}
 	
 	@Override
 	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for (int i = 0; i < size - 1; i++) {
			str.append(getData(i));
			str.append(", ");
		}
		str.append(getData(size - 1)).append("]");
		return str.toString();
	}
	
}