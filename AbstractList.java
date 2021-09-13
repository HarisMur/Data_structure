
public abstract class AbstractList<E> implements List<E> {
	
    protected int size = 0;
    protected AbstractList(){} /*default constructor*/
    
    protected AbstractList(E[] objects){ /*Normal constructor*/
        for (int i=0; i<objects.length; i++)
            add(objects[i]); /*calling add()*/
    }
    
    public void add(E e) { add(size, e); }

    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){ return size; }

    public boolean remove(E e) {
        if(indexOf(e) >= 0){
            remove(indexOf(e));
            return true;
        }
        else {
            return false;
        }
    }	

}
