package _02MultipleInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Puppy dog = new Puppy();
        dog.eat();
        dog.bark();
        dog.weep();
    }
}
