import java.io.*;

public class ExpressionSolver {

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
    }

    static long[] evaluate(String s) {
        long coefficient = 0;
        long constant = 0;

        int sign = 1;
        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == '+') {
                sign = 1;
                i++;
                continue;
            }

            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
                continue;
            }

            if (s.charAt(i) == 'X') {
                coefficient += sign;
                sign = 1;
                i++;
            } else {
                long number = 0;

                while (i < s.length()
                        && Character.isDigit(s.charAt(i))) {

                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }

                constant += sign * number;
                sign = 1;
            }
        }

        return new long[]{coefficient, constant};
    }

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();

        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            String expression = sc.next();

            int equalIndex = expression.indexOf('=');

            String left = expression.substring(0, equalIndex);
            String right = expression.substring(equalIndex + 1);

            long[] L = evaluate(left);
            long[] R = evaluate(right);

            long coefficientX = L[0] - R[0];
            long constant = R[1] - L[1];

            long x = constant / coefficientX;

            output.append(x).append('\n');
        }

        System.out.print(output);
    }
}