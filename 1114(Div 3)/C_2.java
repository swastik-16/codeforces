import java.io.*;
import java.util.*;

public class C_2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine().trim());

            String a = br.readLine().trim();
            String b = br.readLine().trim();

            ArrayList<Integer> evenA = new ArrayList<>();
            ArrayList<Integer> evenB = new ArrayList<>();

            ArrayList<Integer> oddA = new ArrayList<>();
            ArrayList<Integer> oddB = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    if (i % 2 == 0)
                        evenA.add(i);
                    else
                        oddA.add(i);
                }
                if (b.charAt(i) == '1') {
                    if (i % 2 == 0)
                        evenB.add(i);
                    else
                        oddB.add(i);
                }
            }
            if (evenA.size() != evenB.size()
                    || oddA.size() != oddB.size()) {
                System.out.println(-1);
                continue;
            }
            long steps = 0;
            for (int i = 0; i < evenA.size(); i++) {
                steps += Math.abs(evenA.get(i) - evenB.get(i)) / 2;
            }
            for (int i = 0; i < oddA.size(); i++) {
                steps += Math.abs(oddA.get(i) - oddB.get(i)) / 2;
            }
            System.out.println(steps);
        }
    }
}