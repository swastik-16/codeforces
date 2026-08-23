import java.util.Scanner;

public class ForbiddenInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); 
		while (t-- > 0) {
			long n = scanner.nextLong(); 
			long k = scanner.nextLong();
			long x = scanner.nextLong();
			if (x != 1) {
				System.out.println("YES"); 
				System.out.println(n);
				for (int i = 1; i <= n; i++) {
					System.out.print(1 + " ");
				}
				System.out.println();
			} else {
				if (k == 1 || (k == 2 && n % 2 == 1)) {
					System.out.println("NO");
				} else {
					System.out.println("YES"); 
					if (n % 2 == 0) {
						System.out.println(n / 2);
						for (int i = 1; i <= n / 2; i++) {
							System.out.print(2 + " ");
						}
						System.out.println();
					} else {
						System.out.println((n - 3) / 2 + 1); 
						for (int i = 1; i <= (n - 3) / 2; i++) {
							System.out.print(2 + " "); 
						}
						System.out.println(3);
					}
				}
			}
		}
		scanner.close();
	}
}