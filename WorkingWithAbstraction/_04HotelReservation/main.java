package _04HotelReservation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String[] input = scan.nextLine().split("\\s+");

    double pricePerDay = Double.parseDouble(input[0]);
    int numberOfDays = Integer.parseInt(input[1]);
    Season season = Season.valueOf(input[2]);
    Type type = Type.valueOf(input[3]);


    System.out.printf("%.2f",PriceCalculator.calculateFinalPrice(pricePerDay,numberOfDays, season,type));
    }
}
