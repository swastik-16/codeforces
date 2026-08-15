import java.util.Scanner;

public class zero_one_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            String s = sc.next();
            int cnt_zero = 0;
            int cnt_one = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    cnt_zero++;
                }else{
                    cnt_one++;
                }
            }
            if(cnt_one == 0 || cnt_zero == 0)System.out.println("NET");
            if(cnt_one!=0 && cnt_zero!=0){
                if(cnt_one % 2 ==0 || cnt_zero % 2 == 0)System.out.println("DA");
            }
        }
        sc.close();
    }
}
