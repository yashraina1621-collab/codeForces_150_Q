import java.util.*;

public class Delete_Two_Elements {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                long[] a = new long[n];
                long sum = 0;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                    sum += a[i];
                }

                long total = 2 * sum;
                long ans = 0;

                if (total % n == 0) {
                    long target = total / n;

                    HashMap<Long, Long> map = new HashMap<>();

                    for (int i = 0; i < n; i++) {
                        long need = target - a[i];

                        ans += map.getOrDefault(need, 0L);

                        map.put(a[i], map.getOrDefault(a[i], 0L) + 1);
                    }
                }

                System.out.println(ans);
            }

        }
    }


