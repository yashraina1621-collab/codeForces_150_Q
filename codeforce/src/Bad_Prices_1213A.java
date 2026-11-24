import java.util.*;
public class Bad_Prices_1213A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int minPrice = a[n - 1];
                int count = 0;

                for (int i = n - 2; i >= 0; i--) {
                    if (a[i] > minPrice) {
                        count++;
                    }

                    minPrice = Math.min(minPrice, a[i]);
                }

                System.out.println(count);
            }


        }
    }


