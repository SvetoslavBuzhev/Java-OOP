package _04PizzaCalorieSwitch;

public class Dough {
    private static final double baseCalorie = 2.0;
    private String flourType;
    private String bakingTechnique;
    private double weight;
    private FlourType flourModifier;
    private BakingTechnique bakingTechniqueModifier;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        try {
            this.flourModifier = FlourType.valueOf(flourType.toUpperCase());
            this.flourType = flourType;
        } catch (IllegalArgumentException e) {
           throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        try{
            this.bakingTechniqueModifier = BakingTechnique.valueOf(bakingTechnique.toUpperCase());
            this.bakingTechnique = bakingTechnique;
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight>200 ||weight<=0){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }
    public double calculateCalories(){
    return (baseCalorie*weight)*
            flourModifier.getModifier()*
            bakingTechniqueModifier.getModifier();
    }
}
