/**
 5
 5 4 3 2 1 0 1 2 3 4
 4 4 3 2 1 0 1 2 3 4
 3 3 3 2 1 0 1 2 3 4
 2 2 2 2 1 0 1 2 3 4
 1 1 1 1 1 0 1 2 3 4
 0 0 0 0 0 0 1 2 3 4
 1 1 1 1 1 1 1 2 3 4
 2 2 2 2 2 2 2 2 3 4
 3 3 3 3 3 3 3 3 3 4
 4 4 4 4 4 4 4 4 4 4
 */

import java.util.Scanner;
public class SpiralPattern7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int i=0,j=0,start=-1*(n-1),end=n+1;

        for (i=start;i<end;i++, System.out.println())
            for (j=start;j<end;j++)
                System.out.print(Math.abs(Math.max(i-1,j-1))+" ");
    }
}
