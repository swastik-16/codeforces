package AlgoZenith;

import java.util.Scanner;

public class ThreeIndices {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long t = scanner.nextLong(); 
		while (t-- > 0) {
			long n = scanner.nextLong(); 
			long[] a = new long[(int) n];
			for (int i = 0; i < n; i++) { 
				a[i] = scanner.nextLong();
			}

			boolean flag = false;
			for (int j = 1; j < n - 1; j++) { 
				int i = -1;
				int k = -1;
				for (int left = 0; left < j; left++) { 
					if (a[left] < a[j]) {
						i = left;
						break;
					}
				}
				for (int right = j + 1; right < n; right++) { 
					if (a[right] < a[j]) {
						k = right;
						break;
					}
				}
				if (i != -1 && k != -1) {
					System.out.println("YES");
					System.out.println((i + 1) + " " + (j + 1) + " " + (k + 1));
					flag = true; 
					break;
				}
			}
			if (!flag) {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}
