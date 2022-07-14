package _03WildFarm.Animals;

import _03WildFarm.Food.Food;
import _03WildFarm.Food.Meat;
import _03WildFarm.Food.Vegetable;

public class Tiger extends Felime{

    public Tiger(String name,String type, Double weight, String livingRegion) {
        super(name,type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
           super.eat(food);
        } else {
            System.out.printf("%ss are not eating that type of food!%n", getAnimalType());
        }
    }
}
