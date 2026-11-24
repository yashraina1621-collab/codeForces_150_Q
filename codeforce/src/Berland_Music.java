import java.util.*;
public class Berland_Music {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                HashSet<Integer> set = new HashSet<>();
                boolean found = false;

                for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();

                    if (set.contains(x)) {
                        found = true;
                    }

                    set.add(x);
                }

                System.out.println(found ? "YES" : "NO");
            }


        }
    }


