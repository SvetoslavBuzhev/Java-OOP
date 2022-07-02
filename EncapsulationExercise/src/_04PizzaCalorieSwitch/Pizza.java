package _04PizzaCalorieSwitch;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private int countOfToppings;

    public Pizza(String name,int countOfToppings) {
        setName(name);
        setToppings(countOfToppings);
        toppings = new ArrayList<>();
    }

    public void setDough(Dough dough) {
        this.dough=dough;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()||name.length()>15||name.equals("\\s+")){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.countOfToppings = numberOfToppings;
    }

    public String getName() {
        return name;
    }
    public void addTopping(Topping topping){
        if (toppings.size()<countOfToppings){
            toppings.add(topping);
        }
    }
    public double getOverallCalories(){
        return dough.calculateCalories() + toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }
    @Override
    public String toString(){
        return String.format("%s - %.2f",name,getOverallCalories());
    }
}
