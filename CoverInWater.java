import java.util.Scanner;

public class CoverInWater {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); 
		while (t-- > 0) {
			int n = scanner.nextInt(); 
			String s = scanner.next(); 

			boolean continuousThreeEmptyCells = false;
			int totalCountOfEmptyCells = 0;

			for (int i = 0; i < n; i++) {
				if (s.charAt(i) == '.' && i + 1 < n && s.charAt(i + 1) == '.' && i + 2 < n && s.charAt(i + 2) == '.') {
					continuousThreeEmptyCells = true;
					break;
				}
				if (s.charAt(i) == '.') {
					totalCountOfEmptyCells++;
				}
			}
			if (continuousThreeEmptyCells) {
				System.out.println(2);
			} else {
				System.out.println(totalCountOfEmptyCells);
			}
		}
		scanner.close();
	}
}