import java.util.*;

public class Dora_and_Search_1793C {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                int left = 0;
                int right = n - 1;

                int min = 1;
                int max = n;

                while (left < right) {

                    if (a[left] == min) {
                        left++;
                        min++;
                    }
                    else if (a[left] == max) {
                        left++;
                        max--;
                    }
                    else if (a[right] == min) {
                        right--;
                        min++;
                    }
                    else if (a[right] == max) {
                        right--;
                        max--;
                    }
                    else {
                        break;
                    }
                }

                if (left >= right) {
                    System.out.println(-1);
                } else {
                    System.out.println((left + 1) + " " + (right + 1));
                }
            }


        }
    }


