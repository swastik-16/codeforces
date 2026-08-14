import java.util.*;
public class Binary_removal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            int index_of_last_zero = s.lastIndexOf("00");
            int index_of_one = s.indexOf("11");
            if(index_of_one != -1 && index_of_last_zero != -1 && index_of_one < index_of_last_zero){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
