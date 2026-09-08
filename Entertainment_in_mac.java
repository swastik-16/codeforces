import java.util.Scanner;

public class Entertainment_in_mac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong(); // n can be up to 10^9
            String s = sc.next();

            String reversed = new StringBuilder(s).reverse().toString();

            if (reversed.compareTo(s) < 0) {
                System.out.println(reversed + s);
            } else {
                System.out.println(s);
            }
        }

        sc.close();
    }
}