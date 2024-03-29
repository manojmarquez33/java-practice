/**
Question:
Write a Java program to determine whether a given integer is a palindrome or not.

Sample Input/Output:
Input:
Enter an integer: 12321

Output:
12321 is a palindrome.

Explanation:
The given integer is 12321. It reads the same backward as forward, so it is a palindrome.

Input:
Enter an integer: 12345

Output:
12345 is not a palindrome.

Explanation:
The given integer is 12345. It does not read the same backward as forward, so it is not a palindrome.
*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        if (isPalindrome(num))
            System.out.println(num + " is a palindrome.");
        else
            System.out.println(num + " is not a palindrome.");
    }

    public static boolean isPalindrome(int num) {
        String strNum = Integer.toString(num);
        int length = strNum.length();

        for (int i = 0; i < length / 2; i++) {
            if (strNum.charAt(i) != strNum.charAt(length - 1 - i))
                return false;
        }
        return true;
    }
}
