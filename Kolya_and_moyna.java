import java.io.*;

public class Kolya_and_moyna {

    static final long MOD = 1_000_000_007L;

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

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        long n = fs.nextLong();

        long total = powerMod(27, n);
        long invalid = powerMod(7, n);

        System.out.println((total - invalid + MOD) % MOD);
    }
}