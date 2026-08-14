import java.util.*;

public class Diff_divisors {
    
    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();

            long a = 0, b = 0;
            for (long i = x + 1; ; i++) {
                if (isPrime(i)) {
                    a = i;
                    break;
                }
            }

            // find first prime >= x+a
            for (long i = x + a; ; i++) {
                if (isPrime(i)) {
                    b = i;
                    break;
                }
            }
            System.out.println(a * b);
        }
        sc.close();
    }
}
