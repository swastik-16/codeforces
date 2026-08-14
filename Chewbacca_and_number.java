import java.util.*;
public class Chewbacca_and_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            
            // Special case: first digit should not become 0
            if (i == 0 && digit == 9) {
                result.append(9);
            } else {
                int inverted = 9 - digit;
                if (inverted < digit) {
                    result.append(inverted);
                } else {
                    result.append(digit);
                }
            }
        }
        System.out.println(result.toString());

        sc.close();
    }
}
