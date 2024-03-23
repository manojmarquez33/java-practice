import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next(),b=in.next();
        a=a+a;
        System.out.println(a.contains(b) && a.length()-b.length()==b.length() ? "yes" : "no");
        System.out.println(a.length()+" "+b.length());
    }
}
