package _02VehicleExtension;

import java.text.DecimalFormat;

public class Bus extends VehicleImpl{
    protected final Double summerConsumption = 1.4;


    public Bus(Double fuelQuantity, Double fuelConsumptionPerKm,Double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumptionPerKm(fuelConsumptionPerKm);
        this.setTankCapacity(tankCapacity);
    }
    @Override
    public void driving(Double km) {
        double consumption = km*(summerConsumption+fuelConsumptionPerKm);
        if (consumption>=fuelQuantity){
            System.out.println("Bus needs refueling");
        }
        else {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.printf("%s travelled %s km%n", "Bus", decimalFormat.format(km));
            fuelQuantity -= consumption;
        }
    }
    public void emptyDriving(Double km){
        double consumption = km*fuelConsumptionPerKm;
        if (consumption>=fuelQuantity){
            System.out.println("Bus needs refueling");
        }
        else {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.printf("%s travelled %s km%n", "Bus", decimalFormat.format(km));
            fuelQuantity -= consumption;
        }
    }

}
