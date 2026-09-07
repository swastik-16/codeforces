import java.io.*;
import java.util.*;

public class T_prime {
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

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
    static final int MAX = 1_000_000;
    static boolean[] isPrime = new boolean[MAX + 1];

    static void sieve() {
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        sieve();

        int n = fs.nextInt();
        StringBuilder ans = new StringBuilder();

        while (n-- > 0) {
            long num = fs.nextLong();

            long root = (long) Math.sqrt(num);

            // Check whether num is a perfect square
            if (root * root == num && isPrime[(int) root]) {
                ans.append("YES\n");
            } else {
                ans.append("NO\n");
            }
        }

        System.out.print(ans);
    }

    
}