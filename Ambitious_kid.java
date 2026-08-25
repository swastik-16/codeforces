import java.util.Scanner;

public class Ambitious_kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(Math.abs(0-arr[i]),min);
        }
        System.out.println(min);
        sc.close();
    }
}
