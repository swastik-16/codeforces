import java.util.*;
public class Nirvana {
    static int findProduct(int n){
        int product = 1;
        while(n>0){
            product *= n%10;
            n /= 10;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        n++;
        long p = 1;
        while(n!=0){
            ans = Math.max(ans,findProduct((int)(n*p-1)));
            n/=10;
            p*=10;
        }
        System.out.println(ans);
        sc.close();
    }
}
