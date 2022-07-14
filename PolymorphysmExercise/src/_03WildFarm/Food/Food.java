package _03WildFarm.Food;

public abstract class Food {
    protected Integer quantity;

    protected Food (Integer quantity){
        this.setQuantity(quantity);
    }

    protected void setQuantity(Integer quantity){
        if (quantity<0){
            throw  new IllegalArgumentException("Invalid quantity!");
        }
        this.quantity = quantity;
    }

    public final Integer getQuantity() {
        return quantity;
    }
}
