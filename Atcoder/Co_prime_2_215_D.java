package Atcoder;
import java.util.*;
import java.io.*;

public class Co_prime_2_215_D {
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

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        int m = fs.nextInt();

        boolean[] primeUsed = new boolean[100001];

        for (int i = 0; i < n; i++) {

            int x = fs.nextInt();

            // Find distinct prime factors of x
            for (int p = 2; p * p <= x; p++) {

                if (x % p == 0) {

                    primeUsed[p] = true;

                    while (x % p == 0) {
                        x /= p;
                    }
                }
            }

            if (x > 1) {
                primeUsed[x] = true;
            }
        }

        boolean[] invalid = new boolean[m + 1];

        // Sieve over forbidden prime factors
        for (int p = 2; p <= 100000; p++) {

            if (primeUsed[p]) {

                for (int multiple = p; multiple <= m; multiple += p) {
                    invalid[multiple] = true;
                }
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();

        for (int k = 1; k <= m; k++) {
            if (!invalid[k]) {
                answer.add(k);
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(answer.size()).append('\n');

        for (int x : answer) {
            sb.append(x).append('\n');
        }

        System.out.print(sb);
    }
}

