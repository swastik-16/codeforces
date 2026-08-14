import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[26];
            for(int i=0;i<n;i++){
                freq[s.charAt(i)-'a']++;
            }
            int oddCount = 0;
            for(int f:freq){
                if(f%2!=0)oddCount++;
            }
            if(k>=oddCount-1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
