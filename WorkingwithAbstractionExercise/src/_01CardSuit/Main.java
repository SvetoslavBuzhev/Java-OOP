package _01CardSuit;

public class Main {
    public static void main(String[] args) {
        //Всички изброени стойности в cardSuit
        //за всяка стойност отпечатвам: позицията и стойността
        System.out.println("Card Suits:");
        TypeOfCards[] cardSuits = TypeOfCards.values();

        int counter = 0;

        for (TypeOfCards card : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", counter, card);
            counter++;
        }
    }
}
