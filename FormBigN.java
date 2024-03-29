/**
    Question:
    Write a Java program that takes an integer as input and rearranges its digits to form the largest possible number.
    Implement the program in the main method of the 'FormBigN' class. The program should perform the following steps:

    1. Read an integer 'n' from the user input.
    2. Calculate the number of digits 'l' in 'n'.
    3. Initialize an integer array 'a' of size 10 to store the frequency of each digit.
    4. Iterate over each digit of 'n' and update the frequency count in array 'a'.
    5. Construct the largest number by iterating over array 'a' in reverse order (from 9 to 0').
    6. Print the constructed largest number.

    Sample Input/Output:
    Input: 53792
    Output: 97532

    Input: 1234567890
    Output: 9876543210

    Input: 11111
    Output: 11111
**/

import java.util.Scanner;

public class FormBigN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextInt(),large = 0;
        int l = (int)Math.log10(n)+1;
        int a[] = new int[10];

        for(int i=0;i<l;i++){
            a[(int)(n%10)]+=1; //
            n/=10;
        }


        for (int i=9;i>-1;i--){
            while(a[i]>0){
                large*=10;
                large+=i;
                a[i]--;
            }
        }


        System.out.println(large);
    }
}

