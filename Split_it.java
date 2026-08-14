import java.util.*;
public class Split_it {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int l = 0, r = n-1;
        int cnt = 0;
        if(n<2*k+1){
            System.out.println("NO");
        }
        else{
            while(l<r && s.charAt(l)==s.charAt(r)){
                    cnt++;
                    l++;
                    r--;
                }
            if(cnt>=k){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    sc.close();
 }
}