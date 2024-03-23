import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),i,j,num=1;

        for (i=0;i<=n/2;i++,System.out.println(),num+=n)
            for (j=0;j<n;j++,System.out.printf("%02d ",num),num++);
        //System.out.println(num);
        num=num-2*n-n;
        for (i=0;i<n/2;i++,System.out.println(),num-=((2*n)+n))
            for (j=0;j<n;j++,System.out.printf("%02d",num),num++);


    }
}
