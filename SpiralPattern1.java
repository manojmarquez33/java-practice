/*
5
9 9 9 9 9 9 9 9 9
9 8 8 8 8 8 8 8 9
9 8 7 7 7 7 7 8 9
9 8 7 6 6 6 7 8 9
9 8 7 6 5 6 7 8 9
9 8 7 6 6 6 7 8 9
9 8 7 7 7 7 7 8 9
9 8 8 8 8 8 8 8 9
9 9 9 9 9 9 9 9 9
*/
import java.util.Scanner;

public class SpiralPattern1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),row=0,col=0,i,j,num=0,start=-1*(n-1),end=n;

        for(i=start;i<end;i++,System.out.println(),row++)
            for (j=start;j<end;j++,col++)
                System.out.print(Math.max(Math.abs(i)+n,Math.abs(j)+n)+" ");

//        for(i=start;i<end;i++,System.out.println(),row++)
//            for (j=start;j<end;j++,col++)
//                System.out.print(Math.abs(Math.min(Math.abs(i)-n,Math.abs(j)-n))+" ");

    }
}


/// st=1,en=2*n-1