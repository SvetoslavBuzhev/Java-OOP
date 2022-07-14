package _02VehicleExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car car = createCar(scan);

        Truck truck = createTruck(scan);

        Bus bus = createBus(scan);

        int linesRead = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < linesRead; i++) {
            String[] command = scan.nextLine().split("\\s+");
            switch (command[1]) {
                case "Car":
                    try {
                        carCommands(car, command);
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Truck":
                    try {
                        truckCommands(truck, command);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Bus":
                    try {
                        BusCommands(bus, command);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
        print(truck, car, bus);
    }

    private static void BusCommands(Bus bus, String[] command) {
        switch (command[0]) {
            case "Drive":
                bus.driving(Double.parseDouble(command[2]));
                break;
            case "Refuel":
                bus.refueling(Double.valueOf(command[2]));
                break;
            case "DriveEmpty":
                bus.emptyDriving(Double.parseDouble(command[2]));

        }
    }

    private static Bus createBus(Scanner scan) {
        String[] busInfo = scan.nextLine().split("\\s+");
        return new Bus(Double.valueOf(busInfo[1]),
                Double.valueOf(busInfo[2]),
                Double.valueOf(busInfo[3]));
    }

    private static Truck createTruck(Scanner scan) {
        String[] truckInfo = scan.nextLine().split("\\s+");
        return new Truck(Double.valueOf(truckInfo[1]),
                Double.valueOf(truckInfo[2]),
                Double.valueOf(truckInfo[3]));
    }

    private static Car createCar(Scanner scan) {
        String[] carInfo = scan.nextLine().split("\\s+");
        return new Car(Double.valueOf(carInfo[1]),
                Double.valueOf(carInfo[2]),
                Double.valueOf(carInfo[3]));
    }

    private static void print(Truck truck, Car car, Bus bus) {
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
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



