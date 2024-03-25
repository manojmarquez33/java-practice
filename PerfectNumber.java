import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),i,sum=1;

        for (i=2;i<Math.sqrt(n);i++){
            if(n%i==0) {
                sum += i;
                sum = sum+ n/i;
            }

        }
        System.out.println(sum==n ? "yes" : "no");
    }
}


