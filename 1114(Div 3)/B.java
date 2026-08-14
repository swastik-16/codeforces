import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int blocks = 1;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    blocks++;
                }
            }

            int ans = blocks;
            for (int i = 1; i < n - 1; i++) {
                int newBlocks = blocks;
                if (s.charAt(i - 1) != s.charAt(i)) {
                    newBlocks--;
                }
                if (s.charAt(i) != s.charAt(i + 1)) {
                    newBlocks--;
                }
                if (s.charAt(i - 1) != s.charAt(i + 1)) {
                    newBlocks++;
                }

                ans = Math.min(ans, newBlocks);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}