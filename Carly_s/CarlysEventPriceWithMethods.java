package Carly_s;
// File CarlysEventPrice.java
// Written by Igor Mykhalchuk
// Written on January 31 2022

// This program outputs to the screen the Carly's motto surrounded by a border of asterisks.

import java.util.*;

public class CarlysEventPriceWithMethods {
  public static void main(String[] args) {
    int numberOfGuests;

    numberOfGuests = guestNum();
    motto();
    eventPrice(numberOfGuests);
  }
  
  public static int guestNum() {
    int guestsNum;
    Scanner input = new Scanner(System.in);
    System.out.print("How many guests are attending the event? >>> ");
    guestsNum = input.nextInt();
    input.close();
    return guestsNum;
  }
    
  public static void motto() {
    System.out.println();
    System.out.println("*************************************************");
    System.out.println("* Carly's makes the food that makes is a party. *");
    System.out.println("*************************************************");
    System.out.println();
  }

  public static void eventPrice(int num) {
    double totalPrice;
    final double PRICE_PER_GUEST = 35;
    final int BIG_EVENT_LIMIT = 50;
    boolean isEventBig = false;

    totalPrice = num * PRICE_PER_GUEST;
    if (num >= BIG_EVENT_LIMIT) {
      isEventBig = true;
    }

    System.out.println("The total price is $" + totalPrice + " and this even is big: " + isEventBig);
  }
}