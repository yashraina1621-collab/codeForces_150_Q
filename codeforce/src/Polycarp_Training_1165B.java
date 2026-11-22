import java.util.*;

public class Polycarp_Training_1165B {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int days = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] >= days + 1) {
                    days++;
                }
            }

            System.out.println(days);


    }

}
