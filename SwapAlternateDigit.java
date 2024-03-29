import java.util.Scanner;

public class SwapAlternateDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = swapAlternateDigits(n);
        System.out.println("Number after swapping alternate digits: " + result);
    }

    public static int swapAlternateDigits(int n) {
        int result = 0;
        int position = 1;

        while (n > 0) {
            int digit1 = n % 10;
            n /= 10;

            if (n > 0) {
                int digit2 = n % 10;
                n /= 10;

                result += position * digit2;
                result += position * 10 * digit1;
                position *= 100;
            } else {
                result += position * digit1;
                position *= 10;
            }
        }

        return result;
    }
}
