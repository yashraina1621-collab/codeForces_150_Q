import java.util.*;
public class Berland_Music_1622B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int[] p = new int[n];
                int[] pos = new int[n + 1];
                int[] q = new int[n];

                for (int i = 0; i < n; i++) {
                    p[i] = sc.nextInt();
                    pos[p[i]] = i;
                }

                String s = sc.next();

                int zeroCount = 0;

                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '0') {
                        zeroCount++;
                    }
                }

                int low = 1;
                int high = zeroCount + 1;

                for (int value = 1; value <= n; value++) {
                    int index = pos[value];

                    if (s.charAt(index) == '0') {
                        q[index] = low++;
                    } else {
                        q[index] = high++;
                    }
                }

                for (int i = 0; i < n; i++) {
                    System.out.print(q[i] + " ");
                }

                System.out.println();
            }


        }
    }


