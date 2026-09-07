import java.util.*;

public class SegmentedSieve {

    // Simple sieve to generate primes up to n
    static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    static List<Integer> segmentedSieve(int L, int R) {

        // Phase 1: Find base primes up to sqrt(R)
        int limit = (int) Math.sqrt(R);
        List<Integer> basePrimes = sieve(limit);

        // Phase 2: Mark primes in range [L, R]
        boolean[] isPrime = new boolean[R - L + 1];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime
        if (L == 0) {
            isPrime[0] = false;
            if (R >= 1) isPrime[1] = false;
        } else if (L == 1) {
            isPrime[0] = false;
        }

        for (int prime : basePrimes) {

            // First multiple of prime >= L
            int ceilLByP = (L + prime - 1) / prime;
            int curMul = prime * ceilLByP;

            // Do not mark the prime itself
            curMul = Math.max(prime * prime, curMul);

            while (curMul <= R) {
                isPrime[curMul - L] = false;
                curMul += prime;
            }
        }

        List<Integer> primesLToR = new ArrayList<>();

        for (int i = 0; i <= R - L; i++) {
            if (isPrime[i]) {
                primesLToR.add(i + L);
            }
        }

        return primesLToR;
    }

    public static void main(String[] args) {
        int L = 10;
        int R = 30;

        List<Integer> primes = segmentedSieve(L, R);

        System.out.println(primes);
    }
}