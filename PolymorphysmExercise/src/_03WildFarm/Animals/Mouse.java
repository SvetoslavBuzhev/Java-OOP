package _03WildFarm.Animals;

import _03WildFarm.Food.Food;
import _03WildFarm.Food.Vegetable;

public class Mouse extends Mammal {
    public Mouse(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            super.eat(food);
        } else {
            System.out.printf("Mice are not eating that type of food!%n");
        }
    }

}
