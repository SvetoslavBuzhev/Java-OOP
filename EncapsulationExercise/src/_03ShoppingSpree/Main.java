package _03ShoppingSpree;

import java.util.*;

public class Main {
    public static boolean isFull = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> producta = new LinkedHashMap<>();
        initializeList(scan, people);
        if (!isFull) {
            return;

        }
        initializeProductList(scan, producta);
        if (!isFull) {
            return;
        }
        String input = scan.nextLine();
        while (!input.equals("END")) {

            String[] splitInput = input.split("\\s+");
            String name = splitInput[0];
            String productName = splitInput[1];
            try {
                people.get(name).buyProduct(producta.get(productName));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            input = scan.nextLine();
        }
        if (isFull) {
            people.forEach((key, value) -> System.out.println(value));
        }
    }

    private static void initializeList(Scanner scan, Map<String, Person> people) {
        String[] Split = scan.nextLine().split("[= ;]");
        for (int i = 0; i < Split.length; i += 2) {
            String name = Split[i];
            double money = Double.parseDouble(Split[i + 1]);
            try {
                Person person = new Person(name, money);
                people.put(name, person);
            } catch (IllegalArgumentException e) {
                isFull = false;
                System.out.println(e.getMessage());
            }
        }
    }

    private static void initializeProductList(Scanner scan, Map<String, Product> products) {
        String[] Split = scan.nextLine().split("[= ;]");
        for (int i = 0; i < Split.length; i += 2) {
            String name = Split[i];
            double cost = Double.parseDouble(Split[i + 1]);
            Product product = new Product(name, cost);
            products.put(name, product);
        }
    }
}
