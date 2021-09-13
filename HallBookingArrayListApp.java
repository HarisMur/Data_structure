/**

=====================================
CSC248 @ March 2018 - July 2018
Topic 1 – Lab Tutorial 1
=====================================
 
Question 2
-----------

   ArrayList <HallBooking> hbArList = new ArrayList <HallBooking>(); 
 
a) Display the hbArList size using int size(). 
b) Using boolean add(E e), insert hall booking instances into hbArList until the user wants to stop.
c) Display the hbArList size using int size(). 
d) Using E get(int index) , display the elements in the hbArList. 
e) Using E remove(int index),  remove the last element of the hbArList. 
f) Display the hbArList size using int size(). 
g) Using E get(int index), display the elements in the hbArList.
   
**/
 
import java.util.Scanner;
import java.util.ArrayList;

public class HallBookingArrayListApp
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        ArrayList <HallBooking> hbArList = new ArrayList <HallBooking>();  //create the ArrayList object
        
        //a) Display the hbArList size using int size(). 
        System.out.println("\nThe hbArList is: "+ hbArList.size());
        
        //b) Using boolean add(E e), insert hall booking instances into hbArList until the user wants to stop.
        int more = 1;
        while(more != 0)
        {
            System.out.print("Enter ID: ");
            String i = in.nextLine();
            in.nextLine();
            System.out.print("Enter name: ");
            String n = in.next();
            System.out.print("Enter date (DD/MM/YYYY): ");
            String dt = in.nextLine();
            in.nextLine();
            System.out.print("Enter number of day: ");
            int dy = in.nextInt(); 
                  
            HallBooking hbObj = new HallBooking(i,n,dt,dy);  //STEP 1 - create and insert into HallBooking object
            hbArList.add(hbObj); //STEP 2 - insert into the ArrayList object
            
            //ask any more?
            System.out.print("Any more 1-YES 0-NO: ");
            more = in.nextInt();             
        } // end of while loop
        
        //c) Display the hbArList size using int size(). 
        System.out.println("\nThe hbArList is: "+ hbArList.size());           
    
    //d) Using E get(int index) , display the elements in the hbArList. 
    for(int i=0; i< hbArList.size(); i++)
    {
        HallBooking hbTemp  = hbArList.get(i); // STEP 1 - take out HallBooking object from  ArrayList object
        System.out.println("The hall booking info is: " + hbTemp.toString()); // STEP 2 - take out/use toString() from  HallBooking object
    }
    
    //e) Using E remove(int index),  remove the last element of the hbArList. 
    int size = hbArList.size() ;
    HallBooking hbRemove  = hbArList.remove(size-1); //size - 1 is the last location for the object
    
   //f) Display the hbArList size using int size(). 
   System.out.println("\nThe hbArList is: "+ hbArList.size());
   
    //g) Using E get(int index) , display the elements in the hbArList. 
    for(int i=0; i< hbArList.size(); i++)
    {
        HallBooking hbTemp  = hbArList.get(i);
        System.out.println("The hall booking info is: " + hbTemp.toString());
    }

   } //end of main()
} //end of HallBookingArrayListApp













