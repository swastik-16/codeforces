import java.io.*;

public class Derangement {

    static final long MOD = 1_000_000_007L;
    static long[] der;

    static void computeDerangements(int n) {
        der = new long[n + 1];

        
        if (n >= 1) der[1] = 0;
        if (n >= 2) der[2] = 1;

        for (int i = 3; i <= n; i++) {
            der[i] = ((long) (i - 1) * (der[i - 1] + der[i - 2])) % MOD;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine().trim());

        computeDerangements(n);

        System.out.println(der[n]);
    }
}