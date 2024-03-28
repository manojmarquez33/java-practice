/*
Question:
Write a Java program to determine whether two given numbers are amicable or not.
Two numbers, n1 and n2, are considered amicable if the sum of proper divisors of
each number (excluding the number itself) equals the other number. Write a program
that takes two integers as input and outputs "yes" if they are amicable,
otherwise "no".

Sample Input:
220 284

Sample Output:
yes

Explanation:
For the input pair (220, 284), the sum of proper divisors of 220 is 284, and the
sum of proper divisors of 284 is 220. Hence, they are amicable numbers.
*/

import java.util.Scanner;

public class AmakableNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum1 =1,sum2=1;
        for (int i=2;i<Math.sqrt(n1);i++){
            if(n1 % i==0)
                sum1+=i;
                sum1+= n1/i;
        }

        for (int i=2;i<Math.sqrt(n2);i++){
            if(n2 % i==0)
                sum2+=i;
                sum2+= n2/i;
        }

        System.out.print((sum1==n2 && sum2==n1) ? "yes" : "no");

    }
}
