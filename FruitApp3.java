

public class FruitApp3
{
    public class FruitApp3 
    {         
        public static void main(String args[])
        {         
            Fruit f1 = new Fruit("apple",1.5);         
            Fruit f2 = new Fruit("orange",2.0);                  
            ArrayList fList = new ArrayList();                  
            fList.add(f1);         
            fList.add(f2);                 
            f1 = fList.get(1);          
            System.out.println(f1);            
        } 
    }
}
    
    
