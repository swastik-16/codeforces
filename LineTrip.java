import java.util.*;

public class LineTrip {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); 
		while (t-- > 0) {
			long n = scanner.nextLong(); 
			long x = scanner.nextLong(); 

			List<Long> pointsList = new ArrayList<>();
			pointsList.add(0L); 
			for (int i = 0; i < n; i++) {
				long point = scanner.nextLong(); 
				pointsList.add(point); 
			}

			pointsList.add(x); 
			n = pointsList.size();
			long maxDistanceBetweenPoints = Long.MIN_VALUE; 
			for (int i = 1; i < n; i++) {
				if (i == n - 1) {
					maxDistanceBetweenPoints = Math.max(maxDistanceBetweenPoints, 2 * (pointsList.get(i) - pointsList.get(i - 1)));
				} else {
					maxDistanceBetweenPoints = Math.max(maxDistanceBetweenPoints, pointsList.get(i) - pointsList.get(i - 1));
				}
			}
			System.out.println(maxDistanceBetweenPoints);
		}
		scanner.close();
	}
}