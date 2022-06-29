package _04TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        int readLines = Integer.parseInt(scan.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String in : input) {
            trafficLights.add(new TrafficLight(Lights.valueOf(in)));
        }

        for (int i = 0; i < readLines; i++) {
            trafficLights.forEach(light -> {
                light.changeColor();
                System.out.print(light.getLight() + " ");
            });
            System.out.println();
        }
    }
}
