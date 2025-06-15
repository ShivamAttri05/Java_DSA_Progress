package Chapter_3;

import java.util.Scanner;

public class Java_01_ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Modulo (Remainder): " + (num1 % num2));
    }
}
