package _06Animal;


import _06Animal.Animals.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("Beast!")) {
            String type = input;
            String[] inputSplit = scan.nextLine().split("\\s+");
            String name = inputSplit[0];
            int age = Integer.parseInt(inputSplit[1]);
            String gender = inputSplit[2];
            switch (type) {
                case "Dog":
                    initializeDog(name, age, gender);
                    break;
                case "Cat":
                    initializeCat(name, age, gender);
                    break;
                case "Kitten":
                    initializeKitten(name, age);
                case "Frog":
                    initializeFrog(name, age, gender);
                    break;
                case "Tomcat":
                    initializeTomcat(name, age);
                    break;
                case "Animal":
                    initializeAnimal(name, age, gender);
                    break;
            }
            input = scan.nextLine();
        }
    }
    private static void initializeAnimal(String name, int age, String gender) {
        try {
            Animal animal = new Animal(name, age, gender);
            System.out.println(animal);
            animal.produceSound();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void initializeTomcat(String name, int age) {
        try {
            Tomcat tomcat = new Tomcat(name, age);
            System.out.println(tomcat);
            tomcat.produceSound();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void initializeKitten(String name, int age) {
        try {
            Kitten kitten = new Kitten(name, age);
            System.out.println(kitten);
            kitten.produceSound();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void initializeDog(String name, int age, String gender) {
        try {
            Dog dog = new Dog(name, age, gender);
            System.out.println(dog);
            dog.produceSound();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void initializeCat(String name, int age, String gender) {
        try {
            Cat cat = new Cat(name, age, gender);
            System.out.println(cat);
            cat.produceSound();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void initializeFrog(String name, int age, String gender) {
        try {
            Frog frog = new Frog(name, age, gender);
            System.out.println(frog);
            frog.produceSound();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


