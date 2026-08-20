import java.util.Scanner;

public class Goals_of_victory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            int n = sc.nextInt();
            int[] arr = new int[n-1];
            for(int i=0;i<n-1;i++){
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for(int num:arr){
                sum+=num;
            }    
        System.out.println(-sum);
        }
        sc.close();
    }
}
