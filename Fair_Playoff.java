import java.util.*;
public class Fair_Playoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int FMax = Math.max(a,Math.max(Math.max(b,c),d));
            int Smax = 0;
            if(FMax== a){
                Smax = Math.max(Math.max(b,c),d);
            }else if(FMax == b){
                Smax = Math.max(Math.max(a,c),d);
            }else if(FMax == c){
                Smax = Math.max(Math.max(a,b),d);
            }else{
                Smax = Math.max(Math.max(a,b),c);
            }
            int indiMax1 = Math.max(a,b);
            int indiMax2 = Math.max(c,d);
            int Max1,Max2 = 0;
            if(indiMax1>indiMax2){
                Max1 = indiMax1;
                Max2 = indiMax2;
            }else{
                Max1 = indiMax2;
                Max2 = indiMax1;
            }
            if(FMax == Max1 && Smax == Max2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}