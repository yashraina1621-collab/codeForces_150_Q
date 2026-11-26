
import java.util.*;
public class Composition_Programmers_and_Mathematicians {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int a = sc.nextInt();
                int b = sc.nextInt();

                int ans = Math.min(Math.min(a, b), (a + b) / 4);

                System.out.println(ans);
            }

    }

}
