import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long s = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();

            if (s <= k)System.out.println(Math.max(0, s - m % k));
            else System.out.println(((m % (2 * k)) < k) ? s - m % k : k - m % k);
        }

        sc.close();
    }
}
