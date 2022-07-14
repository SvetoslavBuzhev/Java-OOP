package _03WildFarm.Animals;

import _03WildFarm.Food.Food;
import _03WildFarm.Food.Vegetable;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String name,String type, String breed, Double weight, String livingRegion) {
        super(name,type, weight, livingRegion);
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        return String.format("%s[%s, %s, %s, %s, %d]",
                getAnimalType(),
                getAnimalName(),
                getBreed(),
                decimalFormat.format(getAnimalWeight()),
                getLivingRegion(),
                getFoodEaten());
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}
