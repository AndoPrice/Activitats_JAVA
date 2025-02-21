package ActivitatsGenerals;

import java.util.Scanner;

public class Binary2Hexa {
    public static void main(String[] args) {
        System.out.print("Enter Binary number: ");
        Scanner input = new Scanner(System.in);
        long nb = input.nextLong();

        String nf = "";

        while (nb != 0) {

            long p = nb % 10000;

            String nh = dec2Hexa(binary2Dec(p));

            nf = nh+nf;

            nb = nb / 10000;
        }

        System.out.printf("Hexadecimal number: %s", nf);
    }

    public static int binary2Dec(long nb) {
        int pos = 0;
        long nd = 0;

        while (nb > 0) {
            long d = nb % 10;
            long p = (long) Math.pow(2, pos);
            nb = nb / 10;
            nd = nd + d * p;
            pos = pos + 1;
        }
        return (int) nd;
    }

    public static String dec2Hexa(int nd) {
        String c = "";
        if (nd >= 0 && nd < 10) {
            c = String.valueOf(nd);
        } else if (nd == 10) {
            c = "A";
        } else if (nd == 11) {
            c = "B";
        } else if (nd == 12) {
            c = "C";
        } else if (nd == 13) {
            c = "D";
        } else if (nd == 14) {
            c = "E";
        } else if (nd == 15) {
            c = "F";
        }
        return c;
    }
}