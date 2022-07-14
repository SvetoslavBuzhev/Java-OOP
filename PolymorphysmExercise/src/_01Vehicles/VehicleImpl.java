package _01Vehicles;

public abstract class VehicleImpl implements Vehicle {

    //fuel quantity, fuel consumption in liters per km
    protected Double fuelQuantity;
    protected Double fuelConsumptionPerKm;

    protected void setFuelQuantity(Double fuelQuantity) {
        if (fuelQuantity <= 0) {
            throw new IllegalArgumentException("Invalid fuel quantity!");
        }
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumptionPerKm(Double fuelConsumptionPerKm) {
        if (fuelConsumptionPerKm <= 0) {
            throw new IllegalArgumentException("Invalid fuel consumption!");
        }
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }
    public final Double getFuelQuantity() {
        return fuelQuantity;
    }

    public final Double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }
    @Override
    public String toString(){
        return String.format("%s: %.2f",getClass().getSimpleName(),getFuelQuantity());
    }
}
