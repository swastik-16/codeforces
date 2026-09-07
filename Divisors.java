import java.util.*;

public class Divisors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        ArrayList<Long> divisors = new ArrayList<>();

        for (long i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        Collections.sort(divisors);

        for (long divisor : divisors) {
            System.out.println(divisor);
        }

        sc.close();
    }
}