import java.util.*;

public class Number_of_divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = 1_000_000;
        int[] divisors = new int[MAX + 1];
        for (int i = 1; i <= MAX; i++) {
            for (int j = i; j <= MAX; j += i) {
                divisors[j]++;
            }
        }
        int n = sc.nextInt();
        while (n-- > 0) {
            int k = sc.nextInt();
            System.out.println(divisors[k]);
        }
        sc.close();
    }
}
