import java.util.Scanner;

public class AmakableNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum1 =1,sum2=1;
        for (int i=2;i<Math.sqrt(n1);i++){
            if(n1 % i==0)
                sum1+=i;
                sum1+= n1/i;
        }

        for (int i=2;i<Math.sqrt(n2);i++){
            if(n2 % i==0)
                sum2+=i;
                sum2+= n2/i;
        }

        System.out.print((sum1==n2 && sum2==n1) ? "yes" : "no");

    }
}
