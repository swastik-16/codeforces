import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ShortesSubarrayWithAllDistinct {
    public static int shortestSubarrayContainingAllDistinct(int[] arr) {
        int n = arr.length;

        // Count total distinct elements in the array
        HashSet<Integer> allDistinct = new HashSet<>();
        for (int x : arr) {
            allDistinct.add(x);
        }

        int required = allDistinct.size();

        Map<Integer, Integer> frequency = new HashMap<>();

        int head = -1;
        int tail = 0;
        int distinctInWindow = 0;

        int ans = Integer.MAX_VALUE;

        while (tail < n) {

            // Expand until all distinct elements are present
            while (head + 1 < n && distinctInWindow < required) {
                head++;

                int f = frequency.getOrDefault(arr[head], 0);
                frequency.put(arr[head], f + 1);

                if (f == 0) {
                    distinctInWindow++;
                }
            }

            // Window is valid
            if (distinctInWindow == required) {
                ans = Math.min(ans, head - tail + 1);
            }

            // Shrink from left
            if (tail <= head) {

                int outgoing = arr[tail];
                frequency.put(outgoing,
                            frequency.get(outgoing) - 1);

                if (frequency.get(outgoing) == 0) {
                    frequency.remove(outgoing);
                    distinctInWindow--;
                }

                tail++;
            } else {
                tail++;
                head = tail - 1;
            }
        }

        return ans;
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
    public static void main(String[] args) throws Exception{
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t -- >0){
            int n = fs.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = fs.nextInt();
            }
            int ans = shortestSubarrayContainingAllDistinct(arr);
            System.out.println(ans);
        }
    }
}