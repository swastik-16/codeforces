import java.util.Arrays;
import java.util.Scanner;

public class Pashmak_and_flowers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        int cnt_max = 0;
        int cnt_min = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long max_diff = arr[n - 1] - arr[0];
        long ways;

        if (max_diff == 0) {
            ways = (long) n * (n - 1) / 2;
        } else {

            for (long num : arr) {
                if (num == arr[0]) cnt_min++;
                if (num == arr[n - 1]) cnt_max++;
            }

            ways = (long) cnt_min * cnt_max;
        }

        System.out.println(max_diff + " " + ways);

        sc.close();
    }
}