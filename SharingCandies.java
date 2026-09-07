import java.io.*;

public class SharingCandies {

    static final long MOD = 1_000_000_007L;
    static final int MAX = 1_000_000;

    static long[] fact = new long[MAX + 1];
    static long[] invFact = new long[MAX + 1];

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0) return -1;
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            int num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num;
        }
    }

    static long powerMod(long base, long exponent) {
        long result = 1;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = result * base % MOD;
            }

            base = base * base % MOD;
            exponent >>= 1;
        }

        return result;
    }

    static void precompute() {
        fact[0] = 1;

        for (int i = 1; i <= MAX; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        invFact[MAX] = powerMod(fact[MAX], MOD - 2);

        for (int i = MAX; i >= 1; i--) {
            invFact[i - 1] = invFact[i] * i % MOD;
        }
    }

    static long combination(int n, int r) {
        if (r < 0 || r > n) return 0;

        return fact[n] * invFact[r] % MOD
                       * invFact[n - r] % MOD;
    }

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();

        precompute();

        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (m < n) {
                output.append(0).append('\n');
            } else {
                output.append(combination(m - 1, n - 1)).append('\n');
            }
        }

        System.out.print(output);
    }
}