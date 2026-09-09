import java.io.IOException;
import java.io.InputStream;

public class We_got_everything_covered {
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
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();

            StringBuilder sb = new StringBuilder();

            // Create the first k letters
            for (int i = 0; i < k; i++) {
                sb.append((char) ('a' + i));
            }

            // Store one complete block
            String block = sb.toString();

            // Repeat the block n times
            for (int i = 1; i < n; i++) {
                sb.append(block);
            }

            System.out.println(sb);
        }
    }
}