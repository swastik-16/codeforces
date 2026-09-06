import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long ans = 1;
        for(int i=1;i<a;i++){
            ans+= 12*i;
        }
        System.out.println(ans);
        sc.close();
    }
}