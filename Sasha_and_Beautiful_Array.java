import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Sasha_and_Beautiful_Array {
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
    public static void main(String[] args) throws Exception{
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t-- >0){
            int n = fs.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = fs.nextLong();
            }
            Arrays.sort(arr);
            int sum = 0;
            for(int i=1;i<arr.length;i++){
                sum+= arr[i]-arr[i-1];
            }
            System.out.println(sum);
        }
    }
}
