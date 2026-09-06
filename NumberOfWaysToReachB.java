import java.io.*;
import java.util.*;

public class NumberOfWaysToReachB {

    static final long MOD = 1_000_000_007L;
    static final int MAX = 1_000_000;

    static long[] fact = new long[MAX + 1];
    static long[] invFact = new long[MAX + 1];
    static long binPow(long a, long b) {
        if (b == 0) return 1;

        if (b % 2 == 1) {
            return (a * binPow(a, b - 1)) % MOD;
        } else {
            long x = binPow(a, b / 2);
            return (x * x) % MOD;
        }
    }

    static long inverse(long x) {
        return binPow(x, MOD - 2);
    }

    static void precompute() {

        fact[0] = 1;

        for (int i = 1; i <= MAX; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        invFact[MAX] = inverse(fact[MAX]);

        for (int i = MAX; i >= 1; i--) {
            invFact[i - 1] = (invFact[i] * i) % MOD;
        }
    }

    static long nCr(int n, int r) {

        if (r < 0 || r > n) return 0;

        long num = fact[n];

        long den = (invFact[n - r] * invFact[r]) % MOD;

        return (num * den) % MOD;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        precompute();

        int t = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();

        while (t-- > 0) {

            StringTokenizer st =
                    new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            ans.append(nCr(n+m, m)).append('\n');
        }

        System.out.print(ans);
    }
}