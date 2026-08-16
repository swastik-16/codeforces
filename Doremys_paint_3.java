import java.util.HashMap;
import java.util.Scanner;

public class Doremys_paint_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            if (freq.size() == 1) {
                System.out.println("Yes");
            } 
            else if (freq.size() == 2) {
                int[] counts = new int[2];
                int idx = 0;

                for (int count : freq.values()) {
                    counts[idx++] = count;
                }

                if (Math.abs(counts[0] - counts[1]) <= 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } 
            else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
