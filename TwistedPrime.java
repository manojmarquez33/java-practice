import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        int count = 0;
        int num = 2; // Start checking from 2

        while (true) {
            if (prime(num) == 1 && prime(reverse(num)) == 1) {
                count++;
                if (count == n) {
                    System.out.println("The " + n + "th twisted prime number is: " + num);
                    break;
                }
            }
            num++;
        }
    }

    public static int prime(int n) {
        if (n <= 1)
            return 0;
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
//dig = (int)c-48;
// num = num*10+dig