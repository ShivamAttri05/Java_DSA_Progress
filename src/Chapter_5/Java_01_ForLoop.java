package Chapter_5;

import java.util.Scanner;

public class Java_01_ForLoop {
    public static void main(String[] args) {
        // Loops
        // Loops execute a block of code repeatedly as long as a condition is met or for a specified number of iterations.

        // The For Loop

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to repeat: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Iteration: " + i);
        }
        scanner.close();
    }
}
