import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int[] arr = {a, b, c};
            Arrays.sort(arr);

            int ans = Math.min(arr[1] - arr[0], arr[2] - arr[1]);

            System.out.println(ans);
        }

        sc.close();
    }
}