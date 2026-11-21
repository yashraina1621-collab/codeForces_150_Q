import java.util.*;
public class XXXXX_1364A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int x = sc.nextInt();

                int[] a = new int[n];

                int sum = 0;
                int first = -1;
                int last = -1;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    sum += a[i];

                    if (a[i] % x != 0) {
                        if (first == -1) {
                            first = i;
                        }
                        last = i;
                    }
                }

                if (sum % x != 0) {
                    System.out.println(n);
                } else if (first == -1) {
                    System.out.println(-1);
                } else {
                    System.out.println(Math.max(n - first - 1, last));
                }
            }


        }
    }


