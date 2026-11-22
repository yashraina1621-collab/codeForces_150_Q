import java.util.*;
public class Binary_Deque_1692E {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int s = sc.nextInt();

                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int left = 0;
                int sum = 0;
                int maxLen = -1;

                for (int right = 0; right < n; right++) {
                    sum += a[right];

                    while (sum > s) {
                        sum -= a[left];
                        left++;
                    }

                    if (sum == s) {
                        maxLen = Math.max(maxLen, right - left + 1);
                    }
                }

                if (maxLen == -1) {
                    System.out.println(-1);
                } else {
                    System.out.println(n - maxLen);
                }
            }


        }
    }


