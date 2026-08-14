import java.util.*;
public class Strange_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong();
            long k = sc.nextLong();
            long ans = 0;
            while(x%2==0){
                ans++;
                x/=2;
            }

            for(long i=3;i*i<=x;i+=2){
                while(x%i==0){
                    ans++;
                    x/=i;
                }
            }
            if(x>1){
                ans++;
            }
            if(ans>=k){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}
