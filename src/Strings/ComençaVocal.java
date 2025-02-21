package Strings;

public class ComençaVocal {
    public static void main(String[] args) {
        String s = "alelulla";
        System.out.printf("Comença per vocal? %b", lletresA(s));
    }

    public static boolean lletresA (String s) {
        boolean vocal = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
                vocal = true;
            }
        }
        return vocal;
    }
}
