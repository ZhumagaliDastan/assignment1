public class task9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) { // base cases: Cn,0 = Cn,n = 1
            return 1;
        } else { // recursive case: use formula C(n,k) = C(n-1,k-1) + C(n-1,k)
            return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
        }
    }
}
