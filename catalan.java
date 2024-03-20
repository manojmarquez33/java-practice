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
