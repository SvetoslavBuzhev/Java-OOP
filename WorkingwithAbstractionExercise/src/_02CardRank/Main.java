package _02CardRank;

public class Main {
    public static void main(String[] args) {
        Rank[] ranks = Rank.values();
        System.out.println("Card Ranks: ");
        for (Rank rank:ranks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",rank.ordinal(),rank);
        }
    }
}
