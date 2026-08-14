import java.util.*;
public class Sum_of_odd_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(n%2==0){
                if(k%2==1 || k*k>n){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }else{
                if(k*k>n || k%2==0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }   
}
