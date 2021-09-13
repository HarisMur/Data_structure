import java.util.ArrayList; 

public class FruitApp1 {          
    public static void main(String args[])     
    {         
        Fruit f1 = new Fruit("apple",1.5);         
        Fruit f2 = new Fruit("orange",2.0);                  
        
        ArrayList <Fruit> fList = new ArrayList <Fruit>();                  
        
        fList.add(f1);         
        fList.add(f2);                  
        
        f1 =  fList.get(1);//access the DS of ArrayList         
        System.out.println(f1.toString()); //access the data (Fruit)
    } 
} 