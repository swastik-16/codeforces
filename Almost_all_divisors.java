import java.util.*;

public class Almost_all_divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextLong());
            }
            Collections.sort(arr);
            long num = arr.get(0) * arr.get(n - 1);
            ArrayList<Long> divList = new ArrayList<>();
            for (long i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    divList.add(i);
                    if (i != num / i) {
                        divList.add(num / i);
                    }
                }
            }
            Collections.sort(divList);
            if (divList.equals(arr)) {
                System.out.println(num);
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
