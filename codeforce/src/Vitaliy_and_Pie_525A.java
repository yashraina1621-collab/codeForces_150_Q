import java.util.*;
public class Vitaliy_and_Pie_525A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int[] keys = new int[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                keys[ch - 'a']++;
            } else {
                int index = ch - 'A';

                if (keys[index] > 0) {
                    keys[index]--;
                } else {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}



