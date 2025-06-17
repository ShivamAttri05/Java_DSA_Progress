package Chapter_5;

import java.util.Scanner;

public class Java_03_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("You entered a valid number: " + number);
        scanner.close();
    }
}
