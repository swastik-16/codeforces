package AlgoZenith;

import java.util.Scanner;

public class UnitArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); 
		while (t-- > 0) {
			int n = scanner.nextInt(); 
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt(); 
			}

			int positiveCount = 0;
			int negativeCount = 0; 
			for (int i = 0; i < n; i++) {
				if (a[i] == 1) {
					positiveCount++;
				} else {
					negativeCount++;
				}
			}

			int operations = 0; 
			while (positiveCount < negativeCount || negativeCount % 2 == 1) {
				operations++;
				positiveCount++;
				negativeCount--; 
			}

			System.out.println(operations); 
		}
		scanner.close();
	}
}