package _03CardsWithPower;

public enum TypeOfCards {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    TypeOfCards(int power){
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
