package FuncionsRecursius;

public class Capicua {
    public static void main(String[] args) {
        String s ="radar";
        System.out.print(capicua(s));
    }
    public static boolean capicua (String s){
        if (s.length()==1){
            return true;
        }
        else if(s.length()==2){
            return s.charAt(0)==s.charAt(1);
        }
        else{
            char primera = s.charAt(0);
            char darrera = s.charAt(s.length()-1);
            String mig = s.substring(1, s.length()-1);
            return primera==darrera&&capicua(mig);
        }
    }
}
