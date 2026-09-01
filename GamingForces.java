import java.util.*;

public class GamingForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int cntOnes = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x == 1) {
                    cntOnes++;
                }
            }

            int ops = (n - cntOnes) + (cntOnes + 1) / 2;

            System.out.println(ops);
        }

        sc.close();
    }
}