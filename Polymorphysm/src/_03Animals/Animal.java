package _03Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    protected void setFavouriteFood(String favouriteFood) {
        if (favouriteFood.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid favourite food");
        }
        this.favouriteFood = favouriteFood;
    }

    protected Animal(String name, String favouriteFood) {
        setName(name);
        setFavouriteFood(favouriteFood);
    }

    public final String getName() {
        return name;
    }

    public final String getFavouriteFood() {
        return favouriteFood;
    }
    public abstract String explainSelf();
}
