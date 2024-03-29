/**
 * Question:
 * Write a Java program that checks whether a given string is a lapin palindrome or not.
 * A lapin palindrome is defined as a string that can be divided into two equal halves, and the characters in the first half occur the same number of times as the characters in the second half.
 * The program should take a string as input and output "yes" if it is a lapin palindrome, and "no" otherwise.

 * Sample Input/Output:
 *
 * Input:
 * 1212
 * Output:
 * yes
 * Explanation: The given string "1212" can be divided into two halves: "12" and "12". Each half contains one '1' and one '2', hence it is a lapin palindrome.

 * Input:
 * racecar
 * Output:
 * yes
 * Explanation: The given string "racecar" can be divided into two halves: "rac" and "car". Each half contains one 'r', two 'a's, and one 'c', hence it is a lapin palindrome.

 * Input:
 * hello
 * Output:
 * no
 * Explanation: The given string "hello" cannot be divided into two halves of equal length, hence it is not a lapin palindrome.
 */

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
