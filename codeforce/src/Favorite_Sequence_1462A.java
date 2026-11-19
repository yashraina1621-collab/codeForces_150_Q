import java.util.*;
public class Favorite_Sequence_1462A {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int[] b = new int[n];

                for (int i = 0; i < n; i++) {
                    b[i] = sc.nextInt();
                }

                int left = 0;
                int right = n - 1;

                while (left <= right) {

                    System.out.print(b[left] + " ");
                    left++;

                    if (left <= right) {
                        System.out.print(b[right] + " ");
                        right--;
                    }
                }

                System.out.println();
            }

            sc.close();
        }
    }


