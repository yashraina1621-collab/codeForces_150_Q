import java.util.*;
public class Boats_Competition_1399C {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                Arrays.sort(a);

                int ans = 0;

                for (int sum = 2; sum <= 2 * n; sum++) {
                    int left = 0;
                    int right = n - 1;
                    int count = 0;

                    while (left < right) {
                        int current = a[left] + a[right];

                        if (current == sum) {
                            count++;
                            left++;
                            right--;
                        } else if (current < sum) {
                            left++;
                        } else {
                            right--;
                        }
                    }

                    ans = Math.max(ans, count);
                }

                System.out.println(ans);
            }

        }
    }


