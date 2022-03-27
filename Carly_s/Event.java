package Carly_s;

public class Event {
   public static final double PRICE_PER_GUEST = 35;
   public static final int LARGE_EVENT_CUTOFF = 50;
   private String eventNumber;
   private int numOfGuests;
   private double eventPrice;

   public void setEventNumber(String str) {
      eventNumber = str;
   }

   public void setGuests(int num) {
      numOfGuests = num;
      eventPrice = num * PRICE_PER_GUEST;
   }

   public String getEventNumber() {
      return eventNumber;
   }

   public int getNumOfGuests() {
      return numOfGuests;
   }

   public double getEventPrice() {
      return eventPrice;
   }
}
