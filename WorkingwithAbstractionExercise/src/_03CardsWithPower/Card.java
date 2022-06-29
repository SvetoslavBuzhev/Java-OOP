package _03CardsWithPower;

public class Card {
    private TypeOfCards suitCard;
    private Rank rank;
    private int power;

    public Card(TypeOfCards suitCard, Rank rank) {
        this.suitCard = suitCard;
        this.rank = rank;
    }

    public TypeOfCards getSuitCard() {
        return suitCard;
    }

    public Rank getRank() {
        return rank;
    }

    public int getPower() {
        return getRank().getPowerRank()+getSuitCard().getPower();
    }

    public void setSuitCard(TypeOfCards suitCard) {
        this.suitCard = suitCard;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
