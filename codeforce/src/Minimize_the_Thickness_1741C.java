
import java.util.*;
public class Minimize_the_Thickness_1741C {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int[] a = new int[n];
                int total = 0;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    total += a[i];
                }

                int ans = n;

                int prefix = 0;

                for (int i = 0; i < n; i++) {
                    prefix += a[i];

                    if (total % prefix != 0) {
                        continue;
                    }

                    int target = prefix;
                    int sum = 0;
                    int length = 0;
                    int maxLength = 0;
                    boolean valid = true;

                    for (int j = 0; j < n; j++) {
                        sum += a[j];
                        length++;

                        if (sum == target) {
                            maxLength = Math.max(maxLength, length);
                            sum = 0;
                            length = 0;
                        }
                        else if (sum > target) {
                            valid = false;
                            break;
                        }
                    }

                    if (valid && sum == 0) {
                        ans = Math.min(ans, maxLength);
                    }
                }

                System.out.println(ans);
            }


        }
    }


