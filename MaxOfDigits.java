/*
Question:
Write a Java program to find the maximum digit from a given number, excluding a specified number of digits from the calculation.

Sample Input/Output:
Input:
Enter the number: 51589
Enter the number of digits to exclude: 2

Output:
Maximum digit after excluding 2 digits: 8

Explanation:
In the given number 51589, after excluding 2 digits, the remaining digits are 5, 1, and 9.
The maximum digit among these is 9.
*/

import java.util.Scanner;

public class MaxOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //51589
        int n = sc.nextInt(),number = sc.nextInt(),ans=0,j=1,pw=1,num=0,temp,i=1,
                max = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE,temp2,pw2=1;
        while(n/pw>0) {
            temp = (n / pw) % 10; // 9
            pw = (int) Math.pow(10, i); //
            i++;
            if (temp > max) {
                max = temp;
            }
        }
        //System.out.println(max);
        for(int x=0;x<number-1;x++){
            while (n / pw2 > 0) {
                temp2 = (n / pw2) % 10;
                pw2 = (int) Math.pow(10, j);
                j++;
                if (temp2 < max && temp2>max2 ){
                    max2 = temp2;
                    //System.out.println(max2);
                }
            }
            pw2=1;
            j=1;
            max = max2;
            ans = max2;
            max2 = Integer.MIN_VALUE;
        }
        System.out.println(ans);
    }
}
