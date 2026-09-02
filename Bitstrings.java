import java.util.Scanner;

public class Bitstrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long mod = 1_000_000_007;
        long result = 1;
        long base = 2;

        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * base) % mod;
            }

            base = (base * base) % mod;
            n /= 2;
        }

        System.out.println(result);
        sc.close();
    }
}