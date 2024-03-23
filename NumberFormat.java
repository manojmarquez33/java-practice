import java.util.Scanner;

public class NumberFormat {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.println("Enter number n and no.space and decimal place");
                 double a = in.nextDouble();
                 int dig = in.nextInt(),space = in.nextInt();

            System.out.println("--------------Method 1------------");
                 for(int i=0;i<=space;i++){
                      System.out.print(" ");
                  }
                 System.out.printf("%.3f",a);

            System.out.println("\n--------------Method 2 best------------");

                 System.out.print(String.format("%"+space+"."+dig+"f",a));


    }
}
