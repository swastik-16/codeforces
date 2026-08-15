package Atcoder;

import java.util.Scanner;

public class NineOrNein_471_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A+B==9){
            System.out.println("Nine");
        }else if(A-B == 9){
            System.out.println("Nine");
        }else if(A*B == 9){
            System.out.println("Nine");
        }else if(A%B==0 && A/B == 9){
            System.out.println("Nine");
        }else{
            System.out.println("Nein");
        }
        sc.close();
    }
}
