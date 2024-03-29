/*
5
5 4 3 2 1 2 3 4 5
4 4 3 2 1 2 3 4 4
3 3 3 2 1 2 3 3 3
2 2 2 2 1 2 2 2 2
1 1 1 1 1 1 1 1 1
2 2 2 2 1 2 2 2 2
3 3 3 2 1 2 3 3 3
4 4 3 2 1 2 3 4 4
5 4 3 2 1 2 3 4 5
*/
import java.util.Scanner;

public class SpiralPattern2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),row=0,col=0,i,j,num=0,start = -1*(n-1),end=n;

        for(i=start;i<end;i++,System.out.println(),row++)
            for (j=start;j<end;j++,col++)
                System.out.print(Math.min(Math.abs(i)+1,Math.abs(j)+1)+" ");




    }
}
