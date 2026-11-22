import java.util.*;

public class Alice_Bob_and_Chocolate {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int left = 0;
            int right = n - 1;

            int alice = 0;
            int bob = 0;

            int aliceTime = 0;
            int bobTime = 0;

            while (left <= right) {

                if (aliceTime <= bobTime) {
                    aliceTime += a[left];
                    alice++;
                    left++;
                } else {
                    bobTime += a[right];
                    bob++;
                    right--;
                }
            }

            System.out.println(alice + " " + bob);


    }

}
