import java.util.*;

public class Palindrome_reorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'A']++; 
        }
        int oddCount = 0;
        int oddChar = -1;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                oddCount++;
                oddChar = i;
            }
        }

        if (oddCount > 1) {
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder firstHalf = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                firstHalf.append((char) ('A' + i));
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(firstHalf);

        // Middle character (only once)
        if (oddChar != -1) {
            result.append((char) ('A' + oddChar));
        }

        // Second half
        result.append(firstHalf.reverse());

        System.out.println(result.toString());
    }
}
