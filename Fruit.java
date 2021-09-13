public class Fruit
{
   private String name;
    private double weight;
    
    public Fruit ()
    {
        name = "";
        weight = 0;
    }
    
    public Fruit (String n,double w)
    {
        name = n;
        weight = w;
    }
    
    public Fruit (Fruit x)
    {
            name = x.name;
            weight = x.weight;
    }
    
    public void setName (String n)
    {
        name = n;
    }
    public void setWeight (double w)
    {
        weight = w;
    }
    public String getName ()
    {
        return name;
    }
    public double getWeight()
    {
        return weight;
    }
    public String toString()
    {
        return "Name : "+name+"\nWeight : "+weight;
    }
}
