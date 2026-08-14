import java.util.*;
public class Summing_N_series {
    public static void main(String[] args) {
        int mod = (int)1e9+7;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long ans = ((n%mod)*(n%mod))%mod;
            System.out.println(ans);
        }
        sc.close();
    }
}
