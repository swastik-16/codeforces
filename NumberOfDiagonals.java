import java.util.*;

public class NumberOfDiagonals {

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

        while (t-- > 0) {
            long n = sc.nextLong();

            
            long diagonals = n % MOD;
            diagonals = diagonals * ((n - 3) % MOD) % MOD;
            diagonals = diagonals * inv2 % MOD;

            System.out.println(diagonals);
            sc.close();
        }
    }
}