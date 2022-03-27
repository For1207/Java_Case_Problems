package Carly_s;
import java.util.*;

/*
   Use the CarlysEventPriceWithMethods class you created in Step 1a 
   as a starting point for a program that demonstrates the Event class 
   you created in Step 1b, but make the following changes:
   You already have a method that gets a number of guests from a user; 
   now add a method that gets an event number. The main() method should 
   declare an Event object, call the two data entry methods, 
   and use their returned values to set the fields in the Event object.
   Call the method from the CarlysEventPriceWithMethods class that displays 
   the company motto with the border. The method is accessible because 
   it is public, but you must fully qualify the name because it is in another class.
   Revise the method that displays the event details so that it accepts the newly 
   created Event object. The method should display the event number, 
   and it should still display the number of guests, the price per guest, 
   the total price, and whether the event is a large event.
   Save the program as EventDemo.java.
 */

public class EventDemo {
   public static void main(String[] args) {
      // int numberOfGuests;
      Event anEvent = new Event();

      receiveEventAndGuestNumbers(anEvent);
      // numberOfGuests = guestNum();
      CarlysEventPriceWithMethods.motto();
      showEventInfo(anEvent);
   }
   
   // public static int guestNum() {
   //   int guestsNum;
   //   Scanner input = new Scanner(System.in);
   //   System.out.print("How many guests are attending the event? >>> ");
   //   guestsNum = input.nextInt();
   //   input.close();
   //   return guestsNum;
   // }
     
   public static void motto() {
     System.out.println();
     System.out.println("*************************************************");
     System.out.println("* Carly's makes the food that makes is a party. *");
     System.out.println("*************************************************");
     System.out.println();
   }
 
   public static void showEventInfo(Event obj) {
      double totalPrice;
      final double PRICE_PER_GUEST = 35;
      final int BIG_EVENT_LIMIT = 50;
      boolean isEventBig = false;
      int guestNum = obj.getNumOfGuests();

      totalPrice = guestNum * PRICE_PER_GUEST;
      if (guestNum >= BIG_EVENT_LIMIT) {
         isEventBig = true;
      }
      System.out.println("Event number >> " + obj.getEventNumber());
      System.out.println("Number of guests >> " + guestNum);
      System.out.println("The total price is $" + totalPrice + " and this event is big: " + isEventBig);
      System.out.println();
   }
   
   public static void receiveEventAndGuestNumbers(Event obj) {
      Scanner input = new Scanner(System.in);

      System.out.print("Please enter the event number >> ");
      obj.setEventNumber(input.nextLine());

      System.out.print("Please enter the number of guests >> ");
      obj.setGuests(input.nextInt());

      input.close();
   }
 }