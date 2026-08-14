import java.util.*;

public class Nastia_and_Nearly_Good_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (b == 1) {
                System.out.println("NO");
            } else if (b == 2) {
                System.out.println("YES");
                System.out.println(a + " " + (3 * a) + " " + (4 * a));
            } else {
                System.out.println("YES");
                System.out.println(a + " " + (a * (b - 1)) + " " + (a * b));
            }
        }
        sc.close();
    }
}