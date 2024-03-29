/**
Question:
Write a Java program that calculates the greatest common divisor (GCD) of two integers. The program should prompt the user to enter two integers, compute their GCD using a recursive method, and then display the result.

Sample Input/Output:
Input:
Enter the first integer: 24
Enter the second integer: 36
Output:
The GCD of 24 and 36 is: 12

Input:
Enter the first integer: 81
Enter the second integer: 153
Output:
The GCD of 81 and 153 is: 9
*/

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a,b));
    }
    public static int gcd(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }
}
