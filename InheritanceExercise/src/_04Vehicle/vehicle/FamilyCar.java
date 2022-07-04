package _04Vehicle.vehicle;

public class FamilyCar extends Car{
    public FamilyCar(double fuel,int horsePower){
        super(fuel,horsePower);
        super.setFuelConsumption(super.getFuelConsumption());
    }
}
