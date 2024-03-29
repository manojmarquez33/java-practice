/*
Question:
Write a Java program to generate the Tribonacci sequence up to a specified number 'n' using two different approaches. Implement two methods: one using temporary variables and another using three variables to generate the sequence. The program should take an integer input 'n' and output the Tribonacci sequence up to 'n' for both approaches.

Sample Input/Output:
Enter number N:
10
------------------Approach 1----------------------
0 0 1 1 2 4 7 13 24 44
------------------Approach 2----------------------
0 0 1 1 2 4 7 13 24 44
*/

import java.util.Scanner;

public class Tribbonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),t1=0,t2=0,t3=1,temp1,temp2,temp3,i,j,n1=0,n2=0,n3=1;
        System.out.println("Enter number N :");

        System.out.print("------------------Approach 1----------------------\n");
        if(n==0 || n==1 || n==2)
            System.out.println(1);
        System.out.print(t1+" "+t2+" "+t3+" ");
        for (i=t1;i<n-3; System.out.print(t1+t2+t3+" "),temp1=t1,temp2=t2,t1=t2,t2=t3,t3+=temp1+temp2,i++);
//        System.out.println("\n"+i);

        System.out.print("------------------Approach 2----------------------\n");
        System.out.print(n1+" "+n2+" "+n3+" ");
        for (j=n1;j<n-3;temp3=n1+n2+n3,System.out.print(temp3+" "),n1=n2,n2=n3,n3=temp3,j++);
//        System.out.println("\n"+j);

    }
}
