import java.util.*;
public class Grandma_Capa_Knits_a_Scarf_1582C {
       public static int check(String s, char ch) {
            int left = 0;
            int right = s.length() - 1;
            int count = 0;

            while (left < right) {

                if (s.charAt(left) == s.charAt(right)) {
                    left++;
                    right--;
                }
                else if (s.charAt(left) == ch) {
                    left++;
                    count++;
                }
                else if (s.charAt(right) == ch) {
                    right--;
                    count++;
                }
                else {
                    return Integer.MAX_VALUE;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                int ans = Integer.MAX_VALUE;

                for (char ch = 'a'; ch <= 'z'; ch++) {
                    ans = Math.min(ans, check(s, ch));
                }

                System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
            }


        }
    }


