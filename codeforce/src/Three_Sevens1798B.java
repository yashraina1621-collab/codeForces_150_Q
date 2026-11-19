
import java.util.*;

public class Three_Sevens1798B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int m = sc.nextInt();

            int[][] a = new int[m][];

            for (int i = 0; i < m; i++) {
                int n = sc.nextInt();
                a[i] = new int[n];

                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            HashSet<Integer> seen = new HashSet<>();
            int[] ans = new int[m];
            boolean possible = true;

            for (int i = m - 1; i >= 0; i--) {
                boolean found = false;

                for (int x : a[i]) {
                    if (!seen.contains(x)) {
                        ans[i] = x;
                        seen.add(x);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                System.out.println(-1);
            } else {
                for (int x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }


    }
}
