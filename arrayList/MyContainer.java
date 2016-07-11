package arrayList;

public interface MyContainer<T> {
	
	public void add(int index, T element);
	public boolean add(T element);
	public void remove(int index);
	public int size();

}
