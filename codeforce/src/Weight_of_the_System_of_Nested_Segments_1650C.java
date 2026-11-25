import java.util.*;
public class Weight_of_the_System_of_Nested_Segments_1650C {

        static class Point {
            int x, w, id;

            Point(int x, int w, int id) {
                this.x = x;
                this.w = w;
                this.id = id;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();

                Point[] points = new Point[m];

                for (int i = 0; i < m; i++) {
                    int x = sc.nextInt();
                    int w = sc.nextInt();

                    points[i] = new Point(x, w, i + 1);
                }

                // Sort by weight
                Arrays.sort(points, (a, b) -> Integer.compare(a.w, b.w));

                // Select 2*n points with minimum weights
                Point[] selected = new Point[2 * n];
                long sum = 0;

                for (int i = 0; i < 2 * n; i++) {
                    selected[i] = points[i];
                    sum += points[i].w;
                }

                // Sort selected points by coordinate
                Arrays.sort(selected, (a, b) -> Integer.compare(a.x, b.x));

                System.out.println(sum);

                // Pair outermost points to create nested segments
                for (int i = 0; i < n; i++) {
                    System.out.println(
                            selected[i].id + " " + selected[2 * n - 1 - i].id
                    );
                }
            }


        }
    }


