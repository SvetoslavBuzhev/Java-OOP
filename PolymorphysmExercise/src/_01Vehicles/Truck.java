package _01Vehicles;

import java.text.DecimalFormat;

public class Truck extends VehicleImpl {
    protected final Double summerConsumption = 1.6;
    //fuel quantity, fuel consumption in liters per km

    public Truck(Double fuelQuantity, Double fuelConsumptionPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptionPerKm(fuelConsumptionPerKm);
    }


    @Override
    public void driving(Double km) {
        double consumption = km *( summerConsumption + fuelConsumptionPerKm);
        if (consumption >= fuelQuantity) {
            System.out.println("Truck needs refueling");
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.printf("%s travelled %s km%n", "Truck", decimalFormat.format(km));
            fuelQuantity -= consumption;
        }
    }

    @Override
    public void refueling(Double liters) {
        this.fuelQuantity += liters*0.95;
    }
}
