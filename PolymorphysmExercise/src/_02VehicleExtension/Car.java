package _02VehicleExtension;

import java.text.DecimalFormat;

public class Car extends VehicleImpl {
    protected final Double summerConsumption = 0.9;

    public Car(Double fuelQuantity, Double fuelConsumptionPerKm,Double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptionPerKm(fuelConsumptionPerKm);
        this.setTankCapacity(tankCapacity);
    }
    @Override
    public void driving(Double km) {
        double consumption = km*(summerConsumption+fuelConsumptionPerKm);
        if (consumption>=fuelQuantity){
            System.out.println("Car needs refueling");
        }
        else {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.printf("%s travelled %s km%n", "Car", decimalFormat.format(km));
            fuelQuantity -= consumption;
        }
    }
}
