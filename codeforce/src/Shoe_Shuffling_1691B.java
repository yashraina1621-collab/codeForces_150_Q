import java.util.Scanner;
public class Shoe_Shuffling_1691B {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                int[] s = new int[n];
                int[] p = new int[n];

                for (int i = 0; i < n; i++) {
                    s[i] = sc.nextInt();
                }

                int i = 0;
                boolean possible = true;

                while (i < n) {

                    int j = i;

                    // Find the end of the equal-size group
                    while (j + 1 < n && s[j] == s[j + 1]) {
                        j++;
                    }

                    // A group containing only one student is invalid
                    if (i == j) {
                        possible = false;
                        break;
                    }

                    // Rotate students within this group
                    for (int k = i; k < j; k++) {
                        p[k] = k + 2;
                    }

                    p[j] = i + 1;

                    i = j + 1;
                }

                if (!possible) {
                    System.out.println(-1);
                } else {
                    for (int k = 0; k < n; k++) {
                        System.out.print(p[k] + " ");
                    }
                    System.out.println();
                }
            }

        }
    }


