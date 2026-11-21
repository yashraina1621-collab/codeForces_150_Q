import java.util.*;
public class Three_Parts_of_the_Array_1006C {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int left = 0;
            int right = n - 1;

            long leftSum = 0;
            long rightSum = 0;
            long ans = 0;

            while (left <= right) {

                if (leftSum <= rightSum) {
                    leftSum += a[left];
                    left++;
                } else {
                    rightSum += a[right];
                    right--;
                }

                if (leftSum == rightSum) {
                    ans = leftSum;
                }
            }

            System.out.println(ans);


        }
    }


