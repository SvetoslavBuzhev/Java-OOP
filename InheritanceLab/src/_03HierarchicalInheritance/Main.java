package _03HierarchicalInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();
    }
}
