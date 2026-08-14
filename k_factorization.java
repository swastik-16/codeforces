import java.util.*;
public class k_factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        long count = 0,i=2;
        while(n!=1){
            boolean flag = false;
            if(n%i == 0){
                while(n%i==0){
                    if(count==(k-1)){
                        flag = true;
                        break;
                    }
                    list.add(i);
                    n/=i;
                    count++;
                }
            }
            if(flag) break;
            i++;
        }
        if(count==k-1 && n>1){
            for(long num:list)
                System.out.print(num + " ");
            System.out.println(n);
        }else{
            System.out.println(-1);
        }
        sc.close();
    }
}
