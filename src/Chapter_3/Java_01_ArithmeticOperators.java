package Chapter_3;

import java.util.Scanner;

public class Java_01_ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter Number 2: ");
        float num2 = sc.nextFloat();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Modulo (Remainder): " + (num1 % num2));
        sc.close();
    }
}
