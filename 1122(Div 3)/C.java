import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            if(ch[0]=='1'){
                int zeroes = 0;
                for(char c:s.toCharArray()){
                    if(c=='0')zeroes++;
                }
                System.out.println(zeroes);
                continue;
            }
            int pos = 0;
            while(pos<n && s.charAt(pos)=='0'){
                pos++;
            }
            if(pos==n){
                System.out.println(0);
                continue;
            }
            int[] prev_ones = new int[n+1];
            Arrays.fill(prev_ones, 0);
            for(int i=0;i<n;i++){
                prev_ones[i+1] = prev_ones[i]+(s.charAt(i)=='1'?1:0);
            }
            int[] suffix_zeroes = new int[n+1];
            Arrays.fill(suffix_zeroes, 0);
            for(int i=n-1;i>=0;i--){
                suffix_zeroes[i] = suffix_zeroes[i+1]+(s.charAt(i)=='0'?1:0);
            }
            int min = n;
            for(int p=pos;p<=n;p++){
                int before_ones = prev_ones[p];
                int after_zeroes = suffix_zeroes[p];
                min = Math.min(min,before_ones+after_zeroes);
            }
            System.out.println(min);
        }
        sc.close();
    }
}