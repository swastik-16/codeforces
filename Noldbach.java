import java.util.*;
public class Noldbach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> prime = new ArrayList<>();
        boolean primes[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }
        primes[0] = primes[1] = false;
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                prime.add(i);
                for (int j = 2 * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        int cnt = 0;
        for(int i=0;i<prime.size();i++){
            if(i+1<prime.size()){
                int num = 1+prime.get(i)+prime.get(i+1);
                if(isPrime(num) && num<=n)cnt++;
            }
        }
        if(cnt>=k){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
