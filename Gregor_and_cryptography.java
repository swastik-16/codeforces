import java.util.*;
public class Gregor_and_cryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int p = sc.nextInt();
            if(p%2==0){
                System.out.println(2);
                System.out.println(p);
            }else{
                System.out.println(2);
                System.out.println(p-1);
            }
        }
        sc.close();
    }
}
