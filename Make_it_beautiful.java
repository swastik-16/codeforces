import java.util.Arrays;
import java.util.Scanner;

public class Make_it_beautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min = arr[0];
            int max = arr[n-1];
            if(min==max){
                System.out.println("No");
            }else{
                System.out.println("Yes");
                System.out.print(max + " ");
				for (int i = 0; i < n - 1; i++) {
					System.out.print(arr[i] + " ");
				}
            }
        }
        sc.close();
    }
}
