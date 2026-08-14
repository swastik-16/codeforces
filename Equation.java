import java.util.*;
public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            int a = n+4;
            int b = 4;
            System.out.println(a);
            System.out.println(b);
        }else{
            int a = n+9;
            int b = 9;
            System.out.println(a);
            System.out.println(b);
        } 
        sc.close();
        
    }
}
