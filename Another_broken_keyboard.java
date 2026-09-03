import java.io.*;

public class Another_broken_keyboard {

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

        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;

            do {
                c = read();
            } while (c <= ' ');

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        int k = fs.nextInt();

        String s = fs.next();

        boolean[] allowed = new boolean[26];

        for (int i = 0; i < k; i++) {
            char c = fs.next().charAt(0);
            allowed[c - 'a'] = true;
        }

        long cnt = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {

            if (allowed[s.charAt(i) - 'a']) {
                cnt++;
            } else {
                total += cnt * (cnt + 1) / 2;
                cnt = 0;
            }
        }

        // Add the final segment
        total += cnt * (cnt + 1) / 2;

        System.out.println(total);
    }
}