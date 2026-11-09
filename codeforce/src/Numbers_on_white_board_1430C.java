import java.util.Scanner;
public class Numbers_on_white_board_1430C{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            System.out.println(2);

            int a = 2;

            for (int i = 3; i <= n; i++) {
                System.out.println(a + " " + i);
                a = (a + i + 1) / 2;
            }
        }

    }
    }


