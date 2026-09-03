    import java.util.Scanner;

    public class Pasha_and_sticks {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            if(n%2!=0)System.out.println(0);
            else if(n%4==0)System.out.println(n/4-1);
            else System.out.println(n/4);
            sc.close();
        }
    }
