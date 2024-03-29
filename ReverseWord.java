
/*
Question:
Write a Java program to reverse the words in a given string without using any built-in reverse function. Implement a method that takes a string input and reverses each word individually while keeping the order of words intact.

Sample Input/Output:
Input:
Hello World Java Program
Output:
olleH dlroW avaJ margorP
*/

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Reverse(input);
    }

    public static void Reverse(String input) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            System.out.print(String.valueOf(chars));
            if (i < words.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
