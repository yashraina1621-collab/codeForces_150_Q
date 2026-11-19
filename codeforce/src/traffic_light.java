import java.util.Scanner;
public class traffic_light {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                char c = sc.next().charAt(0);

                String s = sc.next();

                String str = s + s;

                int ans = 0;

                for (int i = 0; i < n; i++) {

                    if (str.charAt(i) == c) {

                        int j = i;

                        while (str.charAt(j) != 'g') {
                            j++;
                        }

                        ans = Math.max(ans, j - i);
                    }
                }

                System.out.println(ans);
            }


        }
    }

