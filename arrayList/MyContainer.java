package arrayList;

public interface MyContainer<T> {
	
	public void add(int index, T element);
	public boolean add(T element);
	public T remove(int index);
	public int size();
	public String toString();
	public boolean isEmpty();

}
