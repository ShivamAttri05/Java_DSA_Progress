package Chapter_3;

public class Java_04_UnaryOperator {
    public static void main(String[] args) {
        int num1 = 20;
        int increment_num1 = num1++;
        System.out.println(increment_num1);     // 20
        int num2 = 10;
        int increment_num2 = ++num2;
        System.out.println(increment_num2);     // 11
    }
}
