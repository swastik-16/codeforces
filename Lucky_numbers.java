import java.util.Scanner;

public class Lucky_numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long answer = (1L << (n + 1)) - 2;

        System.out.println(answer);

        sc.close();
    }
}