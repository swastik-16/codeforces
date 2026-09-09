import java.io.*;

public class Not_divisible_170_D {

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
        int MAX = 1_000_000;

        int[] freq = new int[MAX + 1];
        int maxValue = 0;

        for (int i = 0; i < n; i++) {
            int x = fs.nextInt();
            freq[x]++;
            maxValue = Math.max(maxValue, x);
        }

        boolean[] invalid = new boolean[MAX + 1];

        for (int x = 1; x <= maxValue; x++) {

            if (freq[x] == 0) continue;

            // If x occurs multiple times, another x divides it
            if (freq[x] > 1) {
                invalid[x] = true;
            }

            // Mark all larger multiples of x as invalid
            for (int multiple = 2 * x;
                 multiple <= maxValue;
                 multiple += x) {

                if (freq[multiple] > 0) {
                    invalid[multiple] = true;
                }
            }
        }

        int answer = 0;

        for (int x = 1; x <= maxValue; x++) {
            if (freq[x] == 1 && !invalid[x]) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}