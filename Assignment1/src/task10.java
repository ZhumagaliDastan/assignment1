public class task10 {
    public static int gcd(int a, int b) {
        if (b == 0) { // base case: gcd(a,0) = a
            return a;
        } else { // recursive case: gcd(a,b) = gcd(b,a mod b)
            return gcd(b, a % b);
        }
    }
}
