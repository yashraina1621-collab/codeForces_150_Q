import java.util.Scanner;
public class Hamon_Odyssey_1847B {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                int[] a = new int[n];

                int totalAnd = -1;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    totalAnd &= a[i];
                }

                if (totalAnd != 0) {
                    System.out.println(1);
                    continue;
                }

                int count = 0;
                int currentAnd = -1;

                for (int i = 0; i < n; i++) {

                    currentAnd &= a[i];

                    if (currentAnd == 0) {
                        count++;
                        currentAnd = -1;
                    }
                }

                System.out.println(count);
            }


        }
    }


