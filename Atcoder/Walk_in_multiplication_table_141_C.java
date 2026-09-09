package Atcoder;

import java.io.*;

public class Walk_in_multiplication_table_141_C {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        long n = Long.parseLong(br.readLine());

        long ans = Long.MAX_VALUE;

        for (long i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                long j = n / i;
                ans = Math.min(ans, i + j - 2);
            }
        }

        System.out.println(ans);
    }
}