package Sammy_s;
import java.util.*;

/**
 * Sammy’s Seashore Supplies rents beach equipment such as kayaks, canoes, 
 * beach chairs, and umbrellas to tourists. In Chapter 2, you wrote an application 
 * that prompts the user for the number of minutes a piece of sports equipment was 
 * rented, displays the company motto with a border, and displays the price 
 * for the rental. Now modify the program so that the main() method contains 
 * only three executable statements that each call a method as follows:
   - The first executable statement calls a method that prompts the user for 
   the rental time in minutes and returns the value to the main() method.
   - The second executable statement calls a method that displays the company 
   motto with the border.
   - The last executable statement passes the number of minutes to a method that computes the hours, extra minutes, and price for the rental, and then displays all the details.
   
   Save the file as SammysRentalPriceWithMethods.java.
 */
public class SammysRentalPriceWithMethods {
   public static void main(String[] args) {
      int rentalMinutes;

      rentalMinutes = receiveRentalMinutes();
      displayMotto();
      displayRentalInfo(rentalMinutes);
   }

   public static int receiveRentalMinutes() {
      int minutes;
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter the number of minutes you'd like to rent >>> ");
      minutes = input.nextInt();
      input.close();
      return minutes;
   }

   public static void displayMotto() {
      System.out.println();
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("S Sammy's makes it fun in the sun. S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println();
   }
     
   public static void displayRentalInfo(int minutes) {
      int hours, minutesLeftover;
      final double PRICE_PER_HOUR = 40.0;
      final double PRICE_PER_MINUTE = 1.0;
      final int MINUTES_IN_HOUR = 60;
      final double totalPrice;

      hours = minutes / MINUTES_IN_HOUR;
      minutesLeftover = minutes % MINUTES_IN_HOUR;
      totalPrice = hours * PRICE_PER_HOUR + minutesLeftover * PRICE_PER_MINUTE;
      
      System.out.printf("The total price of your rent is: $%9.2f\n", totalPrice);
      System.out.println("And it's gonna be " + hours + " hour(s) and " + minutesLeftover + " minutes");  
     }
}