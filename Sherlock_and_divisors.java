import java.util.*;

public class Sherlock_and_divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> divList = new ArrayList<>();
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    divList.add(i);
                    if (i != n / i) {
                        divList.add(n / i);
                    }
                }
            }
            int cnt = 0;
            for(int i=0;i<divList.size();i++){
                if(divList.get(i)%2==0){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
