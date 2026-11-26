import java.util.*;
public class Similar_Pairs_1360C {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                int[] a = new int[n];

                int odd = 0;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();

                    if (a[i] % 2 != 0) {
                        odd++;
                    }
                }

                if (odd % 2 == 0) {
                    System.out.println("YES");
                } else {

                    Arrays.sort(a);

                    boolean found = false;

                    for (int i = 1; i < n; i++) {
                        if (a[i] - a[i - 1] == 1) {
                            found = true;
                            break;
                        }
                    }

                    System.out.println(found ? "YES" : "NO");
                }
            }

    }

}
