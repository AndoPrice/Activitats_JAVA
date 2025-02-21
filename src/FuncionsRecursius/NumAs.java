package FuncionsRecursius;

public class NumAs {
    public static void main(String[] args) {
        String s = "banana";
        System.out.printf("Hi ha: %d 'a's", comptarAsRec(s));

    }
    public static int comptarAsRec(String s){
        if(s.length()==1){
            return (s.charAt(0)=='a') ? 1 : 0;
        }
        else {
            String left = s.substring(0, s.length()/2);
            String right = s.substring(s.length()/2, s.length());
            return comptarAsRec(left) + comptarAsRec(right);
        }
    }
}
