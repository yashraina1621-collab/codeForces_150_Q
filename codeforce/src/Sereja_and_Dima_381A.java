import java.util.*;
public class Sereja_and_Dima_381A {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int left = 0;
            int right = n - 1;

            int sereja = 0;
            int dima = 0;

            for (int i = 0; i < n; i++) {

                int card;

                if (arr[left] > arr[right]) {
                    card = arr[left];
                    left++;
                } else {
                    card = arr[right];
                    right--;
                }

                if (i % 2 == 0) {
                    sereja += card;
                } else {
                    dima += card;
                }
            }

            System.out.println(sereja + " " + dima);


        }
    }

}
