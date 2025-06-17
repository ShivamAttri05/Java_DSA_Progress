package Chapter_5;

public class Java_05_BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break; // Exit loop when i is 5
            }
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Number: " + i);
        }
    }
}