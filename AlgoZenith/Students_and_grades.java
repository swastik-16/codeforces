package AlgoZenith;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Students_and_grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < a; i++){
                int x = sc.nextInt();
                set.add(x);
            }
            for (int i = 0; i < b; i++) {
                int y = sc.nextInt();
                if (set.contains(y)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                    set.add(y);
                }
            }
        }
        sc.close();
    }
}