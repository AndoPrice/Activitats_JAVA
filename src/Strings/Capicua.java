package Strings;

public class Capicua {
    public static void main(String[] args) {
        String s = "anna";
        System.out.printf("Capicua: %b", capicua(s));
    }
    public static boolean capicua (String s){
        int i = 0;
        int j = s.length()-1;
        boolean capicua = true;
        while(i<j&&capicua==true){
            if(s.charAt(i)!=s.charAt(j)){
                capicua=false;
            }
            i++;
            j--;
        }
        return capicua;

    }
}
