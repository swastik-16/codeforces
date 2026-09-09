import java.io.IOException;
import java.io.InputStream;

public class Sumofdivisors {

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

        long nextLong() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            long num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num;
        }
    }

    static final long MOD = 1_000_000_007L;

    // Sum from 1 to x modulo MOD
    static long sum(long x) {
        x %= MOD;

        if (x % 2 == 0) {
            return (x / 2) * ((x + 1) % MOD) % MOD;
        } else {
            return x * (((x + 1) / 2) % MOD) % MOD;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        long n = fs.nextLong();
        long ans = 0;

        for (long l = 1; l <= n; ) {
            long quotient = n / l;

            // Largest r such that n / i == quotient
            long r = n / quotient;

            // Sum of all i from l to r
            long rangeSum = (sum(r) - sum(l - 1) + MOD) % MOD;

            ans = (ans + rangeSum * (quotient % MOD)) % MOD;

            l = r + 1;
        }

        System.out.println(ans);
    }
}