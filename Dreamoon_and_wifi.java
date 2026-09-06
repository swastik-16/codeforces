import java.util.Scanner;

public class Dreamoon_and_wifi{

    static final long MOD = 1000000007L;

    static long fact(int x) {
        long ans = 1;

        for (int i = 2; i <= x; i++) {
            ans = (ans * i) % MOD;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int heads_1 = 0;
        int heads_2 = 0;
        int tails_1 = 0;
        int tails_2 = 0;
        int places = 0;
        for(char ch:ch1){
            if(ch == '+')heads_1++;
            if(ch == '-')tails_1++;
        }
        for(char ch:ch2){
            if(ch == '+')heads_2++;
            if(ch == '-')tails_2++;
            if(ch== '?')places++;
        }
        double ways = 0;
        int rem_heads = heads_1-heads_2;
        int rem_tails = tails_1-tails_2;
        if (rem_heads<0||rem_tails<0)ways = 0;
        else ways = (fact(places)/(fact(rem_heads)*fact(rem_tails)))/Math.pow(2, places);
        System.out.printf("%.12f\n",ways);
        sc.close();
    }
}