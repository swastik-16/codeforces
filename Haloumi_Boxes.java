import java.util.*;
import java.util.stream.IntStream;
public class Haloumi_Boxes {
    public static boolean isSortedStreams(int[] array) {
        if (array == null || array.length <= 1) return true;

        return IntStream.range(0, array.length - 1).noneMatch(i -> array[i] > array[i + 1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){   
            int x = sc.nextInt();
            int k = sc.nextInt();
            if(k>1)System.out.println("YES");
            int[] arr = new int[x];
            for(int i=0;i<x;i++){
                arr[i] = sc.nextInt();
            }  
            if(k==1){
                if(isSortedStreams(arr)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            } 
        }
        sc.close();
    }
}
