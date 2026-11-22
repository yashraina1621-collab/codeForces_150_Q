import java.util.*;
public class Friends_and_the_Restaurant_1729D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                long[] d = new long[n];

                long[] x = new long[n];
                for (int i = 0; i < n; i++) {
                    x[i] = sc.nextLong();
                }

                for (int i = 0; i < n; i++) {
                    long y = sc.nextLong();
                    d[i] = y - x[i];
                }

                Arrays.sort(d);

                int left = 0;
                int right = n - 1;
                int ans = 0;

                while (left < right) {
                    if (d[left] + d[right] >= 0) {
                        ans++;
                        left++;
                        right--;
                    } else {
                        left++;
                    }
                }

                System.out.println(ans);
            }


        }
    }


