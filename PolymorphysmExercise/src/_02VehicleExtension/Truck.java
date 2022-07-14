package _02VehicleExtension;

import java.text.DecimalFormat;

public class Truck extends VehicleImpl {
    protected final Double summerConsumption = 1.6;
    //fuel quantity, fuel consumption in liters per km

    public Truck(Double fuelQuantity, Double fuelConsumptionPerKm,Double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptionPerKm(fuelConsumptionPerKm);
        this.setTankCapacity(tankCapacity);
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
        double fuel = this.fuelQuantity+liters;
        if (fuel>tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        } else if (liters<=0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }else {
            this.fuelQuantity+=liters*0.95;
        }
    }
}
