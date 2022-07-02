package _04PizzaCalorieSwitch;

import java.util.Scanner;

public class Main {
    public static boolean isValid = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] pizzaArguments = scan.nextLine().split("\\s+");
        String[] doughArguments = scan.nextLine().split("\\s+");
        String[] toppingArguments = scan.nextLine().split("\\s+");

        try {
            Pizza pizza = new Pizza( pizzaArguments[1],Integer.parseInt(pizzaArguments[2]));
            Dough dough = new Dough(doughArguments[1], doughArguments[2], Integer.parseInt(doughArguments[3]));
            pizza.setDough(dough);
            while (!"END".equals(toppingArguments[0])){
                Topping topping = new Topping(toppingArguments[1],Integer.parseInt(toppingArguments[2]));
                pizza.addTopping(topping);
                toppingArguments = scan.nextLine().split("\\s+");
            }
            System.out.println(pizza);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
