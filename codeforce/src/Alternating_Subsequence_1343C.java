import java.util.*;
public class Alternating_Subsequence_1343C {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();

                int[] freq = new int[4];
                int left = 0;
                int ans = Integer.MAX_VALUE;

                for (int right = 0; right < s.length(); right++) {
                    freq[s.charAt(right) - '0']++;

                    while (freq[1] > 0 && freq[2] > 0 && freq[3] > 0) {
                        ans = Math.min(ans, right - left + 1);

                        freq[s.charAt(left) - '0']--;
                        left++;
                    }
                }

                System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
            }

        }
    }


