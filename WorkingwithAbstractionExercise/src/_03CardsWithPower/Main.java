package _03CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        Rank rank = Rank.valueOf(scan.nextLine());

        TypeOfCards suit = TypeOfCards.valueOf(scan.nextLine());

        Card card = new Card(suit,rank);
        System.out.printf("Card name: %s of %s; Card power: %d",card.getRank(),card.getSuitCard(),card.getPower());
    }

}
