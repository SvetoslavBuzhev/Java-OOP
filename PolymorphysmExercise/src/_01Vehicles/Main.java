package _01Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] carInfo = scan.nextLine().split("\\s+");
        Car car = new Car(Double.valueOf(carInfo[1]), Double.valueOf(carInfo[2]));

        String[] truckInfo = scan.nextLine().split("\\s+");
        Truck truck = new Truck(Double.valueOf(truckInfo[1]), Double.valueOf(truckInfo[2]));

        int linesRead = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < linesRead; i++) {
            String[] command = scan.nextLine().split("\\s+");
            switch (command[1]) {
                case "Car":
                    carCommands(car, command);
                    break;
                case "Truck":
                    truckCommands(truck, command);
                    break;
            }
        }
        print(truck,car);
    }

    private static void print(Truck truck, Car car) {
        System.out.println(car);
        System.out.println(truck);
    }

    private static void carCommands(Car car, String[] command) {

        switch (command[0]) {
            case "Drive":
                car.driving(Double.parseDouble(command[2]));
                break;
            case "Refuel":
                car.refueling(Double.valueOf(command[2]));
                break;
        }
    }

    private static void truckCommands(Truck truck, String[] command) {
        switch (command[0]) {
            case "Drive":
                truck.driving(Double.parseDouble(command[2]));
                break;
            case "Refuel":
                truck.refueling(Double.valueOf(command[2]));
                break;
        }
    }
}



