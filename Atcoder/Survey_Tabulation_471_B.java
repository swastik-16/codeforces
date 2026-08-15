package Atcoder;

import java.util.*;

public class Survey_Tabulation_471_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = sc.next().toLowerCase();
            hm.put(s, hm.getOrDefault(s, 0)+1);
        }
        int max = 0;
        for(int num:hm.values()){
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
