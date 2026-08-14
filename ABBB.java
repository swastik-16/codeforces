import java.util.*;
public class ABBB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            int stk = 0;
            for(int i=0;i<s.length();i++){
                if(stk!=0 && s.charAt(i)=='B'){
                    stk--;
                }
                else{
                    stk++;
                }
            }
            System.out.println(stk);
        }
        sc.close();
    }
}
