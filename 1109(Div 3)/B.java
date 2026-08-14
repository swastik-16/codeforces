import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long prefixSum = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                prefixSum += x;
                long required = (long) (i + 1) * (i + 2) / 2;

                if (prefixSum < required) {
                    possible = false;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}