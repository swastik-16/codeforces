import java.util.*;

public class Alternating_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                long maxi = Long.MIN_VALUE;
                int j = i;
                while (j < n &&
                      ((arr[j] > 0 && arr[i] > 0) ||
                       (arr[j] < 0 && arr[i] < 0))) {
                    maxi = Math.max(maxi, arr[j]);
                    j++;
                }
                ans += maxi;
                i = j - 1;   
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
