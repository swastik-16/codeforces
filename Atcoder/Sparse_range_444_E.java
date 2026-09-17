package Atcoder;

import java.io.*;
import java.util.*;

public class Sparse_range_444_E {

    static class FastScanner {

        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0) {
                    return -1;
                }
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num * sign;
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

        String next() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ');

            StringBuilder sb = new StringBuilder();

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }
    }

    public static long cntWithDifferenceAtLeastD(long[] arr, long D) {

        int n = arr.length;

        int head = -1;
        int tail = 0;

        long ans = 0;

        TreeSet<Long> set = new TreeSet<>();

        while (tail < n) {

            while (head + 1 < n) {

                long x = arr[head + 1];

                Long lower = set.floor(x);
                Long higher = set.ceiling(x);

                boolean valid = true;

                if (lower != null && x - lower < D) {
                    valid = false;
                }

                if (higher != null && higher - x < D) {
                    valid = false;
                }

                if (!valid) {
                    break;
                }

                set.add(x);
                head++;
            }

            ans += head - tail + 1;

            if (tail <= head) {

                set.remove(arr[tail]);

                tail++;

            } else {

                tail++;
                head = tail - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        long d = fs.nextLong();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextLong();
        }

        long cnt = cntWithDifferenceAtLeastD(arr, d);

        System.out.println(cnt);
    }
}