package Chapter_6;

public class Java_01_Functions {
    // method definition
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);  // method call
        System.out.println(result);  // 8
    }
}
