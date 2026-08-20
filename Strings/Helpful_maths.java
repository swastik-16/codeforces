import java.util.*;
public class Helpful_maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder r = new StringBuilder();
        for(int i=0;i<s.length();i+=2){
            r.append(s.charAt(i));
        }
        String s1 = r.toString();
        char[] c = s1.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<c.length-1;i++){
            System.out.print(c[i]+"+");
        }
        System.out.println(c[c.length-1]);
        sc.close();
        
    }
}
