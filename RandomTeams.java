import java.io.*;

public class RandomTeams {
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

            long result = 0;

            while (c > ' ') {
                result = result * 10 + (c - '0');
                c = read();
            }

            return result;
        }
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        long n = fs.nextLong();
        long m = fs.nextLong();

        // Minimum
        long q = n / m;
        long r = n % m;

        long kmin = r * (q * (q + 1) / 2)
                  + (m - r) * (q * (q - 1) / 2);

        // Maximum
        long remaining = n - m + 1;
        long kmax = remaining * (remaining - 1) / 2;

        System.out.println(kmin + " " + kmax);
    }
}