package _04Vehicle.vehicle;

public class Motorcycle extends Vehicle{
    public Motorcycle(double fuel,int horsePower){
        super(fuel,horsePower);
        super.setFuelConsumption(super.getFuelConsumption());
    }

}
