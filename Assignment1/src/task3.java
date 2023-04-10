public class task3 {
    public static boolean isPrime(int n) {

        if (n < 2) { // if n is less than 2, it is not a prime number
            return false;
        }


        for (int i = 2; i <= Math.sqrt(n); i++) { // loop through all numbers from 2 to the square root of n
            // If n is divisible by i, it is not a prime number
            if (n % i == 0) {
                return false;
            }
        }


        return true;  // If no factors were found, n is a prime number
    }
}
