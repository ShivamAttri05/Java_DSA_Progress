package Chapter_4;

import java.util.Scanner;

public class Java_04_NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your weight (kg): ");
        int weight = scanner.nextInt();
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("Not eligible: weight is too low.");
            }
        } else {
            System.out.println("Not eligible: too young.");
        }
        scanner.close();
    }
}
