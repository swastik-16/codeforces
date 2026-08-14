import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int maxLen = 0;
            int current = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '#') {
                    current++;
                    maxLen = Math.max(maxLen, current);
                } else {
                    current = 0;
                }
            }

            int ans = (maxLen + 1) / 2;

            System.out.println(ans);
        }

        sc.close();
    }
}