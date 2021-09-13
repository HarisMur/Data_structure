import java.util.*;
import java.util.ArrayList; 

public class HallBookApp2
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       ArrayList <HallBooking> hbArList = new ArrayList <HallBooking>();
       String bookid, eventName, numberStartDate;
       int numberBookingDay;
       
       int cont = 1;
       
       
       while (cont != 0) {
           
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
                  
            HallBooking hbList = new HallBooking (i,n,dt,dy);
            hbArList.add(hbList);
            
            System.out.print("Any more 1-YES 0-NO: ");
            cont = in.nextInt();             
       } 
       
       for (int i = 0; i < hbArList.size(); i++) {
           
       if (hbArList.get(i).getEvent().equalsIgnoreCase("Majlis Makan Malam Pelajar 2018")){
   
       System.out.println ("The booking informmation of people going to MMMP 2018 event are : " + hbArList.get(i).toString()); 
          
       }
           
       String date = hbArList.get(i).getStart();
      
        if (date.substring(6,10).equals("2000")) {
               
           hbArList.get(i).setStart("00/00/0000");
		
        }
        
        int highest =0;
    
   
        if(hbArList.get(i).payment() > hbArList.get(highest).payment()) {
            
            highest = i;
            
        }
    
       System.out.println("\nMaximum booking payment: \n" +   hbArList.get(highest).toString());
       
            HallBooking nexthb = hbArList.get(i);
            String nextID = nexthb.getID();
            
            for (int j=i-1; j>=0; j--) {
                
                HallBooking currhall = hbArList.get(j);
                String currID = currhall.getID();
                
                if(currID.compareTo(nextID) > 0) {
                
                    hbArList.set( j+1 , currhall );
                    hbArList.set( j , nexthb );
                    
                }
            } 
        }
        
       System.out.println(hbArList.toString());
        
    }   
}    
           
       
       
    
   



