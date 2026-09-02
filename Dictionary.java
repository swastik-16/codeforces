import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int first = s.charAt(0) - 'a';
            int second = s.charAt(1) - 'a';
            int rank = first * 25;
            rank += second;
            if (second > first) {
                rank--;
            }
            rank++;
            System.out.println(rank);
        }
        sc.close();
    }
}