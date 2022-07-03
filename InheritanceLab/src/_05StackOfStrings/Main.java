package _05StackOfStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StackOfStrings sos = new StackOfStrings();
        sos.push("au");
        sos.push("tele");
        sos.push("ele");

        System.out.println(sos.isEmpty());
        System.out.println(sos.peek());


        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());

    }
}
