package AlgoZenith;

import java.util.*;

public class Forked {
	static int[] dx = {-1, 1, -1, 1};
	static int[] dy = {-1, -1, 1, 1};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases
		while (t-- > 0) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long xKing = scanner.nextLong();
			long yKing = scanner.nextLong();
			long xQueen = scanner.nextLong();
			long yQueen = scanner.nextLong();
			Set<Pair> kingHits = new HashSet<>();
			Set<Pair> queenHits = new HashSet<>();

			
			for (int j = 0; j < 4; j++) {
				kingHits.add(new Pair(xKing + dx[j] * a, yKing + dy[j] * b));
				kingHits.add(new Pair(xKing + dx[j] * b, yKing + dy[j] * a));
				queenHits.add(new Pair(xQueen + dx[j] * a, yQueen + dy[j] * b));
				queenHits.add(new Pair(xQueen + dx[j] * b, yQueen + dy[j] * a));
			}

			int ans = 0;
			for (Pair position : kingHits) {
				if (queenHits.contains(position)) {
					ans++;
				}
			}

			System.out.println(ans);
		}
		scanner.close();
	}

	static class Pair {
		long x, y;

		Pair(long x, long y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Pair pair = (Pair) o;
			return x == pair.x && y == pair.y;
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}
	}
}
