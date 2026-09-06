import java.io.*;

public class RubiksCubeColoring {

    static final long MOD = 1_000_000_007L;

    static long power(long base, long exponent) {
        long result = 1;

        base %= MOD;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exponent >>= 1;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int k = Integer.parseInt(br.readLine().trim());

        long exponent = (1L << k) - 2;

        long answer = (6 * power(4, exponent)) % MOD;

        System.out.println(answer);
    }
}