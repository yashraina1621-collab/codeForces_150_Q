import java.util.Scanner;
public class challenging_valleys {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int i = 0;

                // Skip the decreasing part
                while (i + 1 < n && a[i] > a[i + 1]) {
                    i++;
                }

                // Skip the flat minimum part
                while (i + 1 < n && a[i] == a[i + 1]) {
                    i++;
                }

                // Check the increasing part
                while (i + 1 < n && a[i] < a[i + 1]) {
                    i++;
                }

                if (i == n - 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }


        }
    }

