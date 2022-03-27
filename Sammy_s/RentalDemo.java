package Sammy_s;

public class RentalDemo {
   public static void main(String[] args) {
      Rental aRental = new Rental();
      aRental.setContractNumber();
      aRental.setHoursAndMinutes();
      SammysRentalPriceWithMethods.displayMotto();
      System.out.println("Contract number: " + aRental.getContractNumber());
      System.out.println("You are going to rent for " + aRental.getHoursOfRent() + " hours and "
            + aRental.getMinutesOverHour() + " minutes");
      System.out.println("The total price is: $" + aRental.getTotalPrice());
   }
}