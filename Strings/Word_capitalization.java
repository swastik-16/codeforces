
import java.util.*;
public class Word_capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<c.length;i++){
            sb.append(c[i]);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
