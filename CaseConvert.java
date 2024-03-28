/*
Question:
Write a Java program to convert characters based on user input. The program should prompt the user to choose from
different conversion patterns and output the converted characters accordingly.

Choose from the following options:
1. Convert characters to uppercase (e.g., ABCD)
2. Convert characters to lowercase (e.g., abcd)
3. Convert characters to alternating case (e.g., AaBb)
4. Convert characters to alternating case starting with lowercase (e.g., aAbB)
5. Convert characters to uppercase with every second character shifted by one position (e.g., AbCd)
6. Convert characters to lowercase with every second character shifted by one position (e.g., aBcD)

Sample Input/Output:
Choose:
1.ABCD
2.abcd
3.AaBb
4.aAbB
5.AbCd
6.aBcD
1

Output:
ABCDEFGHIJKLMNOPQRSTUVWXYZ

Explanation:
For option 1, all characters are converted to uppercase.
*/

// Press above to view full question

import java.util.Scanner;

public class CaseConvert {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Choose \n 1.ABCD\n 2.abcd\n 3.AaBb\n 4.aAbB\n 5.AbCd\n 6.aBcD");
        int a = in.nextInt();
        char ch;
        switch (a) {
            case 1:
                for( ch='A';ch<='Z';System.out.print(ch),ch++);
                break;
            case 2:
                for( ch='a';ch<='z';System.out.print(ch),ch++);
                break;
            case 3:
                for( ch='A';ch<='Z';System.out.print(ch+""+(char)(ch+32)),ch++);
                break;
            case 4:
                for( ch='A';ch<='Z';System.out.print((char)(ch+32)+""+ch),ch++);
                break;
            case 5:
                for(ch='A';ch<='Z';System.out.print(ch+""+(char)(ch+33)),ch+=2);
                break;
            case 6:
                for(ch='a';ch<='z';System.out.print(ch+""+(char)(ch-31)),ch+=2);
                break;

        
            default:
                break;
        }
    }
}
