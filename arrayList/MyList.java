package arrayList;

public interface MyList<T> {
	public T setData(int index, T element);
	public T getData(int index);
	public void resize();
	public boolean removeElement(T element);
	public void clear();

}
