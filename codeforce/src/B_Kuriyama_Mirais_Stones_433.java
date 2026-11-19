
import java.util.*;
public class B_Kuriyama_Mirais_Stones_433 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            long[] arr = new long[n];
            long[] sorted = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sorted[i] = arr[i];
            }

            Arrays.sort(sorted);

            long[] prefix1 = new long[n + 1];
            long[] prefix2 = new long[n + 1];

            for (int i = 0; i < n; i++) {
                prefix1[i + 1] = prefix1[i] + arr[i];
                prefix2[i + 1] = prefix2[i] + sorted[i];
            }

            int m = sc.nextInt();

            while (m-- > 0) {
                int type = sc.nextInt();
                int l = sc.nextInt();
                int r = sc.nextInt();

                if (type == 1) {
                    System.out.println(prefix1[r] - prefix1[l - 1]);
                } else {
                    System.out.println(prefix2[r] - prefix2[l - 1]);
                }
            }


        }
    }


