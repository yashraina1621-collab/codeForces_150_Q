import java.util.Scanner;
public class Serval_and_Inversion_Magic {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                String s = sc.next();

                int first = -1;
                int last = -1;

                for (int i = 0; i < n / 2; i++) {

                    if (s.charAt(i) != s.charAt(n - 1 - i)) {

                        if (first == -1) {
                            first = i;
                        }

                        last = i;
                    }
                }

                boolean possible = true;

                for (int i = first; i <= last; i++) {

                    if (s.charAt(i) == s.charAt(n - 1 - i)) {
                        possible = false;
                        break;
                    }
                }

                System.out.println(possible ? "YES" : "NO");
            }


        }
    }

