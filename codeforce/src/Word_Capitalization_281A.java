import java.util.Scanner;

public class Word_Capitalization_281A {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();

            char first = Character.toUpperCase(s.charAt(0));

            System.out.println(first + s.substring(1));


        }
    }

