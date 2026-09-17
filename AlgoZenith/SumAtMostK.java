import java.io.*;

public class SumAtMostK {

    static long sumAtMostK(int[] arr, int k) {

    int n = arr.length;

    int head = -1;
    int tail = 0;

    long sum = 0;
    long answer = 0;

    while (tail < n) {

        // Expand while sum <= k
        while (head + 1 < n && sum + arr[head + 1] <= k) {

            head++;
            sum += arr[head];
        }
        answer += head - tail + 1;

        // Remove arr[tail]
        if (tail <= head) {
            sum -= arr[tail];
            tail++;
        } else {
            tail++;
            head = tail - 1;
        }
    }

    return answer;
}

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
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        int t = fs.nextInt();

        while (t-- > 0) {

            int n = fs.nextInt();
            int k = fs.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            long ans = sumAtMostK(arr, k);

            System.out.println(ans);
        }
    }
}