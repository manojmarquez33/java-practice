/**
Question:
Write a Java program to determine whether a given number is a perfect number or not. A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. For example, 6 is a perfect number since 1 + 2 + 3 = 6.

Sample Input/Output:
Enter a number to check if it's a perfect number:
28
Output:
Yes, it is a perfect number.

Enter a number to check if it's a perfect number:
15
Output:
No, it is not a perfect number.
*/

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),i,sum=1;

        for (i=2;i<Math.sqrt(n);i++){
            if(n%i==0) {
                sum += i;
                sum = sum+ n/i;
            }

        }
        System.out.println(sum==n ? "yes" : "no");
    }
}


