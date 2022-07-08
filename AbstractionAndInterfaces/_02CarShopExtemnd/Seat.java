package _02CarShopExtemnd;

public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(String model,String color,Integer horsePower,String countryProduce,Double price){
        super(model, color, horsePower, countryProduce);
        this.price = price;
    }
    @Override
    public Double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return super.toString()
                + System.lineSeparator()
                + String.format("%s sells for %.6f", this.getModel(), this.price);    }
}
