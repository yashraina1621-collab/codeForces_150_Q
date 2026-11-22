import java.util.*;
public class Dominated_Subarray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int ans = Integer.MAX_VALUE;

                for (int i = 0; i < n; i++) {

                    // Check distance 1
                    if (i + 1 < n && a[i] == a[i + 1]) {
                        ans = Math.min(ans, 2);
                    }

                    // Check distance 2
                    if (i + 2 < n && a[i] == a[i + 2]) {
                        ans = Math.min(ans, 3);
                    }
                }

                System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
            }


        }
    }


