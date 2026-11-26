import java.util.*;
public class Negatives_and_Positives_1791E {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                long sum = 0;
                int negative = 0;
                long min = Long.MAX_VALUE;

                for (int i = 0; i < n; i++) {

                    long x = sc.nextLong();

                    if (x < 0) {
                        negative++;
                    }

                    x = Math.abs(x);

                    sum += x;

                    min = Math.min(min, x);
                }

                if (negative % 2 != 0) {
                    sum -= 2 * min;
                }

                System.out.println(sum);
            }


    }

}
