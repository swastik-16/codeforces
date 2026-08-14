import java.util.*;
public class Magic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ok = true;
        int i = 0;
        while(i<s.length()){
            if((i+2<s.length()) && s.substring(i,i+3).equals("144")){
                i+=3;
            }else if((i+1<s.length()) && s.substring(i, i+2).equals("14")){
                i+=2;
            }else if(s.charAt(i)=='1'){
                i+=1;
            }else{
                ok = false;
                break;
            }
        }
        if(ok){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        sc.close();
    }
}
