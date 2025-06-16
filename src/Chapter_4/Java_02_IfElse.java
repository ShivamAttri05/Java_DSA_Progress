package Chapter_4;

import java.util.Scanner;

public class Java_02_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number(to check): ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        sc.close();
    }
}
