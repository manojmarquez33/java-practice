/**
Question:
Write a Java program to find and display the number of digits in a given integer.

Sample Input/Output:
Input:
Enter an integer: 12345

Output:
Number of digits: 5
Given integer: 12345

Explanation:
The given integer is 12345.
The number of digits in 12345 is 5.
*/

import java.util.Scanner;

public class numberOfDigits {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
     int n = in.nextInt(),nod=0,div=1;

     for(;n/div>0;div*=10,nod++);

        System.out.println(nod);
        System.out.println(n);

    }
}
