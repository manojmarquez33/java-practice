/*
Question:
Write a Java program to generate the sequence of Pell-Lucas numbers. The Pell-Lucas sequence starts with 2, 2, and each subsequent term is computed as twice the previous term plus the term before that.

Sample Output:
The sequence of Pell-Lucas numbers begins:
2, 2, 6, 14, 34, 82, 198, 478, 1154
*/


import java.util.Scanner;

public class Pell_Lucas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Pell-Lucas sequence:");
        int n = in.nextInt();
        int t1 = 2; // First term
        int t2 = 2; // Second term

        System.out.println("The sequence of Pell-Lucas numbers:");
        System.out.print(t1 + ", " + t2);

        for (int i = 2; i < n; i++) {
            int temp = (2 * t2) + t1;
            System.out.print(", " + temp);
            t1 = t2;
            t2 = temp;
        }
    }
}
