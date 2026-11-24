import java.util.*;
public class Same_Differences_1520D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                HashMap<Integer, Long> map = new HashMap<>();
                long count = 0;

                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();

                    int key = a - i;

                    count += map.getOrDefault(key, 0L);

                    map.put(key, map.getOrDefault(key, 0L) + 1);
                }

                System.out.println(count);
            }

            sc.close();
        }
    }

