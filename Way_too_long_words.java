import java.util.Scanner;

public class Way_too_long_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            String s = sc.next();
            int n = s.length();
            if(n>10){
                System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(n-1));
            }else{
                System.out.println(s);
            }
        }
        sc.close();
    }
}
