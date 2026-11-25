import java.util.*;
public class Team_Olympiad_490A {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] a = new int[n];
            int[] one = new int[n];
            int[] two = new int[n];
            int[] three = new int[n];

            int c1 = 0, c2 = 0, c3 = 0;

            for (int i = 0; i < n; i++) {

                a[i] = sc.nextInt();

                if (a[i] == 1) {
                    one[c1++] = i + 1;
                }
                else if (a[i] == 2) {
                    two[c2++] = i + 1;
                }
                else {
                    three[c3++] = i + 1;
                }
            }

            int w = Math.min(c1, Math.min(c2, c3));

            System.out.println(w);

            for (int i = 0; i < w; i++) {
                System.out.println(one[i] + " " + two[i] + " " + three[i]);
            }


    }

}
