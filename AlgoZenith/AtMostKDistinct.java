
import java.io.*;
import java.util.*;
public class AtMostKDistinct{
    public static long countAtMostKDistinct(int[] arr, int k) {
            if (k <= 0) {
                return 0;
            }

            int n = arr.length;
            Map<Integer, Integer> frequency = new HashMap<>();

            int head = -1;
            int tail = 0;
            int distinctCount = 0;
            long answer = 0;

            while (tail < n) {
                while (head + 1 < n) {
                    int nextValue = arr[head + 1];
                    boolean isNew = !frequency.containsKey(nextValue);

                    if (distinctCount + (isNew ? 1 : 0) > k) {
                        break;
                    }

                    head++;
                    frequency.put(arr[head], frequency.getOrDefault(arr[head], 0) + 1);

                    if (isNew) {
                        distinctCount++;
                    }
                }

                answer += (head - tail + 1);

                if (tail <= head) {
                    int outgoing = arr[tail];
                    frequency.put(outgoing, frequency.get(outgoing) - 1);

                    if (frequency.get(outgoing) == 0) {
                        frequency.remove(outgoing);
                        distinctCount--;
                    }

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
    public static void main(String[] args) throws Exception{
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t -- >0){
            int n = fs.nextInt();
            int k = fs.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = fs.nextInt();
            }
            long ans = countAtMostKDistinct(arr,k);
            System.out.println(ans);
        }
    }
}