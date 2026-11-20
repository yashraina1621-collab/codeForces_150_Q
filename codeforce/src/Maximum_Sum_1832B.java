import java.util.*;

public class Maximum_Sum_1832B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                long[] a = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                }

                Arrays.sort(a);

                long[] prefix = new long[n + 1];

                for (int i = 0; i < n; i++) {
                    prefix[i + 1] = prefix[i] + a[i];
                }

                long total = prefix[n];
                long ans = 0;

                for (int i = 0; i <= k; i++) {

                    // Remove 2*i smallest elements
                    long smallest = prefix[2 * i];

                    // Remove k-i largest elements
                    long largest = total - prefix[n - (k - i)];

                    // Calculate remaining sum
                    long current = total - smallest - largest;

                    ans = Math.max(ans, current);
                }

                System.out.println(ans);
            }


        }
    }


