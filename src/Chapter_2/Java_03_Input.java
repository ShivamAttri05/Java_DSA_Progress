package Chapter_2;

import java.util.Scanner;

public class Java_03_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("User entered the number: " + num);
    }
}
