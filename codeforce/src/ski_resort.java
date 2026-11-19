import java.util.Scanner;
public class ski_resort {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();
                int k = sc.nextInt();
                int q = sc.nextInt();

                long ans = 0;
                int count = 0;

                for (int i = 0; i < n; i++) {

                    int temp = sc.nextInt();

                    if (temp <= q) {
                        count++;
                    } else {

                        if (count >= k) {
                            long x = count - k + 1;
                            ans += x * (x + 1) / 2;
                        }

                        count = 0;
                    }
                }

                if (count >= k) {
                    long x = count - k + 1;
                    ans += x * (x + 1) / 2;
                }

                System.out.println(ans);
            }

        }
}
