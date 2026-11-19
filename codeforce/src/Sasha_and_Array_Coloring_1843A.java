import java.util.*;
public class Sasha_and_Array_Coloring_1843A {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                Arrays.sort(arr);

                int ans = 0;

                for (int i = 0; i < n / 2; i++) {
                    ans += arr[n - 1 - i] - arr[i];
                }

                System.out.println(ans);
            }


        }
    }

