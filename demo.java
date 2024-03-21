import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        float e = 15.2f;
        System.out.println("Floor :");
        System.out.println(((int)e+1)-1);
        System.out.println("Ceil is :");
        System.out.println(e-(int)e == 0 ? ((int)e) : (int)e+1);
 
    }
}