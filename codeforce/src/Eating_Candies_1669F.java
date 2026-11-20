import java.util.*;
public class Eating_Candies_1669F {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int left = 0;
                int right = n - 1;

                long sumAlice = 0;
                long sumBob = 0;

                int ans = 0;

                while (left <= right) {

                    if (sumAlice <= sumBob) {
                        sumAlice += a[left];
                        left++;
                    } else {
                        sumBob += a[right];
                        right--;
                    }

                    if (sumAlice == sumBob) {
                        ans = left + (n - 1 - right);
                    }
                }

                System.out.println(ans);
            }


        }
    }


