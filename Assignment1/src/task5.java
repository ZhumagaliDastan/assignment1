public class task5 {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) { // Base case: if n is 0 or 1, return n
            return n;
        }
        else { // Recursive case: compute the n-th Fibonacci number by recursively sum-ming the (n-1)th and (n-2)th Fibonacci numbers
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
