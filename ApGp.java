/*
Question:
Write a Java program that generates either an arithmetic progression (AP) or a geometric progression (GP) based
on user input. The program should prompt the user to enter the starting value, ending value, and step size,followed by
selecting either an arithmetic progression or a geometric progression. Depending on the user's choice, the program
should output the progression accordingly.

Sample Input/Output:
Enter start, end, and step
Choose 1 or 2
1. Arithmetic Progression
2. Geometric progression
3 15 2 1

Choose 1 or 2: 1
3 5 7 9 11 13 15
Arithmetic Progression End-------------------------------------

Explanation:
For the input (3, 15, 2, 1), the program generates an arithmetic progression
starting from 3 with a step of 2, ending at 15. The output shows the numbers
in the arithmetic progression, followed by a message indicating the end of the
arithmetic progression.
*/

import java.util.Scanner;

public class ApGp {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter start,end & step \n Choose 1 or 2 \n 1.Arithmetci Progession \n 2.Geometric progression");
        int start = in.nextInt(),end=in.nextInt(),step=in.nextInt(),opt=in.nextInt(),i,j;

        switch (opt) {
            case 1:
                for(i=start;i<=end;System.out.print(i+" "),i+=step);
                System.out.println("\nArithmetic Progression End-------------------------------------");
                break;
            case 2:
                for(i=start;i<=end;System.out.print(i+" "),i*=step);
                System.out.println("\nGeometric Progression End-------------------------------------");
                break;

            default:
                break;
        }

    }
}
