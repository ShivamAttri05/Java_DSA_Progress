package Chapter_5;

import java.util.Scanner;

public class Java_02_WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 to stop): ");
        int number = scanner.nextInt();
        while (number != 0) {
            System.out.println("You entered: " + number);
            System.out.print("Enter another number (0 to stop): ");
            number = scanner.nextInt();
        }
        System.out.println("Loop stopped.");
        scanner.close();
    }
}
