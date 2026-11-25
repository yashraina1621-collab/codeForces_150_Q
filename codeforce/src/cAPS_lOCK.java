import java.util.Scanner;
public class cAPS_lOCK {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();

            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    count++;
                }
            }

            if (count == s.length()) {
                s = s.toLowerCase();
            }
            else if (count == s.length() - 1 &&
                    Character.isLowerCase(s.charAt(0))) {
                s = s.substring(0, 1).toUpperCase()
                        + s.substring(1).toLowerCase();
            }

            System.out.println(s);

    }

}
