package Chapter_6;

public class Java_01_Functions {
    // Function is a block of code which can be reused

    // Syntax
    /*
    *returnType name(){
    *   //body
    *   return statement;
    *}
    */

    // method definition
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);  // method call
        System.out.println(result);  // 8
    }
}
