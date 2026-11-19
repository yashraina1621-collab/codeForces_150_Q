import java.util.*;
public class Lex_String {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt();

                char[] a = sc.next().toCharArray();
                char[] b = sc.next().toCharArray();

                Arrays.sort(a);
                Arrays.sort(b);

                int i = 0;
                int j = 0;

                int countA = 0;
                int countB = 0;

                StringBuilder c = new StringBuilder();

                while (i < n && j < m) {

                    if (countA == k ||
                            (countB < k && a[i] > b[j])) {

                        c.append(b[j]);
                        j++;

                        countB++;
                        countA = 0;

                    } else {

                        c.append(a[i]);
                        i++;

                        countA++;
                        countB = 0;
                    }
                }

                System.out.println(c);
            }


        }
    }

