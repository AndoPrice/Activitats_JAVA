package FuncionsRecursius;

public class Countdown {
    public static void main(String[] args) {
        countdown(10);
    }
    public static void countdown (int n){
        if (n==0){
            System.out.println("WE BRING THE BOOOOOOOM!");
        }
        else {
            System.out.println(n);
            countdown(n-1);
        }

    }
}
