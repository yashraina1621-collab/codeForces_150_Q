import java.util.*;
public class Eating_Queries_1676E {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                int q = sc.nextInt();

                long[] a = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                }

                Arrays.sort(a);

                long[] prefix = new long[n];

                prefix[0] = a[n - 1];

                for (int i = 1; i < n; i++) {
                    prefix[i] = prefix[i - 1] + a[n - 1 - i];
                }

                while (q-- > 0) {

                    long x = sc.nextLong();

                    int low = 0;
                    int high = n - 1;
                    int ans = -1;

                    while (low <= high) {

                        int mid = low + (high - low) / 2;

                        if (prefix[mid] >= x) {
                            ans = mid + 1;
                            high = mid - 1;
                        } else {
                            low = mid + 1;
                        }
                    }

                    System.out.println(ans);
                }
            }


    }

}
