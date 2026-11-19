import java.util.Scanner;
public class Long_Long_1843B {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                long sum = 0;
                int operations = 0;

                boolean inNegative = false;

                for (int i = 0; i < n; i++) {

                    long x = sc.nextLong();

                    sum += Math.abs(x);

                    if (x < 0 && !inNegative) {
                        operations++;
                        inNegative = true;
                    }

                    if (x == 0) {
                        inNegative = false;
                    }

                    if (x > 0) {
                        inNegative = false;
                    }
                }

                System.out.println(sum + " " + operations);
            }


        }
    }

