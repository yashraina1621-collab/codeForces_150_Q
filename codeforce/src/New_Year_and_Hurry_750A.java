import java.util.Scanner;
public class New_Year_and_Hurry_750A {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int k = sc.nextInt();

            int time = 240 - k;
            int total = 0;
            int count = 0;

            for (int i = 1; i <= n; i++) {

                total += 5 * i;

                if (total <= time) {
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);


    }

}
