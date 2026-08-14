import java.util.*;

public class Sieve_of_Eranthesis {
    public static void sieve(int n) {
        boolean primes[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }
        primes[0] = primes[1] = false;
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.println(i);
                for (int j = 2 * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sieve(n);
        }
        sc.close();
    }
}
