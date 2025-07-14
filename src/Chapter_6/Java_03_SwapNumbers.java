package Chapter_6;

public class Java_03_SwapNumbers {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("The Value of a is " + a);
        System.out.println("The Value of b is " + b);
    }

    public static void main(String[] args) {
        swap(2,3);
    }
}
