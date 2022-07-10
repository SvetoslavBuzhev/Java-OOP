package _01CarShop;

public class Seat implements Car{
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public Seat(String model,String color,int horsePower,String countryProduced){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }
    @Override
    public String toString(){
        return String.format("This is %s produced in %s and %d tires",getModel(),countryProduced(),tires);
    }
    @Override
    public String countryProduced(){
        return this.countryProduced;
    }
    @Override
    public String getColor(){
        return this.color;
    }
    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

}
