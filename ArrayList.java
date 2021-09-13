
public class ArrayList extends AbstractList {
    
    public static int INITIAL_CAPACITY = 20;
    private Object[] data = (Object[]) (new Object[INITIAL_CAPACITY]);

    public ArrayList(){}
    
    public ArrayList(int newCapacity) {
        INITIAL_CAPACITY = newCapacity;
    }

    public ArrayList(Object[] objects)
    {
        for(int i=0; i<objects.length; i++)
            add(objects[i]);        
    }
    
    private void ensureCapacity()
    {
        if(size >= data.length)
        {
            Object[] newData = (Object[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data=newData;
        }
    }
        
    public void add(Object e) {
        ensureCapacity();        
        data[size++] = e;        
    }   
    
    public void add(int index, Object e) {
        ensureCapacity();
        
        for (int i=size-1; i>=index; i--)        
            data[i+1] = data[i];   
           
        data[index] = e;  
        size++;
        
    }
    
    public Object get(int index) {
        return data[index];
    }

    public void clear() {
        data = (Object[]) (new Object[INITIAL_CAPACITY]);
        size=0;     
    }

    public boolean contains(Object e) {
        for (int i=0; i<size; i++)
            if(e.equals(data[i])) 
                return true;
        return false;
    }

    public int indexOf(Object e) {
        for(int i=0; i<size; i++)
            if(e.equals(data[i]))
                    return i;
        return -1;
    }
    
    public int lastIndexOf(Object e) {
        for(int i=size-1; i>= 0; i++)
            if(e.equals(data[i]))
                return i;
        return -1;      
    }   

    public Object remove(int index) {
        Object e = data[index];
        
        for(int j=index; j<size-1; j++)
            data[j]=data[j+1];
        
        data[size-1] = null;
        size--;     
        return e;
    }

    public Object set(int index, Object e) {
        Object old = data[index];
        data[index] = e;        
        return old;
    }
    
    public String toString()
    {
        StringBuilder result = new StringBuilder("[");
        
        for(int i =0; i<size(); i++)
        {
            result.append(data[i]);
            if(i<size-1)
                result.append(", ");
        }
        return result.toString() + "]";
    }

    public void trimToSize() {
        if(size != data.length) {
            Object[] newData = (Object[]) (new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;     
        }
    }
    

}
