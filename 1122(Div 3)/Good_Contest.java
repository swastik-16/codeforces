import java.util.*;
public class Good_Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            int min = Integer.MAX_VALUE;
            int n = sc.nextInt();
            int[] arr = new int[3];
            for(int i=0;i<3;i++){
                arr[i] = sc.nextInt();
            }
            for(int num:arr){
                min = Math.min(num,min);
            }
            System.out.println(n-min);
        }
        sc.close();
    }
}
