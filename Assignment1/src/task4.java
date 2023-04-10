public class task4 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Base case: if n is 0 or 1, return 1
            return 1;
        }
        // Recursive case: compute n! by computing (n-1)! and multiplying by n
        else {
            return n * factorial(n-1);
        }
    }
}
