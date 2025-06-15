package Chapter_3;

public class Java_03_AssignmentOperator {
    public static void main(String[] args) {
        int x = 6;  // = operator
        System.out.println("Initial value of x: " + x);

        x += 5;  // x = x + 5
        System.out.println("After x += 5: " + x);

        x -= 3;  // x = x - 3
        System.out.println("After x -= 3: " + x);

        x *= 2;  // x = x * 2
        System.out.println("After x *= 2: " + x);

        x /= 4;  // x = x / 4
        System.out.println("After x /= 4: " + x);

        x %= 3;  // x = x % 3
        System.out.println("After x %= 3: " + x);
    }
}
