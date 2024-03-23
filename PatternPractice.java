import java.util.Scanner;

public class PatternPractice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int i=0,j=0,start=-1*(n-1),end=n+1;

        for (i=start;i<end;i++, System.out.println())
            for (j=start;j<end;j++)
                System.out.print(Math.abs(Math.max(i-1,j-1))+" ");
    }
}
