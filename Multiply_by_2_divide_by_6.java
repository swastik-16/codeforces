import java.util.*;
public class Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- >0){
            long n = sc.nextLong();
            long power2 = 0 , power3 = 0;
            while(n%2==0){
                power2++;
                n=n/2;
            }
            while(n%3==0){
                power3++;
                n=n/3;
            }
            if(n>1 || power2>power3){
                System.out.println("-1");
            }
            else{
                System.out.println((power3-power2)+power3);
            }
        }
        sc.close();
    }
}
