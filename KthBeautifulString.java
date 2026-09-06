import java.io.*;
import java.util.*;

public class KthBeautifulString {
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

            long sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }

            return val * sign;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int t = fs.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = fs.nextInt();
            long k = fs.nextLong();

            char[] ans = new char[n];
            Arrays.fill(ans, 'a');

            for (int i = n - 2; i >= 0; i--) {
                long count = n - i - 1;

                if (k > count) {
                    k -= count;
                } else {
                    // First 'b'
                    ans[i] = 'b';

                    // Second 'b'
                    ans[n - (int) k] = 'b';

                    break;
                }
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}