import java.sql.SQLOutput;
import java.util.Scanner;

public class Panlindrome_169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
//        reverse(n);
        while(true){
            if(polindrome(n) && n>10){
                System.out.print(n);
                break;
            }
            int num1 = reverse(n);
            n = num1+n;
        }

    }
    public static int reverse(int n){
        int rev = 0;
        while (n>0) {
            rev *=10;
            rev+= n%10;
            n/=10;
        }
        return rev;
    }
    public static boolean polindrome(int num){
        int l  = (int)Math.log10(num)+1,i;
        char c[] = Integer.toString(num).toCharArray();

        for (i=0;i<=c.length/2;i++,l--){
          if(c[i]!=c[l]) {
                System.out.println(c[i]+" "+c[l]);
                return false;
            }
            System.out.println(i+" "+l);;

        }
        //System.out.println(c[i]+" "+c[l]);;
        return true;
    }
}
