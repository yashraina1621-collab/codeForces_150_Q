import java.util.Scanner;

public class Lecture_Sleep_961B {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] t = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                t[i] = sc.nextInt();
            }

            int sum = 0;

            // Count theorems from minutes when Mishka is already awake
            for (int i = 0; i < n; i++) {
                if (t[i] == 1) {
                    sum += a[i];
                }
            }

            int windowSum = 0;

            // Calculate the first window
            for (int i = 0; i < k; i++) {
                if (t[i] == 0) {
                    windowSum += a[i];
                }
            }

            int maxSum = windowSum;

            // Slide the window
            for (int i = k; i < n; i++) {

                if (t[i] == 0) {
                    windowSum += a[i];
                }

                if (t[i - k] == 0) {
                    windowSum -= a[i - k];
                }

                maxSum = Math.max(maxSum, windowSum);
            }

            System.out.println(sum + maxSum);

            sc.close();
        }
    }


