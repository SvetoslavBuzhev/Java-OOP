package SalaryIncrease;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Person> people = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            Person person = new Person(firstName,lastName,age,salary);

            people.add(person);
        }
        double bonus = Double.parseDouble(scan.nextLine());

        for (Person person:people) {
            person.increaseSalary(bonus);
            System.out.println(person);
        }
    }
}
