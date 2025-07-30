package Chapter_7;

public class Java_06_ReverseAnArray {

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        reverseArray(arr); // In-place reversal

        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
