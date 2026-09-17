import java.io.*;
import java.util.*;
public class LongestDistinctSubarray{
   public static int longestDistinctSubarray(int[] arr) {
    int n = arr.length;

    Map<Integer, Integer> frequency = new HashMap<>();

    int head = -1;
    int tail = 0;
    int ans = 0;

    while (tail < n) {

        while (head + 1 < n &&
               frequency.getOrDefault(arr[head + 1], 0) == 0) {

            head++;
            frequency.put(arr[head], 1);
        }

        ans = Math.max(ans, head - tail + 1);

        if (tail <= head) {
            int outgoing = arr[tail];

            frequency.put(outgoing, frequency.get(outgoing) - 1);

            if (frequency.get(outgoing) == 0) {
                frequency.remove(outgoing);
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
            int ans = longestDistinctSubarray(arr);
            System.out.println(ans);
        }
    }
}