import java.io.*;

public class Even_but_not_even {

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
            int c;

            do {
                c = read();
            } while (c <= ' ');

            StringBuilder sb = new StringBuilder();

            while (c > ' ') {
                sb.append((char)c);
                c = read();
            }

            return sb.toString();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {

            int n = fs.nextInt();
            String s = fs.next();

            int lastOdd = -1;
            int oddCount = 0;

            // Find last odd digit and count odd digits
            for (int i = 0; i < n; i++) {
                if ((s.charAt(i) - '0') % 2 == 1) {
                    lastOdd = i;
                    oddCount++;
                }
            }

            if (oddCount < 2) {
                System.out.println(-1);
                continue;
            }

            StringBuilder ans = new StringBuilder();

            // Odd number of odd digits -> remove one odd digit
            int remove = -1;

            if (oddCount % 2 == 1) {

                // If first digit is odd, remove the SECOND odd digit
                // to avoid leading zero.
                int found = 0;

                for (int i = 0; i <= lastOdd; i++) {
                    if ((s.charAt(i) - '0') % 2 == 1) {
                        found++;

                        if ((s.charAt(0) - '0') % 2 == 1) {
                            if (found == 2) {
                                remove = i;
                                break;
                            }
                        } else {
                            if (found == 1) {
                                remove = i;
                                break;
                            }
                        }
                    }
                }
            }

            // Build answer
            for (int i = 0; i <= lastOdd; i++) {
                if (i != remove) {
                    ans.append(s.charAt(i));
                }
            }

            System.out.println(ans);
        }
    }
}