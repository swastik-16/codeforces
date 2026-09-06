import java.io.*;

public class SubstringRemoval {

    static final long MOD = 998244353L;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();

        // Count same characters from the beginning
        long left = 1;
        while (left < n && s.charAt((int) left) == s.charAt(0)) {
            left++;
        }

        // Count same characters from the end
        long right = 1;
        while (right < n && s.charAt(n - 1 - (int) right) == s.charAt(n - 1)) {
            right++;
        }

        long answer;

        if (s.charAt(0) == s.charAt(n - 1)) {
            answer = ((left + 1) * (right + 1)) % MOD;
        } else {
            answer = (left + right + 1) % MOD;
        }

        System.out.println(answer);
    }
}