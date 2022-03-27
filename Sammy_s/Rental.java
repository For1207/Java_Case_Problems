package Sammy_s;

import java.util.*;

public class Rental {
   Scanner input = new Scanner(System.in);
   public final static int MINUTES_IN_HOUR = 60;
   public final static double PRICE_PER_HOUR = 40.0;
   private String contractNumber;
   private int hoursOfRent;
   private int minutesOverHour;
   private double totalPrice;
   
   public void setContractNumber() {
      System.out.print("Enter the contract number >> ");
      contractNumber = input.nextLine();
   }

   public void setHoursAndMinutes() {
      int rentalMinutes;
      System.out.print("Enter the rental time in minutes >> ");
      rentalMinutes = input.nextInt();
      input.nextLine();
      hoursOfRent = rentalMinutes / MINUTES_IN_HOUR;
      minutesOverHour = rentalMinutes % MINUTES_IN_HOUR;
      totalPrice = hoursOfRent * PRICE_PER_HOUR + minutesOverHour;
      input.close();
   }

   public String getContractNumber() {
      return contractNumber;
   }

   public int getHoursOfRent() {
      return hoursOfRent;
   }

   public int getMinutesOverHour() {
      return minutesOverHour;
   }

   public double getTotalPrice() {
      return totalPrice;
   }
}
