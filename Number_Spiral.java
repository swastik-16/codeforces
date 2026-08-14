import java.util.*;
public class Number_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int t = sc.nextInt();
        while(t-- >0){
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(row>=col){
                ans = (row-1)*(row-1);
                if(row%2==1){
                    ans+= col;
                }else{
                    ans+= row + (row-col);
                }
            }else{
                ans = (col-1)*(col-1);
                if(col%2==0){
                    ans+= row;
                }else{
                    ans+= col + (col-row);
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
