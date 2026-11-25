
import java.util.*;
public class String_LCM_1473B {
        public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int q = sc.nextInt();

            while (q-- > 0) {

                String s = sc.next();
                String t = sc.next();

                if (!(s + t).equals(t + s)) {
                    System.out.println(-1);
                    continue;
                }

                int lcm = (s.length() * t.length())
                        / gcd(s.length(), t.length());

                StringBuilder ans = new StringBuilder();

                for (int i = 0; i < lcm / s.length(); i++) {
                    ans.append(s);
                }

                System.out.println(ans);
            }


    }

}
