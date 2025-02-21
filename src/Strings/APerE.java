package Strings;

public class APerE {
    public static void main(String[] args) {
        String s = "banana";
        String s2 = "";

        System.out.printf("String 2: %s", apere(s, s2));
    }
    public static String apere (String s, String s2){
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                s2 = s2 + 'e';
            } else {
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
}
