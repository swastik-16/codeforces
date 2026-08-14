import java.util.*;
public class GCD {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a,a); 
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int denominator = gcd(a,b);
        int multiple = lcm(a,b);
        System.out.println(denominator);
        System.out.println(multiple);
        sc.close();
    }
}
