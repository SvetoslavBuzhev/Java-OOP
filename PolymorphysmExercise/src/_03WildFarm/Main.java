package _03WildFarm;

import _03WildFarm.Animals.*;
import _03WildFarm.Food.Food;
import _03WildFarm.Food.Meat;
import _03WildFarm.Food.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Mammal> mammals = new ArrayList<>();

        while (!input.equals("End")) {
            Mammal mammal = creatingAnimal(input);
            input = scan.nextLine();
            String[] inputSplit = input.split("\\s+");

            eatingFood(mammal, inputSplit);
            mammals.add(mammal);
            input = scan.nextLine();
        }
        mammals.forEach(System.out::println);
    }

    private static void eatingFood(Mammal mammal, String[] inputSplit) {
        switch (inputSplit[0]) {
            case "Vegetable":
                try {
                    Food food = new Vegetable(Integer.valueOf(inputSplit[1]));
                    mammal.eat(food);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "Meat":
                try {
                    Food food = new Meat(Integer.valueOf(inputSplit[1]));
                    mammal.eat(food);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
    }

    private static Mammal creatingAnimal(String input) {
        String[] tokens = input.split("\\s+");
        String animalType = tokens[0];
        String animalName = tokens[1];
        Double animalWeight = Double.parseDouble(tokens[2]);
        String animalLivingRegion = tokens[3];
        Mammal mammal = null;
        switch (tokens[0]) {
            case "Mouse":
                mammal = new Mouse(animalType, animalName, animalWeight, animalLivingRegion);
                break;
            case "Zebra":
                mammal = new Zebra(animalType, animalName, animalWeight, animalLivingRegion);
                break;
            case "Cat":
                String bread = tokens[4];
                mammal = new Cat(animalType, animalName, bread, animalWeight, animalLivingRegion);
                break;
            case "Tiger":
                mammal = new Tiger(animalType, animalName, animalWeight, animalLivingRegion);
                break;
        }
        mammal.makeSound();
        return mammal;
    }
}

