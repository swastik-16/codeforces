package Atcoder;
import java.io.*;

public class Truck_Driver_430_C {
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
    static long solve(String s, int A, int B) {

        int n = s.length();

        int head = -1;
        int tail = 0;

        int countA = 0;
        int countB = 0;

        // Store positions of all 'a'
        int[] aPos = new int[n];
        int aCount = 0;

        long answer = 0;

        while (head + 1 < n) {

            // Expand head
            head++;

            if (s.charAt(head) == 'a') {
                countA++;
                aPos[aCount++] = head;
            } else {
                countB++;
            }

            // Make number of b < B
            while (countB >= B) {

                if (s.charAt(tail) == 'a') {
                    countA--;
                } else {
                    countB--;
                }

                tail++;
            }

            /*
             * Need at least A 'a'.
             *
             * aPos[aCount - A] is the position of the
             * A-th 'a' from the right.
             *
             * Any l from tail to this position is valid.
             */
            if (countA >= A) {

                int lastValidLeft = aPos[aCount - A];

                answer += lastValidLeft - tail + 1;
            }
        }

        return answer;
    }

    
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        int A = fs.nextInt();
        int B = fs.nextInt();

        String s = fs.next();

        long ans = solve(s, A, B);

        System.out.println(ans);
    }
}