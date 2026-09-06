import java.util.*;

public class NumberOfIntersectingDiagonals {

    static final long MOD = 1_000_000_007L;

    static long power(long a, long b) {
        long result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = result * a % MOD;
            }

            a = a * a % MOD;
            b >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        long inv2 = power(2, MOD - 2);
        long inv24 = power(24, MOD - 2);

        while (t-- > 0) {
            long n = sc.nextLong();
            // Number of intersections = C(n,4)
            long intersections = n % MOD;
            intersections = intersections * ((n - 1) % MOD) % MOD;
            intersections = intersections * ((n - 2) % MOD) % MOD;
            intersections = intersections * ((n - 3) % MOD) % MOD;
            intersections = intersections * inv24 % MOD;
            System.out.println(intersections);
            sc.close();
        }
    }
}