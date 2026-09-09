package Atcoder;

import java.io.*;

public class Co_prime_177_E {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

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

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int result = 0;

            while (c > ' ') {
                result = result * 10 + (c - '0');
                c = read();
            }

            return result * sign;
        }
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        int n = fs.nextInt();

        int[] arr = new int[n];
        int overallGcd = 0;

        int max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = fs.nextInt();
            overallGcd = gcd(overallGcd, arr[i]);
            max = Math.max(max, arr[i]);
        }

        if (overallGcd != 1) {
            System.out.println("not coprime");
            return;
        }

        boolean[] used = new boolean[max + 1];
        boolean pairwise = true;

        for (int x : arr) {
            int temp = x;

            for (int p = 2; p <= temp / p; p++) {

                if (temp % p == 0) {
                    if (used[p]) {
                        pairwise = false;
                    }

                    used[p] = true;

                    // Remove all occurrences of p.
                    while (temp % p == 0) {
                        temp /= p;
                    }
                }
            }

            // Remaining number is a prime factor.
            if (temp > 1) {
                if (used[temp]) {
                    pairwise = false;
                }

                used[temp] = true;
            }
        }

        if (pairwise) {
            System.out.println("pairwise coprime");
        } else {
            System.out.println("setwise coprime");
        }
    }
}