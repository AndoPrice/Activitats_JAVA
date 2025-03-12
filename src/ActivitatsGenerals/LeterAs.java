package ActivitatsGenerals;

import java.util.Scanner;

public class LeterAs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String s = input.next();
        System.out.printf("There are: %d 'a's", comptarAsRec(s));

    }

    public static int comptarAsRec(String s) {
        if (s.length() == 1) {
            return (s.charAt(0) == 'a') ? 1 : 0;
        } else {
            String left = s.substring(0, s.length() / 2);
            String right = s.substring(s.length() / 2, s.length());
            return comptarAsRec(left) + comptarAsRec(right);
        }
    }
}
