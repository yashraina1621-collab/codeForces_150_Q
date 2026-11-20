import java.util.*;
public class alternating_subsequence {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                long sum = 0;
                long max = Long.MIN_VALUE;

                int previousSign = 0;

                for (int i = 0; i < n; i++) {
                    long x = sc.nextLong();

                    int currentSign = (x > 0) ? 1 : -1;

                    if (currentSign == previousSign) {
                        max = Math.max(max, x);
                    } else {
                        if (previousSign != 0) {
                            sum += max;
                        }

                        max = x;
                        previousSign = currentSign;
                    }
                }

                sum += max;

                System.out.println(sum);
            }

        }
    }


