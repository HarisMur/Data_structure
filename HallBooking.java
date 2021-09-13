public class HallBooking
{
  private String bookID;
  private String event;
  private String bookStart;
  private int bookDay;
  
  public HallBooking (String id,String event,String start,int days)
  {
      bookID = id;
      this.event = event;
      bookStart = start;
      bookDay = days;
  }
  
  //accessors and mutators
  public void setID(String id)
  {
      bookID = id;
  }
  public void setEvent(String event)
  {
      this.event = event;
  }
  public void setStart(String start)
  {
      bookStart = start;
  }
  public void setDays(int days)
  {
      bookDay = days;
  }
  public String getID()
  {
      return bookID;
  }
  public String getEvent()
  {
      return event;
  }
  public String getStart()
  {
      return bookStart;
  }
  public int getDays()
  {
      return bookDay;
  }
  
  public String toString ()
  {
     String out = "";
     out = "Booking ID : "+bookID;
     out = out + "\nEvent Name : "+event;
     out = out + "\nBooking Start Date : "+bookStart;
     out = out + "\nNumber Of Days Booked : "+bookDay;
     return out;
  }
  public double payment ()
  {
      double pay = 0;
      pay = 250 * bookDay;
      return pay;
  }
}
