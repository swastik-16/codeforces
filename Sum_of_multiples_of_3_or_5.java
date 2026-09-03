import java.io.IOException;
import java.io.InputStream;

public class Sum_of_multiples_of_3_or_5 {

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

    static long sumOfMultiples(long n, long x) {
        long k = (n - 1) / x;

        return x * k * (k + 1) / 2;
    }

    public static void main(String[] args) throws Exception {

        FastScanner sc = new FastScanner();
        int t = sc.nextInt();

        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            long n = sc.nextLong();

            long sum = sumOfMultiples(n, 3)+ sumOfMultiples(n, 5)- sumOfMultiples(n, 15);

            output.append(sum).append('\n');
        }

        System.out.print(output);
    }
}