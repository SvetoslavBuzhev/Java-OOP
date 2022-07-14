package _02VehicleExtension;

public abstract class VehicleImpl implements Vehicle{

    //fuel quantity, fuel consumption in liters per km
    protected Double fuelQuantity;
    protected Double fuelConsumptionPerKm;

    protected Double tankCapacity;
    protected void setFuelQuantity(Double fuelQuantity) {
        if (fuelQuantity <= 0) {
            throw new IllegalArgumentException("Invalid fuel quantity!");
        }
        this.fuelQuantity = fuelQuantity;
    }
    protected void setTankCapacity(Double tankCapacity){
        if (tankCapacity<=0){
            throw new IllegalArgumentException("Invalid tank capacity!");
        }
        this.tankCapacity = tankCapacity;
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
    @Override
    public void refueling(Double liters){
        double fuel = this.fuelQuantity+liters;
        if (fuel>tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        } else if (liters<=0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }else {
            this.fuelQuantity+=liters;
        }
    }
}
