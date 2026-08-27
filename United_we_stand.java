import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class United_we_stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            long max = Arrays.stream(arr).max().getAsLong();
            List<Long> b = new ArrayList<>();
            List<Long> c = new ArrayList<>();
            for(long value:arr){
                if(value!=max){
                    b.add(value);
                }else{
                    c.add(value);
                }
            }
            if(b.size() == 0){
                System.out.println(-1);
            }else{
                System.out.println(b.size()+" "+c.size());
                for(long value:b){
                    System.out.print(value+ " ");
                }
                System.out.println();
                for(long val:c){
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
