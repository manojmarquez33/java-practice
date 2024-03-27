/*
* Check whether the given String in lapinpalindrome quarsepalindrom (1212)
* */

import java.util.Scanner;

public class Lapin_Palin_Drome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        int len = a.length();
        String fi = a.substring(0,len/2);
        String se = a.substring((len/2)+1,len);

        System.out.print(fi.equals(se)? "yes" :"no");;
    }
}
