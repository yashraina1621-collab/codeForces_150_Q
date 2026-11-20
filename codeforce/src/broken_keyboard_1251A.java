import java.util.Scanner;
public class broken_keyboard_1251A {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                String s = sc.next();

                boolean[] seen = new boolean[26];

                StringBuilder ans = new StringBuilder();

                int i = 0;

                while (i < s.length()) {

                    if (i + 1 < s.length() &&
                            s.charAt(i) == s.charAt(i + 1)) {

                        i += 2;

                    } else {

                        char ch = s.charAt(i);

                        if (!seen[ch - 'a']) {
                            seen[ch - 'a'] = true;
                            ans.append(ch);
                        }

                        i++;
                    }
                }

                char[] result = ans.toString().toCharArray();

                java.util.Arrays.sort(result);

                System.out.println(new String(result));
            }
        }
    }


