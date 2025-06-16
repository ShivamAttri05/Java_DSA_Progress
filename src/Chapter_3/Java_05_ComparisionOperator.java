package Chapter_3;

public class Java_05_ComparisionOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a = " + a + ", b = " + b);

        // Equal to (==)
        System.out.println("a == b : " + (a == b));  // false

        // Not equal to (!=)
        System.out.println("a != b : " + (a != b));  // true

        // Greater than (>)
        System.out.println("a > b  : " + (a > b));   // false

        // Less than (<)
        System.out.println("a < b  : " + (a < b));   // true

        // Greater than or equal to (>=)
        System.out.println("a >= b : " + (a >= b));  // false

        // Less than or equal to (<=)
        System.out.println("a <= b : " + (a <= b));  // true
    }
}
