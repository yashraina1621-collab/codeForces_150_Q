import java.util.Scanner;
public class Black_and_White_Stripe_690D {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                int k = sc.nextInt();

                String s = sc.next();

                int count = 0;

                // Count W in the first window
                for (int i = 0; i < k; i++) {
                    if (s.charAt(i) == 'W') {
                        count++;
                    }
                }

                int ans = count;

                // Slide the window
                for (int i = k; i < n; i++) {

                    if (s.charAt(i - k) == 'W') {
                        count--;
                    }

                    if (s.charAt(i) == 'W') {
                        count++;
                    }

                    ans = Math.min(ans, count);
                }

                System.out.println(ans);
            }


        }
    }

