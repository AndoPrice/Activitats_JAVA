package Arrays;

import java.util.Scanner;

public class ArrayNumPrimers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int n = input.nextInt();

        FuncionsArray.printArray(numPrimers(n));
    }
    public static int[] numPrimers (int n){
        int [] a = new int[n];
        int p=2;

        for(int i=0; i<a.length;i++){
            int t = p-1;
            while(t>1){
                if(p%t==0){
                    break;
                }
                t=t-1;
            }
            if(t==1){
              a[i] = p;
            } else{
                i--;
            }
            p++;
        }
        return a;
    }
}
