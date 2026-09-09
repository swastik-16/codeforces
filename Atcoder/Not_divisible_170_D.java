package Atcoder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Not_divisible_170_D {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

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

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int result = 0;

            while (c > ' ') {
                result = result * 10 + (c - '0');
                c = read();
            }

            return result * sign;
        }
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = fs.nextInt();
        }
        Arrays.sort(arr);
        int[] visited = new int[arr[n-1]+1];
        for(int i=0;i<n;i++){
            for(int j=1;j<arr[j]/j;j++){
                if(arr[i]%j==0){
                    visited[j] = 1;
                    visited[arr[i]/j]=1;
                }
            }
        }
    }
}
