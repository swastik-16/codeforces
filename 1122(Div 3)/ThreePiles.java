import java.util.*;

public class ThreePiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long ans;
            if (a >= b) {
                ans = (a - b) + c;
            } else {
                long diff = b - a;
                ans = Math.max(diff, c - diff);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}