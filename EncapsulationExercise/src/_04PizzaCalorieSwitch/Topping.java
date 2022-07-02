package _04PizzaCalorieSwitch;

public class Topping {
    private String toppingType;
    private double weight;
    private ToppingType toppingModifier;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {

        try {
            this.toppingType = toppingType;
            this.toppingModifier = ToppingType.valueOf(toppingType.toUpperCase());
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight > 50 || weight < 1) {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return (2 * weight) *
                toppingModifier.getModifier();
    }
}
