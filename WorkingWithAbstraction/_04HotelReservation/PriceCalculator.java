package _04HotelReservation;

public class PriceCalculator {

    public static double calculateFinalPrice(double pricePerDay, int numberOfDays,Season season,Type type){
        double price = pricePerDay*numberOfDays;
        price = price * season.getMultiplier();
        price = price*(100-type.getPercent())/100;
        return price;
    }
}
