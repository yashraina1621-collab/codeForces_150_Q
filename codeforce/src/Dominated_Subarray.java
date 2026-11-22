import java.util.*;
public class Dominated_Subarray{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int[] last = new int[n + 1];
                Arrays.fill(last, -1);

                int ans = Integer.MAX_VALUE;

                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();

                    if (last[x] != -1) {
                        ans = Math.min(ans, i - last[x] + 1);
                    }

                    last[x] = i;
                }

                System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
            }


        }
    }

