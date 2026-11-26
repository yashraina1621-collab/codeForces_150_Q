import java.util.*;
public class Moamen_and_k_subarrays_1557B {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                int k = sc.nextInt();

                int[] a = new int[n];
                int[] sorted = new int[n];

                HashMap<Integer, Integer> map = new HashMap<>();

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    sorted[i] = a[i];

                    map.put(a[i], i);
                }

                Arrays.sort(sorted);

                int groups = 1;

                for (int i = 1; i < n; i++) {

                    int previousIndex = map.get(sorted[i - 1]);
                    int currentIndex = map.get(sorted[i]);

                    if (currentIndex != previousIndex + 1) {
                        groups++;
                    }
                }

                System.out.println(groups <= k ? "YES" : "NO");
            }

    }

}
