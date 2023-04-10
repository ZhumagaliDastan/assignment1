public class task2 {
    public static double findAverage(int[] arr) { // function to find average value of inputted values
        double sum = 0; //setting sum values 0

        for (int i = 0; i < arr.length; i++) { //loop to find the sum of array
            sum += arr[i];
        }

        return sum / arr.length; //returning sum divided by the number of elements in array
    }
}
