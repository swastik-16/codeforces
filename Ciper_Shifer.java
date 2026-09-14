import java.util.Scanner;

public class Ciper_Shifer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder ans = new StringBuilder();

            int i = 0;

            while (i < n) {
                char ch = s.charAt(i);
                ans.append(ch);

                // Find the next occurrence of the same character
                i++;
                while (i < n && s.charAt(i) != ch) {
                    i++;
                }

                // Skip the matching character
                i++;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
