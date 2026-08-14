import java.util.*;

public class Alyona_and_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long[] a = new long[5];
        long[] b = new long[5];

        // Count remainders for n
        for (int i = 0; i < 5; i++) {
            a[i] = n / 5;
        }
        for (int i = 1; i <= n % 5; i++) {
            a[i]++;
        }

        // Count remainders for m
        for (int i = 0; i < 5; i++) {
            b[i] = m / 5;
        }
        for (int i = 1; i <= m % 5; i++) {
            b[i]++;
        }

        long ans = 0;
        ans += a[0] * b[0];
        ans += a[1] * b[4];
        ans += a[2] * b[3];
        ans += a[3] * b[2];
        ans += a[4] * b[1];

        System.out.println(ans);
        sc.close();
    }
}