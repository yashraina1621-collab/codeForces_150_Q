import java.util.*;
public class Remove_Two_Letters_1800D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();

                HashSet<String> set = new HashSet<>();

                for (int i = 0; i < n - 1; i++) {
                    String result = s.substring(0, i) + s.substring(i + 2);
                    set.add(result);
                }

                System.out.println(set.size());
            }


        }
    }


