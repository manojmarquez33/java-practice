import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                if (prime(i) == 1 && prime(reverse(i)) == 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    public static int prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static int reverse(int n) {
        int rev = 0, rem;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
}
