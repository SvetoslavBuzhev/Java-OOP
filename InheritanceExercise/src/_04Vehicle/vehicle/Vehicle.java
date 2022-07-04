package _04Vehicle.vehicle;

public class Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected void setFuel(double fuel) {
        this.fuel = fuel;
    }

    protected void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Vehicle(double fuel, int horsePower) {
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
        setFuel(fuel);
        setHorsePower(horsePower);
    }
    public void drive(double kilometers){
        double neededFuel = kilometers*fuelConsumption;
        if (fuel>=neededFuel){
            fuel-=neededFuel;
        }
    }
}
