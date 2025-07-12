package Chapter_6;

public class Java_02_TypesOfFunction {

    // User-Defined Function
    // 1: Function to calculate the square of a number
    public static int calculateSquare(int number) {
        return number * number; // Returns the square of the input number
    }

    // User-Defined Function
    // 2: Function to print a personalized greeting
    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming!");
    }

    public static void main(String[] args) {
        // Example of using a Built-In Function
        // Math.sqrt() is a built-in function from the Java Math class
        double number = 16.0;
        double result = Math.sqrt(number); // Built-in function to calculate square root
        System.out.println("Square root of " + number + " is: " + result);

        // Example of using a User-Defined Function
        // Calling the user-defined function to calculate the square of a number
        int num = 5;
        int square = calculateSquare(num); // Calling user-defined function
        System.out.println("Square of " + num + " is: " + square);

        // Calling another user-defined function to greet a user
        String name = "Shivam";
        printGreeting(name); // Calling user-defined function
    }

    /*
     * Types of Functions in Java:
     * 1. Built-In Functions:
     *    - Provided by Java's standard libraries (e.g., java.lang.Math, java.util, etc.)
     *    - Examples: Math.sqrt(), Math.pow(), String.length(), System.out.println()
     *    - Ready to use without needing to write the implementation
     *    - Found in Java API classes and packages
     *
     * 2. User-Defined Functions:
     *    - Created by the programmer to perform specific tasks
     *    - Defined within a class using method syntax
     *    - Can take parameters, return values, or be void
     *    - Examples above: calculateSquare() and printGreeting()
     */
}