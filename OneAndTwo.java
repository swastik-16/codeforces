import java.util.Scanner;

public class OneAndTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Number of elements in the sequence
			long[] a = new long[(int) n]; // Array to store the sequence
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong(); 
			}

			long totalNumberOfTwos = 0; 
			long currentNumberOfTwos = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] == 2) {
					totalNumberOfTwos++; 
				}
			}

			long ans = -1; 
			for (int i = 0; i < n; i++) {
				if (a[i] == 2) {
					currentNumberOfTwos++;
				}

				if (currentNumberOfTwos == (totalNumberOfTwos - currentNumberOfTwos)) {
					ans = i + 1;
					break;
				}
			}

			System.out.println(ans);
		}
		scanner.close();
	}
}
