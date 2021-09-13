import java.util.*;

public class HallApp
{
   public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Scanner inline = new Scanner(System.in); //handle sequence of string
        //create and declare array of Book
        
        HallBooking[] HallArray = new HallBooking [3];
        
        for (int i=0; i < HallArray.length; i++) {
        
        System.out.print("Enter the following information.....\n");
        System.out.print("\tID  :   ");
        String id = in.nextLine();
        System.out.print("\tName  :   ");
        String name = in.nextLine();
        System.out.print("\tBooking Start Date  :   ");
        String date = in.nextLine();
        System.out.print("\tNo. of Booking Day  :   ");
        int booking = in.nextInt();
        
        HallArray[i] = new HallBooking (id, name, date, booking);
        
        }
        
   }
   
}
