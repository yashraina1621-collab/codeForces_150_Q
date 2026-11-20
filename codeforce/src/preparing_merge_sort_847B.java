import java.util.*;
public class preparing_merge_sort_847B {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            ArrayList<ArrayList<Integer>> groups = new ArrayList<>();

            int[] last = new int[n];

            int size = 0;

            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();

                // Binary search for the first group
                // whose last element is smaller than x

                int low = 0;
                int high = size;

                while (low < high) {

                    int mid = low + (high - low) / 2;

                    if (last[mid] < x) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }

                int index = low;

                if (index == size) {
                    groups.add(new ArrayList<>());
                    size++;
                }

                groups.get(index).add(x);
                last[index] = x;
            }

            // Print groups
            for (int i = 0; i < size; i++) {

                for (int x : groups.get(i)) {
                    System.out.print(x + " ");
                }

                System.out.println();
            }


        }
    }


