import java.io.IOException;
import java.io.InputStream;

public class The_World_is_a_theatre {
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
    static final int MAX = 1_000_000;
    static final long MOD = 1_000_000_007L;
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

    r = Math.min(r, n - r);

    long result = 1;

    for (int i = 1; i <= r; i++) {
        result = result * (n - r + i) / i;
    }

    return result;
    }
    public static void main(String[] args) throws Exception {
        long ans = 0;
        precompute();
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();
        int t = fs.nextInt();
        for(int boys=4;boys<=n;boys++){
            int girls = t-boys;
            if(boys<=n && girls>=1 && girls<=m){
                ans+=nCr(n, boys)*nCr(m, girls);
            }
        }
        System.out.println(ans);
    }
}
