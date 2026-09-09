import java.io.IOException;
import java.io.InputStream;

public class EhAb_AnD_gCd {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a,a); 
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
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
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        while(t -- >0){
            long x = fs.nextLong();
            System.out.println(1+" "+(x-1));
        }
    }
}
