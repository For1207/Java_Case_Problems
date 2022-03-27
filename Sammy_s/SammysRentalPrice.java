package Sammy_s;

// File name SammysRentalPrice.java
// Written my Igor Mykhalchuk
// Written on January 31 2022

// This program output to the screen the Sammy's motto surrounded by a border composed of Ss.

import java.util.*;

public class SammysRentalPrice {
  public static void main(String[] args) {
    int rentalMinutes;
    final double PRICE_PER_HOUR = 40.0;
    final double PRICE_PER_MINUTE = 1.0;
    final int MINUTES_IN_HOUR = 60;
    int hours;
    int minutesLeftover;
    final double totalPrice;
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the number of minutes you'd like to rent >>> ");
    rentalMinutes = input.nextInt();

    hours = rentalMinutes / MINUTES_IN_HOUR;
    minutesLeftover = rentalMinutes % MINUTES_IN_HOUR;
    totalPrice = hours * PRICE_PER_HOUR  + minutesLeftover * PRICE_PER_MINUTE;

    System.out.println();
    System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    System.out.println("S Sammy's makes it fun in the sun. S");
    System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    System.out.println();

    System.out.printf("You're gonna rent for $%9.2f\n", totalPrice);
    System.out.println("And it's gonna be " + hours + " hour(s) and " + minutesLeftover + " damn minutes");

    input.close();
  }
}