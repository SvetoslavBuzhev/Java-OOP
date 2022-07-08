package _05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static List<Identifiable> population = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("End")) {
            String[] split = input.split("\\s+");

            inputForList(split);

            input = scanner.nextLine();
        }
        String lastId = scanner.nextLine();
        print(lastId);
    }
    private static void print(String lastId) {
        System.out.println(population.stream().filter(i -> i.getId().endsWith(lastId))
                .map(entry -> String.format("%s", entry.getId()))
                .collect(Collectors.joining(System.lineSeparator())));
    }

    private static void inputForList(String[] split) {
        if (split.length == 3) {

            assignCitizen(split);

        } else if (split.length == 2) {

            assignRobot(split);
        }
    }

    private static void assignCitizen(String[] split) {
        String name = split[0];
        int age = Integer.parseInt(split[1]);
        String id = split[2];
        Citizen citizen = new Citizen(name, age, id);
        population.add(citizen);
    }

    private static void assignRobot(String[] split) {
        String model = split[0];
        String id = split[1];
        Robot robot = new Robot(id, model);
        population.add(robot);
    }
}
