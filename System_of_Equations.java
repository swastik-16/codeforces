import java.util.*;
public class System_of_Equations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 0;
        for(int a=0;a*a<=n;a++){
            for(int b=0;b*b<=m;b++){
                if((a*a + b == n) && (a+b*b==m)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
