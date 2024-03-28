import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        // 1234 // 4123 4*1000+1*100+2*10+3*1
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rotation = in.nextInt();
        int l  = (int)Math.log10(n)+1;

        for (int i = 0;i<rotation;i++){
            int last = n%10; // 4
            n = n/10; // 123
            int first = (int) ((int)last* Math.pow(10,l-1)); //  4^ 1000
            n+=first;
        }
        System.out.println(n);
    }
}
