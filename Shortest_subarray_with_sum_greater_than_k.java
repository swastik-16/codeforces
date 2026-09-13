import java.util.*;

public class Shortest_subarray_with_sum_greater_than_k {

    static class MonotoneDeque {
        Deque<long[]> dq = new ArrayDeque<>();

        void append(long val, int pos) {
            // Keep prefix sums increasing
            while (!dq.isEmpty() && dq.peekLast()[0] >= val) {
                dq.pollLast();
            }

            dq.addLast(new long[]{val, pos});
        }

        int getBest(long current, long K) {
            int best = -1;

            // We need:
            // current - prefix[j] >= K
            // prefix[j] <= current - K

            while (!dq.isEmpty() && dq.peekFirst()[0] <= current - K) {
                best = (int) dq.peekFirst()[1];
                dq.pollFirst();
            }

            return best;
        }
    }

    static int shortestSubarray(long[] a, long K) {

        MonotoneDeque dq = new MonotoneDeque();

        long sum = 0;
        int ans = Integer.MAX_VALUE;

        // Prefix sum before the array starts
        dq.append(0, -1);

        for (int i = 0; i < a.length; i++) {

            sum += a[i];

            int j = dq.getBest(sum, K);

            if (j != -1) {
                ans = Math.min(ans, i - j);
            }

            dq.append(sum, i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {

        long[] a = {17, 85, 93, -45, -21};
        long K = 150;

        System.out.println(shortestSubarray(a, K));
    }
}