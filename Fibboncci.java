/**
Question:
Write a Java program to generate the Fibonacci series up to a given number. The Fibonacci series starts with 0 and 1, and each subsequent number is the sum of the two preceding ones. Prompt the user to enter a number, n. The program should then generate and print the Fibonacci series up to the nth term.

Sample Input/Output:
Enter the number:
10

Fibonacci Series:
0 1 1 2 3 5 8 13 21 34

Explanation:
For the input number 10, the program generates the Fibonacci series up to the 10th term, which is 34.
*/

import java.util.Scanner;

public class Fibboncci {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        int t1=0,t2=1;
        int temp;
        System.out.print(t1+" "+t2+" ");
        for(int i=t1;i<n-2;System.out.print(t1+t2+" "),temp=t1,t1=t2,t2+=temp,i++);
    }
}
