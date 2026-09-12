import java.util.*;

public class Rigged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int s1 = sc.nextInt();
            int e1 = sc.nextInt();

            int maxStrength = 0;

            for (int i = 1; i < n; i++) {
                int s = sc.nextInt();
                int e = sc.nextInt();

                if (e >= e1) {
                    maxStrength = Math.max(maxStrength, s);
                }
            }

            if (maxStrength < s1) {
                System.out.println(maxStrength + 1);
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}