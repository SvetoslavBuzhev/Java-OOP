package FirstAndReserveTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Team team = new Team("Besni Kucheta");

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            try {
                Person person = new Person(firstName, lastName, age, salary);
                team.addPlayer(person);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("First team have "+ team.getFirstTeam().size()+" players");
        System.out.println("First team have "+ team.getReserveTeam().size()+" players");
    }
}