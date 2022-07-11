package _04FoodShortage;


import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<String, Buyer> mapOfPeople = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int linesToRead = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < linesToRead; i++) {
            String[] split = scan.nextLine().split("\\s+");
            String name = split[0];
            int age = Integer.parseInt(split[1]);
            if (split.length == 3) {
                String group = split[2];
                Rebel rebel = new Rebel(name, age, group);
                mapOfPeople.putIfAbsent(name, rebel);
            } else if (split.length == 4) {
                String id = split[2];
                String birthDate = split[3];
                Citizen citizen = new Citizen(name, age, id, birthDate);
                mapOfPeople.putIfAbsent(name, citizen);
            }

        }
        String name = scan.nextLine();

        while (!name.equals("End")) {
            if (mapOfPeople.containsKey(name)) {
                mapOfPeople.get(name).buyFood();
            }
            name = scan.nextLine();
        }
        System.out.println(sum());
    }

    public static int sum() {
        int sum = 0;
        for (Buyer person : mapOfPeople.values()) {
            sum += person.getFood();
        }
        return sum;
    }
}
