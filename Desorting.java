import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int min = Integer.MAX_VALUE;
            boolean alreadyUnsorted = false;
            
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    alreadyUnsorted = true;
                    break; // Exits the inner loop, moves to printing 0
                }
                int diff = arr[i + 1] - arr[i];
                int ops = (diff / 2) + 1;
                min = Math.min(min, ops);
            }
            
            if (alreadyUnsorted) {
                System.out.println(0);
            } else {
                System.out.println(min);
            }
        }
    }
}
