import java.util.*;
public class Subtract_Operation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long k = sc.nextLong();

                long[] a = new long[n];

                HashSet<Long> set = new HashSet<>();

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                    set.add(a[i]);
                }

                boolean found = false;

                for (int i = 0; i < n; i++) {
                    if (set.contains(a[i] + k)) {
                        found = true;
                        break;
                    }
                }

                System.out.println(found ? "YES" : "NO");
            }

        }
    }


