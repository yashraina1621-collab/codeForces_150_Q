
import java.util.Scanner;
public class Pangram_520A {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            String s = sc.next().toLowerCase();

            boolean[] visited = new boolean[26];

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                visited[ch - 'a'] = true;
            }

            boolean pangram = true;

            for (int i = 0; i < 26; i++) {
                if (!visited[i]) {
                    pangram = false;
                    break;
                }
            }

            System.out.println(pangram ? "YES" : "NO");



    }

}
