import java.util.*;
public class Number_groups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        long startIndex = (long)(k - 1) * k / 2;
        long a = 1 + 2 * startIndex;
        long l = a + 2 * (k - 1);
        long sum = k * (a + l) / 2;
        System.out.println(sum);
        sc.close();
    }
}