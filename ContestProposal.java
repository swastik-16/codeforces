import java.util.*;

public class ContestProposal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            int i = n - 1;
            int j = n - 1;
            int ans = 0;

            while (i >= 0 && j >= 0) {

                if (a[i] <= b[j]) {
                    // a[i] can satisfy b[j]
                    i--;
                    j--;
                } else {
                    // a[i] is too difficult, so it must be removed
                    ans++;
                    i--;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}