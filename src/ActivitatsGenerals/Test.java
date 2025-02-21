package ActivitatsGenerals;

public class Test {
    public static void main(String[] args) {

        String s = "Hello bye";
        System.out.printf("%s", encode(s));

    }

    public static String encode(String x){
        if(x.length()>0){
            char c = x.charAt(0);
            String p = x.substring(1,x.length());
            if(x.length()>3){return encode(p)+c;}
            else{return c + encode (p);}
        }
        else {
            return x;
        }
    }
}
