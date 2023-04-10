public class task1 {
    public static int findMinimum(int[] arr) { //function to find min value from array
        int min = arr[0]; //set min value as the first element of array


        for (int i = 1; i < arr.length; i++) { // loop to find the minimum value through the array
            // If the current element is smaller than the current minimum,
            // update the minimum value
            if (arr[i] < min) {
                min = arr[i];
            }
        }


        return min; // return the minimum value
    }
}
