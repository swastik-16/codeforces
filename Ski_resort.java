import java.util.Scanner;

public class Ski_resort {
    public static long combinations(int n, long r) {
    if (r > n || r < 0) return 0;

    r = Math.min(r, n - r); 

    long result = 1;

    for (int i = 0; i < r; i++) {
        result = result * (n - i) / (i + 1);
    }

    return result;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            int k = sc.nextInt();
            long q = sc.nextLong();
            int cnt = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
                if(arr[i]<=q){
                    cnt++;
                }
            }
            System.out.println(combinations(cnt,q));

        }
        sc.close();
    }
}
