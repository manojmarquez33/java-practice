
/*
Question:
Write a Java program to determine whether a given number is a Neon number or not. Neon numbers are those numbers whose square is equal to the sum of its digits. In this program, we consider only the neon numbers 0, 1, and 9.

Sample Input/Output:
Input:
0
Output:
yes

Input:
5
Output:
NO

Input:
9
Output:
yes
*/

import java.util.Scanner;

/// neon numbers  0,1,9
public class NeonNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 0 || n == 1 || n == 9) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
            ;
        }

    }
}