import java.util.*;
public class Pair_Programming_1547C {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int k = sc.nextInt();
                int n = sc.nextInt();
                int m = sc.nextInt();

                int[] a = new int[n];
                int[] b = new int[m];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                for (int i = 0; i < m; i++) {
                    b[i] = sc.nextInt();
                }

                int i = 0, j = 0;
                ArrayList<Integer> ans = new ArrayList<>();

                while (i < n || j < m) {

                    if (i < n && a[i] == 0) {
                        k++;
                        ans.add(0);
                        i++;
                    }
                    else if (j < m && b[j] == 0) {
                        k++;
                        ans.add(0);
                        j++;
                    }
                    else if (i < n && a[i] <= k) {
                        ans.add(a[i]);
                        i++;
                    }
                    else if (j < m && b[j] <= k) {
                        ans.add(b[j]);
                        j++;
                    }
                    else {
                        break;
                    }
                }

                if (ans.size() == n + m) {
                    for (int x : ans) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println(-1);
                }
            }


        }
    }


