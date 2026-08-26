import java.util.Scanner;

public class ButtonGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases
		while (t-- > 0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long c = scanner.nextLong();
			if (c % 2 == 1) {
				if (b > a) {
					System.out.println("Second");
				} else {
					System.out.println("First");
				}
			} else {
				if (a > b) {
					System.out.println("First");
				} else {
					System.out.println("Second");
				}
			}
		}
		scanner.close();
	}
}