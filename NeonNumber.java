import java.util.Scanner;

/// neon numbers  0,1,9
public class NeonNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 0 || n == 1 || n == 9) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
            ;
        }

    }
}