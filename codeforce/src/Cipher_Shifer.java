
import java.util.Scanner;
public class Cipher_Shifer {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                String s = sc.next();

                StringBuilder ans = new StringBuilder();

                int i = 0;

                while (i < n) {

                    char ch = s.charAt(i);

                    ans.append(ch);

                    i++;

                    while (i < n && s.charAt(i) != ch) {
                        i++;
                    }

                    i++;
                }

                System.out.println(ans);
            }


        }
    }

