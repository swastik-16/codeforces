import java.util.*;

public class Two_teams_composing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            HashMap<Long, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            for(long num: arr){
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
            int diff = hm.size();
            int max = 0;
            for(int freq:hm.values()){
                max = Math.max(max,freq);
            }
            if(max==diff){
                System.out.println(max-1);
            }else if(max>diff){
                System.out.println(Math.min(max-1,diff));
            }else{
                System.out.println(Math.min(max,diff-1));
            }
        }
        sc.close();
    }
}
