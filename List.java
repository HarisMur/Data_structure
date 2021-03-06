
public interface List<E> {
    public void add(E e);
	public void add(int index, E e);
	public E get(int index);
	public int size();
	public E set(int index, E e);	
	public void clear();
	public boolean contains(E e);	
	public int indexOf(E e);
	public boolean remove(E e);
	public E remove(int index);
}
