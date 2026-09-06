import java.io.*;
import java.util.*;

public class Leha_and_Function {

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

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner sc = new FastScanner();

        int n = sc.nextInt();

        long[] a = new long[n];
        Long[] indices = new Long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long[] b = new long[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        Integer[] idx = new Integer[n];

        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        Arrays.sort(a);

        // Sort indices according to B values in descending order
        Arrays.sort(idx, (i, j) -> Long.compare(b[j], b[i]));

        long[] answer = new long[n];

        // Smallest A → Largest B
        for (int i = 0; i < n; i++) {
            answer[idx[i]] = a[i];
        }

        StringBuilder sb = new StringBuilder();

        for (long value : answer) {
            sb.append(value).append(' ');
        }

        System.out.println(sb);
    }
}