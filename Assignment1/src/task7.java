import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        // Initialize an array of integers
        int size;

        Scanner input = new Scanner(System.in);
        size = input.nextInt();

        int[] arr = new int[size]; // setting size of the array

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Reverse the array using the reverse method
        ReverseArray.reverse(arr, 0, arr.length - 1);

        // Print out the reversed array using a for-each loop
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

class ReverseArray {
    // Recursive method to reverse the array
    public static void reverse(int[] arr, int start, int end) {
        // Base case: If the start index is greater than or equal to the end index,
        // we have reached the middle of the array, so we can stop.
        if (start >= end) {
            return;
        }
        // Swap the elements at the start and end indices.
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // Recursively call the reverse method with the start index incremented by 1 and the end index decremented by 1.
        reverse(arr, start + 1, end - 1);
    }
}
