package _01DefineInterfacePerson;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if(Arrays.asList(citizenInterfaces).contains(Person.class)){
            Method[] fields = Person.class.getDeclaredMethods();
            String name = scan.nextLine();
            int age = Integer.parseInt(scan.nextLine());
            Person person = new Citizen(name,age);
            System.out.println(fields.length);
            System.out.println(person.getName());
            System.out.println(person.getAge());

        }
    }
}
