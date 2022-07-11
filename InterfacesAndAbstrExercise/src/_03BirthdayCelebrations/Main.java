package _03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Birthable> CitiAndPets = new ArrayList<>();

        while (!input.equals("End")) {
            String[] split = input.split("\\s+");
            String nameNModel = split[1];
            switch (split[0]) {
                case "Citizen":
                    Citizen citizen = new Citizen(nameNModel, Integer.parseInt(split[2]), split[3], split[4]);
                    CitiAndPets.add(citizen);
                    break;
                case "Pet":
                    Pet pet = new Pet(nameNModel, split[2]);
                    CitiAndPets.add(pet);
                    break;
                case "Robot":
                    Robot robot = new Robot(nameNModel, split[2]);
                    break;
            }
            input = scan.nextLine();
        }
        String targetYear = scan.nextLine();
        CitiAndPets.stream().map(Birthable::getBirthDate)
                .filter(birthDate -> birthDate.endsWith(targetYear)).forEach(System.out::println);
    }
}