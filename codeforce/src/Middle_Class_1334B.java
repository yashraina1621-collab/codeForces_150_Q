import java.util.*;
public class Middle_Class_1334B {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long x = sc.nextLong();

                long[] a = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                }

                Arrays.sort(a);

                long sum = 0;
                int count = 0;

                for (int i = n - 1; i >= 0; i--) {
                    sum += a[i];

                    if (sum >= x * (count + 1)) {
                        count++;
                    } else {
                        break;
                    }
                }

                System.out.println(count);
            }

    }

}
