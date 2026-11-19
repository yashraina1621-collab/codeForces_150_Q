import java.util.Scanner;
public class New_Theatre_Square {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                int m = sc.nextInt();

                int x = sc.nextInt();
                int y = sc.nextInt();

                long ans = 0;

                for (int i = 0; i < n; i++) {

                    String s = sc.next();

                    int j = 0;

                    while (j < m) {

                        if (s.charAt(j) == '*') {
                            j++;
                        }

                        else if (j + 1 < m &&
                                s.charAt(j + 1) == '.' &&
                                y < 2 * x) {

                            ans += y;
                            j += 2;
                        }

                        else {
                            ans += x;
                            j++;
                        }
                    }
                }

                System.out.println(ans);
            }


        }
    }

