/**
Question:
Write a Java program to check if a string can be obtained by rotating another string. Implement a method that takes two string inputs and checks if one string can be formed by rotating the other string. The program should output "yes" if it's possible, otherwise "no".

Sample Input/Output:
Input:
abcd
cdab
Output:
yes

Input:
hello
world
Output:
no
*/

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next(),b=in.next();
        a=a+a;
        System.out.println(a.contains(b) && a.length()-b.length()==b.length() ? "yes" : "no");
        System.out.println(a.length()+" "+b.length());
    }
}
