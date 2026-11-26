import java.util.*;
public class Line_1722D {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                String s = sc.next();

                long ans = 0;
                int[] gain = new int[n];

                for (int i = 0; i < n; i++) {

                    if (s.charAt(i) == 'L') {
                        ans += i;
                        gain[i] = n - 1 - 2 * i;
                    }
                    else {
                        ans += n - 1 - i;
                        gain[i] = 2 * i - (n - 1);
                    }
                }

                Arrays.sort(gain);

                for (int k = 0; k < n; k++) {

                    int bestGain = gain[n - 1 - k];

                    if (bestGain > 0) {
                        ans += bestGain;
                    }

                    System.out.print(ans + " ");
                }

                System.out.println();
            }

    }

}
