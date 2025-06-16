package Chapter_3;

public class Java_07_TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int num = 10;
        double result = num; // int to double
        System.out.println("Implicit Casting:");
        System.out.println("int num = " + num);
        System.out.println("double result = " + result);  // 10.0

        System.out.println();

        // Explicit Casting (Narrowing)
        double value = 9.99;
        int intValue = (int) value; // double to int
        System.out.println("Explicit Casting:");
        System.out.println("double value = " + value);
        System.out.println("int intValue = " + intValue); // 9
    }
}
