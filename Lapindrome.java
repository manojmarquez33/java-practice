/**
Question: Write a Java program to check if a given string is a Lapindrome or not. A string is called a Lapindrome if it splits the string into two halves of equal length. If the string has an odd length, ignore the middle character, and compare the remaining halves. If the frequency of each character in the first half is equal to the frequency of each character in the second half, then the string is considered a Lapindrome.

Sample Input/Output:
Enter a string:
abccba
Output:
The entered string is a Lapindrome.

Enter a string:
coding
Output:
The entered string is not a Lapindrome.
*/

import java.util.Scanner;

public class Lapindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String a = in.next();
        int l = a.length();
        String first = a.substring(0, l / 2);
        String second = l % 2 == 1 ? a.substring((l / 2) + 1, l) : a.substring(l / 2, l);

        // Check if the string is lapindrome or not
        boolean isLapindrome = true;
        int[] count = new int[26]; // assuming only lowercase alphabets are present
        for (int i = 0; i < first.length(); i++) {
            count[first.charAt(i) - 'a']++;
            count[second.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                isLapindrome = false;
                break;
            }
        }

        if (isLapindrome) {
            System.out.println("The entered string is a Lapindrome.");
        } else {
            System.out.println("The entered string is not a Lapindrome.");
        }
    }
}
