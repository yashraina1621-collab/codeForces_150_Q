
import java.util.*;
public class Good_Subarrays_1398C {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                HashMap<Integer, Integer> map = new HashMap<>();

                int prefix = 0;
                long ans = 0;

                map.put(0, 1);

                for (int i = 0; i < n; i++) {
                    int digit = s.charAt(i) - '0';

                    prefix += digit - 1;

                    ans += map.getOrDefault(prefix, 0);

                    map.put(prefix, map.getOrDefault(prefix, 0) + 1);
                }

                System.out.println(ans);
            }

            sc.close();
        }
    }


