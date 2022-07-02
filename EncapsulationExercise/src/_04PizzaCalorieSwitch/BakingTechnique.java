package _04PizzaCalorieSwitch;

public enum BakingTechnique {
    CRISPY(0.9),
    CHEWY(1.1),
    HOMEMADE(1.0);

    private double modifier;

    public double getModifier() {
        return modifier;
    }

    BakingTechnique(double modifier) {
        this.modifier = modifier;

    }
}
