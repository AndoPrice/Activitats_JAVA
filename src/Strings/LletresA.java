package Strings;


public class LletresA {
    public static void main(String[] args) {
        String s = "banana";
        System.out.printf("Hi ha %d lletres A", (lletresA(s)));
    }

    public static int lletresA (String s) {
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a++;
            }
        }
        return a;
    }

}
