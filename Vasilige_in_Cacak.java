import java.util.Scanner;

public class Vasilige_in_Cacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            
            long min_sum = k * (k + 1) / 2;
            long max_sum = k * (2 * n - k + 1) / 2;
            
            if (x >= min_sum && x <= max_sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}