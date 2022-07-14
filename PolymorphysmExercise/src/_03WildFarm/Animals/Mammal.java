package _03WildFarm.Animals;

import _03WildFarm.Food.Food;
import _03WildFarm.Food.Vegetable;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String type,String name ,Double weight, String livingRegion) {
        super(name,type, weight);
        this.livingRegion = livingRegion;
    }


    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        return String.format("%s[%s, %s, %s, %d]",
                getClass().getSimpleName(),
                getAnimalName(),
                decimalFormat.format(getAnimalWeight()),
                getLivingRegion(),
                getFoodEaten());
    }
}
