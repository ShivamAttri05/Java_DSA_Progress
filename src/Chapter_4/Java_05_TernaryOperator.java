package Chapter_4;

public class Java_05_TernaryOperator {
    public static void main(String[] args) {
        int number = 7;
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result + ".");
    }
}
