import java.io.*;
import java.util.*;

public class MedianofArray {

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

            boolean negative = false;
            if (c == '-') {
                negative = true;
                c = read();
            }

            long result = 0;
            while (c > ' ') {
                result = result * 10 + (c - '0');
                c = read();
            }

            return negative ? -result : result;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int t = fs.nextInt();

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = fs.nextInt();

            long[] v = new long[n];

            for (int i = 0; i < n; i++) {
                v[i] = fs.nextLong();
            }

            Arrays.sort(v);

            int idx = (n - 1) / 2;
            int cnt = 0;

            for (int i = idx; i < n && v[i] == v[idx]; i++) {
                cnt++;
            }

            sb.append(cnt).append('\n');
        }

        System.out.print(sb);
    }

}