import java.io.*;
public class ColorIt{
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

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    static long powerMod(long base, long exponent, long modulus) {
        long result = 1;
        base %= modulus;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % modulus;
            }

            base = (base * base) % modulus;
            exponent >>= 1;
        }

        return result;
    }
    public static void main(String[] args) throws Exception{
        FastScanner sc = new FastScanner();
        int T = sc.nextInt();
        while(T -- >0){
            long mod = 1000_000_007;
            long n = sc.nextLong();
            long k = sc.nextLong();
            long ans = (powerMod(k,1,mod)*powerMod(k-1,n-1,mod))%mod;
            System.out.println(ans);
        }
    }
}