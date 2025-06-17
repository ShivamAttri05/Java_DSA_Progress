package Chapter_5;

public class Java_04_ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
