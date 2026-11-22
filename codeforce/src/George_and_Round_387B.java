import java.util.*;
public class George_and_Round_387B {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            int i = 0;
            int j = 0;
            int missing = 0;

            while (i < n && j < m) {

                if (b[j] >= a[i]) {
                    i++;
                    j++;
                } else {
                    j++;
                }
            }

            missing = n - i;

            int extra = Math.max(0, n - m);

            System.out.println(Math.max(missing, extra));


        }
    }



