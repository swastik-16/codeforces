import java.util.Scanner;

public class How_much_does_Daytona_cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- >0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int cnt = 0;
            for(int i=0;i<n;i++){
                if(arr[i]==k){
                    cnt++;
                }
            }
            if(cnt>=1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
