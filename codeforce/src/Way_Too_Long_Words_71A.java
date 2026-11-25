import java.util.Scanner;
public class Way_Too_Long_Words_71A {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {

                String s = sc.next();

                if (s.length() > 10) {

                    int middle = s.length() - 2;

                    System.out.println(
                            "" + s.charAt(0) + middle + s.charAt(s.length() - 1)
                    );

                } else {
                    System.out.println(s);
                }
            }


        }
    }


