/*
The first few Catalan numbers for n = 0, 1, 2, 3, … are : 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862,
*/
import java.util.Scanner;

public class catalan {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;fact*=i);
        return fact;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int f = sc.nextInt();
        for(int i=1; i<=f;i++){
            int cat = fact(2*i)/fact(i+1)*fact(i);
            System.out.println(cat);
        }
    }
}
