package Atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class Cookies_and_Greedy_471_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int curr = 0;
        int dist = 0;
        int r = 0;
        while(r<n && arr[r]<0){
            r++;
        }
        int l = r-1;
        for(int i=0;i<n;i++){
            int leftD = Integer.MAX_VALUE;
            int rightD = Integer.MAX_VALUE;
            if (l >= 0) {
                leftD = Math.abs(curr - arr[l]);
            }

            if (r < n) {
                rightD = Math.abs(curr - arr[r]);
            }
            if (leftD <= rightD) {
                dist += leftD;
                curr = arr[l];
                l--;
            } else {
                dist += rightD;
                curr = arr[r];
                r++;
            }
        }
        sc.close();
        System.out.println(dist);
    } 
}

