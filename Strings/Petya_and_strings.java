
import java.util.*;
public class Petya_and_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String t = sc.next().toLowerCase();
        if(s.compareTo(t)<0){
            System.out.println("-1");
        }
        else if(s.compareTo(t)>0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        sc.close();
    }

}
